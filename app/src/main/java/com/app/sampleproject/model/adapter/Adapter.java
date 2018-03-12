package com.app.sampleproject.model.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.sampleproject.R;
import com.app.sampleproject.model.pojo.Model;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by MY PC on 01-Sep-17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    /*
//        Initilize

        private LinearLayoutManager mLinearLayoutManager;
        private int mStart=0,mCount=0;

//        Paste code to set method

        mLinearLayoutManager = new LinearLayoutManager(this);
        recycler_view.setLayoutManager(mLinearLayoutManager);
        recycler_view.setItemAnimator(new DefaultItemAnimator());
        recycler_view.setAdapter(mAdapter);
        recycler_view.setLayoutManager(mLinearLayoutManager);
        recycler_view.addOnScrollListener(new EndlessRecyclerViewScrollListener( mLinearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                mStart=mStart+20;
                mController.get_galleryAPI(mStart,mCount);
            }
        });

     */

    private List<Model> mModelList = new ArrayList<>();
    private Context mContext;

    class MyViewHolder extends RecyclerView.ViewHolder {

        MyViewHolder(View view) {
            super(view);
            mContext = view.getContext();
            ButterKnife.bind(this,view);
        }
    }

    public void addData(Model model) {
        mModelList.add(model);
        notifyDataSetChanged();
    }

//    private void removeData(int position) {
//        mModelList.remove(position);
//        notifyDataSetChanged();
//    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_adapter, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
    }

    @Override
    public int getItemCount() {
//        return mModelList.size();
        return 10;
    }
}