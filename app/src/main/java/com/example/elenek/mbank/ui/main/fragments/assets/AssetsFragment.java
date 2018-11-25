package com.example.elenek.mbank.ui.main.fragments.assets;

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
import com.example.elenek.mbank.ui.main.fragments.transactions.OperationRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AssetsFragment extends Fragment {

    private RecyclerView rvAssets;
    private AssetRecyclerAdapter assetRecyclerAdapter;
    private MBankDataService service;

    public static AssetsFragment newInstance() {
        AssetsFragment fragment = new AssetsFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_assets, container, false);

        service = RetrofitInstance.getRetrofitInstance().create(MBankDataService.class);

        rvAssets = view.findViewById(R.id.fragment_assets_rv_assets);
        rvAssets.setLayoutManager(new LinearLayoutManager(getContext()));
        assetRecyclerAdapter = new AssetRecyclerAdapter();
        rvAssets.setAdapter(assetRecyclerAdapter);

        getData();

        return view;
    }

    void getData() {
        service.getAssets().enqueue(new Callback<AssetsAndLiabilities>() {
            @Override
            public void onResponse(Call<AssetsAndLiabilities> call, Response<AssetsAndLiabilities> response) {
                if(response.isSuccessful()) {
                    List<Object> data = new ArrayList<Object>();

                    addToData("ბონუს ქულები", response.body().getPoints(), data);
                    addToData("აქტივები", response.body().getAssets(), data);
                    addToData("ვალდებულებები", response.body().getLiabilities(), data);
                    addToData("ხელმისაწვდომი თანხა", response.body().getAvailableAmounts(), data);

                    assetRecyclerAdapter.setData(data);
                }
            }

            private void addToData(String dataType, Object currData, List<Object> data) {
                List<AssetsAndLiabilities.Product> currDataList =
                        (List<AssetsAndLiabilities.Product>) currData;
                if(currDataList.size() > 0 ) {
                    data.add(dataType);
                    data.addAll(currDataList);
                }
            }

            @Override
            public void onFailure(Call<AssetsAndLiabilities> call, Throwable t) {
                Log.d("assets", t.getMessage());
            }
        });
    }
}
