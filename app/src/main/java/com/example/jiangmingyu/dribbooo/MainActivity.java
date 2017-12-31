package com.example.jiangmingyu.dribbooo;

import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v4.app.Fragment;

import com.example.jiangmingyu.dribbooo.view.bucket_list.BucketListFragment;
import com.example.jiangmingyu.dribbooo.view.shot_list.ShotListFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView (R.id.drawer) NavigationView navigationView;
    @BindView (R.id.drawer_layout) DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        setupDrawer();

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, ShotListFragment.newInstance())
                    .commit();
        }


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupDrawer() {
        drawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                drawerLayout,          /* DrawerLayout object */
                R.string.open_drawer,         /* "open drawer" description */
                R.string.close_drawer         /* "close drawer" description */
        );

        drawerLayout.setDrawerListener(drawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.isChecked()){
                    drawerLayout.closeDrawers();
                    return true;
                }
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.drawer_item_home:
                        Toast.makeText(MainActivity.this, "home clicked", Toast.LENGTH_SHORT).show();
                        fragment = ShotListFragment.newInstance();
                        setTitle(getString(R.string.home_name));
                        break;
                    case R.id.drawer_item_likes:
                        Toast.makeText(MainActivity.this, "likes clicked", Toast.LENGTH_SHORT).show();
                        fragment = ShotListFragment.newInstance();
                        setTitle(R.string.drawer_menu_likes);
                        break;
                    case R.id.drawer_item_buckets:
                        Toast.makeText(MainActivity.this, "buckets clicked", Toast.LENGTH_SHORT).show();
                        fragment = BucketListFragment.newInstance();
                        setTitle(R.string.drawer_menu_buckets);
                        break;
                }

                drawerLayout.closeDrawers();
                if (fragment != null) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, fragment)
                            .commit();
                    return true;
                }
                return true;
            }
        });
    }
}
