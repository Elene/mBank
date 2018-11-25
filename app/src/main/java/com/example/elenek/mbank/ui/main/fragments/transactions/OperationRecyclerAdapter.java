package com.example.elenek.mbank.ui.main.fragments.transactions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elenek.mbank.R;

import java.util.ArrayList;
import java.util.List;

public class OperationRecyclerAdapter extends RecyclerView.Adapter<OperationViewHolder> {

    private List<TransactionsInfo.Operation> data = new ArrayList<>();

    @NonNull
    @Override
    public OperationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_transaction,
                viewGroup, false);

        return new OperationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OperationViewHolder operationViewHolder, int i) {
        operationViewHolder.setData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<TransactionsInfo.Operation> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
