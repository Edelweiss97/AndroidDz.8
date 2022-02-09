package com.example.androiddz8.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz8.databinding.ItemFirstRecyclerViewBinding;
import com.example.androiddz8.xml.ModelFirstFr;

import java.util.ArrayList;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.ViewHolder> {
    private ArrayList<ModelFirstFr> list;

    public void updateData(ArrayList<ModelFirstFr> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemFirstRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemFirstRecyclerViewBinding binding;

        public ViewHolder(@NonNull ItemFirstRecyclerViewBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(ModelFirstFr modelFirstFr) {
            binding.imageFamily.setImageResource(modelFirstFr.getImageFamily());
            binding.nameFamily.setText(modelFirstFr.getNameFamily());
        }
    }
}
