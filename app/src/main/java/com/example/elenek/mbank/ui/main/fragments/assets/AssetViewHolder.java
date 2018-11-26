package com.example.elenek.mbank.ui.main.fragments.assets;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.elenek.mbank.R;

public class AssetViewHolder extends RecyclerView.ViewHolder  {
    private TextView tvProductName;
    private TextView tvBaseAmount;

    public AssetViewHolder(@NonNull View itemView) {
        super(itemView);

        tvProductName = itemView.findViewById(R.id.cell_asset_product_name);
        tvBaseAmount = itemView.findViewById(R.id.cell_asset_amount_base);
    }

    public void setData(AssetsAndLiabilities.Product product){
        Log.d("assets", "Name " + product.getProductName());
        tvProductName.setText(product.getProductName());
        tvBaseAmount.setText(product.getAmountBase().toString());
    }
}
