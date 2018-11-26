package com.example.elenek.mbank.ui.main.fragments.transactions;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.network.RetrofitInstance;
import com.example.elenek.mbank.service.MBankDataService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TransactionsFragment extends Fragment {
    private RecyclerView rvOperations;
    private TextView tvIncome;
    private TextView tvOutcome;
    private OperationRecyclerAdapter operationRecyclerAdapter;

    private MBankDataService service;

    public static TransactionsFragment newInstance() {
        TransactionsFragment fragment = new TransactionsFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transactions, container, false);

        service = RetrofitInstance.getRetrofitInstance().create(MBankDataService.class);

        tvIncome = view.findViewById(R.id.fragment_transactions_tv_income_value);
        tvOutcome = view.findViewById(R.id.fragment_transactions_tv_outcome_value);

        rvOperations = view.findViewById(R.id.fragment_transactions_rv_operations);
        rvOperations.setLayoutManager(new LinearLayoutManager(getContext()));
        operationRecyclerAdapter = new OperationRecyclerAdapter();
        rvOperations.setAdapter(operationRecyclerAdapter);

        getOperations();

        return view;
    }

    private void getOperations() {
        service.getTransactions().enqueue(new Callback<TransactionsInfo>() {
            @Override
            public void onResponse(Call<TransactionsInfo> call, Response<TransactionsInfo> response) {
                if(response.isSuccessful()) {
                    tvIncome.setText(Double.toString(response.body().getIncomeSum()));
                    tvOutcome.setText(Double.toString(response.body().getOutcomeSum()));
                    operationRecyclerAdapter.setData(response.body().getMyOperations());
                }
            }

            @Override
            public void onFailure(Call<TransactionsInfo> call, Throwable t) {
            }
        });
    }
}
