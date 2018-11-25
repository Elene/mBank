package com.example.elenek.mbank.ui.main.fragments.transactions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.utils.DateUtils;

public class OperationViewHolder extends RecyclerView.ViewHolder  {
    private TextView tvMerchantName;
    private TextView tvTransactionType;
    private TextView tvDate;
    private TextView tvAmount;

    public OperationViewHolder(@NonNull View itemView) {
        super(itemView);

        tvMerchantName = itemView.findViewById(R.id.cell_transaction_tv_merchant_name);
        tvTransactionType = itemView.findViewById(R.id.cell_transaction_tv_transaction_type);
        tvDate = itemView.findViewById(R.id.cell_transaction_tv_date);
        tvAmount = itemView.findViewById(R.id.cell_transaction_tv_amount);
    }

    public void setData(TransactionsInfo.Operation transaction){
        tvMerchantName.setText(transaction.getMerchantName());
        tvTransactionType.setText(transaction.getEntryGroupName());
        tvDate.setText(DateUtils.getDate(transaction.getDate()));
        tvAmount.setText(transaction.getAmount().toString());
    }
}
