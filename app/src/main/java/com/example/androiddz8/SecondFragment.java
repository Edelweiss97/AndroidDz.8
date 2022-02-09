package com.example.androiddz8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androiddz8.adapter.FragmentAdapter;
import com.example.androiddz8.databinding.FragmentSecondBinding;
import com.example.androiddz8.xml.ModelFirstFr;

import java.util.ArrayList;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private RecyclerView recyclerView;
    private FragmentAdapter adapter;
    private ArrayList<ModelFirstFr> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = binding.containerRecyclerViewSf;
        adapter = new FragmentAdapter();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<ModelFirstFr> addList() {
        list = new ArrayList<>();
        list.add(new ModelFirstFr(R.drawable.granny,getString(R.string.granny)));
        list.add(new ModelFirstFr(R.drawable.friend,getString(R.string.friend)));
        list.add(new ModelFirstFr(R.drawable.brother,getString(R.string.brother)));
        list.add(new ModelFirstFr(R.drawable.dad, getString(R.string.dad)));
        list.add(new ModelFirstFr(R.drawable.mom, getString(R.string.mom)));
        list.add(new ModelFirstFr(R.drawable.grandfather, getString(R.string.grandfather)));
        list.add(new ModelFirstFr(R.drawable.sister,getString(R.string.sister)));
        list.add(new ModelFirstFr(R.drawable.friend_girl,getString(R.string.friend_girl)));
        return list;
    }
}