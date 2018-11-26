package com.example.elenek.mbank.ui.main.fragments.cards.model;

import com.google.gson.annotations.SerializedName;

public class Card {
    @SerializedName("Id")
    private Long id;
    @SerializedName("CardId")
    private Integer cardId;
    @SerializedName("AcctKey")
    private Long accountKey;
    @SerializedName("ClientKey")
    private Integer clientKey;
    @SerializedName("CardClass")
    private String cardClass;
    @SerializedName("CardType")
    private String cardType;
    @SerializedName("ProductCode")
    private String productCode;
    @SerializedName("SubProductCode")
    private String subProductCode;
    @SerializedName("SubProductGroup")
    private String subProductGroup;
    @SerializedName("LastFour")
    private String lastFour;
    @SerializedName("CardHolder")
    private String cardHolder;
    @SerializedName("ExpDate")
    private Long expDate;
    @SerializedName("IsCardBlocked")
    private String isCardBlocked;
    @SerializedName("CardPan")
    private String cardPan;
    @SerializedName("CardForTypeDictionaryValue")
    private String cardForTypeDictionaryValue;
    @SerializedName("ProductGroup")
    private String productGroup;
    @SerializedName("ProductId")
    private Integer productId;
    @SerializedName("SubProductId")
    private Integer subProductId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Long getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(Long accountKey) {
        this.accountKey = accountKey;
    }

    public Integer getClientKey() {
        return clientKey;
    }

    public void setClientKey(Integer clientKey) {
        this.clientKey = clientKey;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public String getSubProductGroup() {
        return subProductGroup;
    }

    public void setSubProductGroup(String subProductGroup) {
        this.subProductGroup = subProductGroup;
    }

    public String getLastFour() {
        return lastFour;
    }

    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Long getExpDate() {
        return expDate;
    }

    public void setExpDate(Long expDate) {
        this.expDate = expDate;
    }

    public String getIsCardBlocked() {
        return isCardBlocked;
    }

    public void setIsCardBlocked(String isCardBlocked) {
        this.isCardBlocked = isCardBlocked;
    }

    public String getCardPan() {
        return cardPan;
    }

    public void setCardPan(String cardPan) {
        this.cardPan = cardPan;
    }

    public String getCardForTypeDictionaryValue() {
        return cardForTypeDictionaryValue;
    }

    public void setCardForTypeDictionaryValue(String cardForTypeDictionaryValue) {
        this.cardForTypeDictionaryValue = cardForTypeDictionaryValue;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(Integer subProductId) {
        this.subProductId = subProductId;
    }

    public String getNameDictionaryValue() {
        return nameDictionaryValue;
    }

    public void setNameDictionaryValue(String nameDictionaryValue) {
        this.nameDictionaryValue = nameDictionaryValue;
    }

    @SerializedName("NameDictionaryValue")
    private String nameDictionaryValue;

}
