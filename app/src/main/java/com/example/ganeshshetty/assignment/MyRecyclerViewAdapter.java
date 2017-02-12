package com.example.ganeshshetty.assignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Nilanchala Panigrahy on 10/25/16.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.CustomViewHolder> {
    private List<Choice> userList;
    private Context mContext;

    public MyRecyclerViewAdapter(Context context, List<Choice> melaclassList) {
        this.userList = melaclassList;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row,null );
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        final Choice user = userList.get(i);


        //Setting text view title
        customViewHolder.textView.setText(user.getUser_name());
        Picasso.with(mContext).load(user.getUser_image())
                .error(R.drawable.flash)
                .placeholder(R.drawable.flash)
                .into(customViewHolder.actionImage);

    }

    @Override
    public int getItemCount() {
        return (null != userList ? userList.size() : 0);
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;
        protected ImageView actionImage;

        public CustomViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.title);
            this.actionImage=(ImageView) view.findViewById(R.id.actionbutton);
        }
    }
}