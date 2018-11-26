package com.example.elenek.mbank.ui.main.fragments.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.ui.main.fragments.cards.model.Card;
import com.example.elenek.mbank.utils.DateUtils;

public class CardViewHolder extends RecyclerView.ViewHolder  {
    private TextView tvCardHolder;
    private TextView tvValidity;
    private TextView tvCardNumber;
    private TextView tvName;
    private ImageView ivType;
    private RelativeLayout rvCard;


    public CardViewHolder(@NonNull View itemView) {
        super(itemView);

        tvCardHolder = itemView.findViewById(R.id.cell_card_tv_card_holder);
        tvValidity = itemView.findViewById(R.id.cell_card_tv_validity);
        tvCardNumber = itemView.findViewById(R.id.cell_card_tv_card_number);
        tvName = itemView.findViewById(R.id.cell_card_tv_name);
        ivType = itemView.findViewById(R.id.cell_card_iv_type);
        rvCard = itemView.findViewById(R.id.cell_card_rl_card);

    }

    private int getCardTypeResource(String type){
        if(type.equals("VISA"))
            return R.drawable.card_icon_visa_border_single;
        if(type.equals("AMEX"))
            return R.drawable.card_icon_amex_single;
        return 0;
    }

    private int getCardBackgroundResource(String type){
        if(type.equals("AMEXGCG"))
            return R.drawable.account_background_amex_green;
        if(type.equals("GOLD-IPOPW"))
            return R.drawable.account_background_visa_gold;
        if(type.equals("SOLOP_CARD"))
            return R.drawable.account_background_solo;
        return 0;
    }

    public void setData(Card card){
        tvCardHolder.setText(card.getCardHolder());
        tvName.setText(card.getCardType());
        tvValidity.setText(DateUtils.getDateWithoutYear(card.getExpDate()));
        tvCardNumber.setText("XXXX XXXX XXXX " + card.getLastFour());
        ivType.setImageResource(getCardTypeResource(card.getCardClass()));
        rvCard.setBackgroundResource(getCardBackgroundResource(card.getCardType()));
    }
}
