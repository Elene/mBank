package com.example.elenek.mbank.ui.main.fragments.assets;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.ui.main.fragments.transactions.OperationViewHolder;
import com.example.elenek.mbank.ui.main.fragments.transactions.TransactionsInfo;

import java.util.ArrayList;
import java.util.List;

public class AssetRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int HEADER = 0;
    private static final int ASSET = 1;

    private List<Object> data = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        if(viewType == HEADER) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_asset_header,
                    viewGroup, false);
            return new AssetHeaderViewHolder(view);
        } else {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_asset,
                    viewGroup, false);
            return new AssetViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if(data.get(i) instanceof String) {
            ((AssetHeaderViewHolder) viewHolder).setTitle((String)data.get(i));
        } else {
            ((AssetViewHolder) viewHolder).setData((AssetsAndLiabilities.Product)data.get(i));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Object> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (data.get(position) instanceof String) {
            return HEADER;
        } else {
            return ASSET;
        }
    }
}
