package com.example.jiangmingyu.dribbooo.view.bucket_list;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.jiangmingyu.dribbooo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jiangmingyu on 2018/1/5.
 */

public class NewBucketDialogFragment extends DialogFragment {

    public static final String KEY_BUCKET_NAME = "bucket_name";
    public static final String KEY_BUCKET_DESCRIPTION = "bucket_description";

    @BindView(R.id.new_bucket_name) EditText bucket_name;
    @BindView(R.id.new_bucket_description) EditText bucket_description;

    public static final String TAG = "NewBucketDialogFragment";

    public static NewBucketDialogFragment newInstance(){return new NewBucketDialogFragment();}

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_new_bucket, null);
        ButterKnife.bind(this, view);

        return new AlertDialog.Builder(getContext())
                .setView(view)
                .setTitle(R.string.new_bucket)
                .setPositiveButton(getString(R.string.bucket_create), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent result = new Intent();
                        result.putExtra(KEY_BUCKET_NAME, bucket_name.getText().toString());
                        result.putExtra(KEY_BUCKET_DESCRIPTION, bucket_description.getText().toString());
                        getTargetFragment().onActivityResult(BucketListFragment.REQ_CODE_NEW_BUCKET, Activity.RESULT_OK, result);
                        dismiss();
                    }
                })
                .setNegativeButton(R.string.bucket_cancel, null)
                .show();
    }
}
