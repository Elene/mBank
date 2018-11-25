package com.example.elenek.mbank.ui.main.fragments.cards;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.network.RetrofitInstance;
import com.example.elenek.mbank.service.MBankDataService;
import com.example.elenek.mbank.ui.main.fragments.assets.AssetRecyclerAdapter;
import com.example.elenek.mbank.ui.main.fragments.profile.ProfileFragment;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CardsFragment extends Fragment {
    private RecyclerView rvCards;
    private CardRecyclerAdapter cardRecyclerAdapter;
    private MBankDataService service;

    public static CardsFragment newInstance() {
        CardsFragment fragment = new CardsFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cards, container, false);

        service = RetrofitInstance.getRetrofitInstance().create(MBankDataService.class);

        rvCards = view.findViewById(R.id.fragment_cards_rv_cards);
        rvCards.setLayoutManager(new LinearLayoutManager(getContext()));
        cardRecyclerAdapter = new CardRecyclerAdapter();
        rvCards.setAdapter(cardRecyclerAdapter);

        getCards();

        return view;
    }

    private void getCards() {
        service.getCards().enqueue(new Callback<List<Card>>() {
            @Override
            public void onResponse(Call<List<Card>> call, Response<List<Card>> response) {
                if(response.isSuccessful()) {
                    cardRecyclerAdapter.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Card>> call, Throwable t) {

            }
        });
    }
}
