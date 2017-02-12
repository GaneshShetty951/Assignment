package com.example.ganeshshetty.assignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    RecyclerView mRecyclerView1,mRecyclerView2,mRecyclerView3;
    private MyRecyclerViewAdapter adapter1,adapter2,adapter3;
    ArrayList<Choice> choiceArrayList1,choiceArrayList2,choiceArrayList3;

    public ListFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView1 = (RecyclerView) view.findViewById(R.id.recycler_view_user1);
        mRecyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view_user2);
        mRecyclerView3 = (RecyclerView) view.findViewById(R.id.recycler_view_user3);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        choiceArrayList1=new ArrayList<Choice>();
        choiceArrayList2=new ArrayList<Choice>();
        choiceArrayList3=new ArrayList<Choice>();
        parseResult();
        mRecyclerView1.setAdapter(adapter1);
        mRecyclerView2.setAdapter(adapter2);
        mRecyclerView3.setAdapter(adapter3);

        return view;
    }
    private void parseResult() {

        Choice choice1 = new Choice();
        choice1.setUser_name("Content 1");
        choice1.setUser_image(R.drawable.arrow);
        choiceArrayList2.add(choice1);

        Choice choice2 = new Choice();
        choice2.setUser_name("Content 2");
        choice2.setUser_image(R.drawable.arrow);
        choiceArrayList2.add(choice2);

        Choice choice3 = new Choice();
        choice3.setUser_name("Choice 1");
        choice3.setUser_image(R.drawable.copy);
        choiceArrayList2.add(choice3);

        Choice choice4 = new Choice();
        choice4.setUser_name("Content 3");
        choice4.setUser_image(R.drawable.arrow);
        choiceArrayList2.add(choice4);

        choiceArrayList3.add(new Choice(R.drawable.copy,"Choice 3"));

        adapter1 = new MyRecyclerViewAdapter(getContext(), choiceArrayList1);
        adapter2 = new MyRecyclerViewAdapter(getContext(), choiceArrayList2);
        adapter3 = new MyRecyclerViewAdapter(getContext(), choiceArrayList3);

    }
}
