package com.example.elenek.mbank.ui.main.fragments.assets;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.elenek.mbank.R;

public class AssetHeaderViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle;

    public AssetHeaderViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.cell_asset_header_tv_title);
    }

    public void setTitle(String title){
        tvTitle.setText(title);
    }

}
