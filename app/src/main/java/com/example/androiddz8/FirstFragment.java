package com.example.androiddz8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.androiddz8.adapter.FragmentAdapter;
import com.example.androiddz8.databinding.FragmentFirstBinding;
import com.example.androiddz8.xml.ModelFirstFr;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private RecyclerView recyclerView;
    private FragmentAdapter adapter;
    private ArrayList<ModelFirstFr> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    }

    private void initRecyclerView() {
        recyclerView = binding.containerRecyclerViewFf;
        adapter = new FragmentAdapter();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<ModelFirstFr> addList() {
        list = new ArrayList<>();
        list.add(new ModelFirstFr(R.drawable.dad, getString(R.string.dad)));
        list.add(new ModelFirstFr(R.drawable.mom, getString(R.string.mom)));
        list.add(new ModelFirstFr(R.drawable.grandfather, getString(R.string.grandfather)));
        list.add(new ModelFirstFr(R.drawable.granny,getString(R.string.granny)));
        list.add(new ModelFirstFr(R.drawable.sister,getString(R.string.sister)));
        list.add(new ModelFirstFr(R.drawable.brother,getString(R.string.brother)));
        list.add(new ModelFirstFr(R.drawable.friend,getString(R.string.friend)));
        list.add(new ModelFirstFr(R.drawable.friend_girl,getString(R.string.friend_girl)));
        return list;
    }
}