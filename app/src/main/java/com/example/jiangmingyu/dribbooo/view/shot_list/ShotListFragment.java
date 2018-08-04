package com.example.jiangmingyu.dribbooo.view.shot_list;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jiangmingyu.dribbooo.R;
import com.example.jiangmingyu.dribbooo.dribbble.Dribbble;
import com.example.jiangmingyu.dribbooo.model.Shot;
import com.example.jiangmingyu.dribbooo.view.base.SpaceItemDecoration;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jiangmingyu on 2017/12/29.
 */

public class ShotListFragment extends Fragment {

    @BindView(R.id.recycler_view) RecyclerView recyclerView;
    @BindView(R.id.swipe_refresh_container) SwipeRefreshLayout swipeRefreshLayout;

    private static final int COUNT_PER_PAGE = 12;

    private ShotListAdapter adapter;


    public static ShotListFragment newInstance() {
        return new ShotListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new SpaceItemDecoration(
                getResources().getDimensionPixelSize(R.dimen.spacing_medium)));

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //AsyncTaskCompat.executeParallel(new LoadShotTask(true));
                new LoadShotTask(true).execute();
            }
        });

        adapter = new ShotListAdapter(new ArrayList<Shot>(), new ShotListAdapter.LoadMoreListener() {
            @Override
            public void onLoadMore() {
                // this method will be called when the RecyclerView is displayed
                // page starts from 1
                new LoadShotTask(adapter.getDataCount() / COUNT_PER_PAGE + 1).execute();

            }
        });
        recyclerView.setAdapter(adapter);
    }

    private class LoadShotTask extends AsyncTask<Void, Void, List<Shot>> {

        int page;

        boolean refresh;

        public LoadShotTask(int page) {
            this.page = page;
        }

        public LoadShotTask(boolean refresh){this.refresh = refresh;}

        @Override
        protected List<Shot> doInBackground(Void... params) {
            // this method is executed on non-UI thread
            try {
                return refresh ? Dribbble.getShots(1 ) : Dribbble.getShots(page);
            } catch (IOException | JsonSyntaxException e) {
                e.printStackTrace();
                return null;
            }
        }


        @Override
        protected void onPostExecute(List<Shot> shots) {
            // this method is executed on UI thread!!!!
            if (shots != null) {
                if (refresh){
                    adapter.setData(shots);
                    swipeRefreshLayout.setRefreshing(false);
                }else{
                    if (shots.size() < COUNT_PER_PAGE) {
                        adapter.setShowLoading(false);
                    }
                    adapter.append(shots);
                    swipeRefreshLayout.setEnabled(true);
                }

            } else {
                Snackbar.make(getView(), "Error!", Snackbar.LENGTH_LONG).show();
            }
        }
    }
}
