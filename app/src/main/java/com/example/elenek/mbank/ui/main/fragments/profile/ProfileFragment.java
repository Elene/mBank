package com.example.elenek.mbank.ui.main.fragments.profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.elenek.mbank.R;
import com.example.elenek.mbank.network.RetrofitInstance;
import com.example.elenek.mbank.service.MBankDataService;
import com.example.elenek.mbank.ui.main.fragments.profile.model.Client;
import com.example.elenek.mbank.ui.main.fragments.profile.model.ClientInfo;
import com.example.elenek.mbank.utils.DateUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileFragment extends Fragment {
    private MBankDataService service;

    private TextView tvName;
    private TextView tvLastname;
    private TextView tvSex;
    private TextView tvBirthDate;
    private TextView tvProductName;
    private TextView tvPhone;
    private TextView tvAddress;
    private TextView tvEmail;

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        service = RetrofitInstance.getRetrofitInstance().create(MBankDataService.class);

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        findTextViews(view);

        getClientInfo();

        return view;
    }

    private void findTextViews(View view) {
        tvName = view.findViewById(R.id.fragment_profile_tv_name);
        tvLastname = view.findViewById(R.id.fragment_profile_tv_lastname);
        tvSex = view.findViewById(R.id.fragment_profile_tv_sex);
        tvBirthDate = view.findViewById(R.id.fragment_profile_tv_birthdate);
        tvProductName = view.findViewById(R.id.fragment_profile_tv_product_category);
        tvPhone = view.findViewById(R.id.fragment_profile_tv_phone);
        tvAddress = view.findViewById(R.id.fragment_profile_tv_address);
        tvEmail = view.findViewById(R.id.fragment_profile_tv_email);
    }

    private void getClientInfo() {
        service.getClientInfo().enqueue(new Callback<ClientInfo>() {
            @Override
            public void onResponse(Call<ClientInfo> call, Response<ClientInfo> response) {
                if(response.isSuccessful()) {
                    setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<ClientInfo> call, Throwable t) {

            }
        });
    }

    private void setData(ClientInfo clientInfo) {
        tvName.setText(clientInfo.getClient().getFirstName());
        tvLastname.setText(clientInfo.getClient().getLastName());
        tvSex.setText((clientInfo.getClient().getSex().equals("M")) ? "მამრობითი":"მდედრობითი");
        tvBirthDate.setText(DateUtils.getDate(clientInfo.getClient().getBirthDate()));
        tvProductName.setText(clientInfo.getClient().getClientCategory());
        tvPhone.setText(clientInfo.getClientPhones().get(0).getContact());
        tvAddress.setText(clientInfo.getClientAddresses().get(0).getStreet());
        tvEmail.setText(clientInfo.getClientMails().get(0).getContact());
    }
}
