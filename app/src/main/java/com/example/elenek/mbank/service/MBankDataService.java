package com.example.elenek.mbank.service;

import com.example.elenek.mbank.ui.main.fragments.assets.AssetsAndLiabilities;
import com.example.elenek.mbank.ui.main.fragments.cards.model.Card;
import com.example.elenek.mbank.ui.main.fragments.profile.model.ClientInfo;
import com.example.elenek.mbank.ui.login.SessionInfo;
import com.example.elenek.mbank.ui.main.fragments.transactions.TransactionsInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MBankDataService {
    @GET("api/Clients/Login/{username}/{password}")
    Call<SessionInfo> getSessionInfo(@Path("username") String username,
                                     @Path("password") String password);

    @GET("api/Clients/ClientInfo")
    Call<ClientInfo> getClientInfo();

    @GET("api/Products/Transactions")
    Call<TransactionsInfo> getTransactions();

    @GET("api/Products/AssetsAndLiabilities")
    Call<AssetsAndLiabilities> getAssets();

    @GET("api/Products/Cards")
    Call<List<Card>> getCards();

    
}
