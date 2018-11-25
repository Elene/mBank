package com.example.elenek.mbank.ui.main.fragments.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.ui.main.fragments.transactions.TransactionsInfo;

public class CardViewHolder extends RecyclerView.ViewHolder  {
    private TextView tvCardHolder;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);

        tvCardHolder = itemView.findViewById(R.id.cell_card_tv_card_holder);

    }

    public void setData(Card card){
        tvCardHolder.setText(card.getCardHolder());
    }
}
