package com.example.elenek.mbank.ui.main.fragments.transactions;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TransactionsInfo {
    @SerializedName("OutcomeSum")
    private Double outcomeSum;
    @SerializedName("IncomeSum")
    private Double incomeSum;

    public Double getOutcomeSum() {
        return outcomeSum;
    }

    public void setOutcomeSum(Double outcomeSum) {
        this.outcomeSum = outcomeSum;
    }

    public Double getIncomeSum() {
        return incomeSum;
    }

    public void setIncomeSum(Double incomeSum) {
        this.incomeSum = incomeSum;
    }

    public List<Operation> getMyOperations() {
        return myOperations;
    }

    public void setMyOperations(List<Operation> myOperations) {
        this.myOperations = myOperations;
    }

    @SerializedName("MyOperations")
    private List<Operation> myOperations;

    class Operation {
        @SerializedName("AcctKey")
        private Long accountKey;
        @SerializedName("EntryId")
        private Long entryId;
        @SerializedName("Nomination")
        private String nomination;
        @SerializedName("EntryGroup")
        private String entryGroup;
        @SerializedName("MerchantId")
        private String merchantId;
        @SerializedName("Date")
        private Long date;
        @SerializedName("Amount")
        private Double amount;
        @SerializedName("Ccy")
        private String currency;
        @SerializedName("DocNomination")
        private String docNomination;
        @SerializedName("DstAcc")
        private String destAccount;
        @SerializedName("SrcAcc")
        private String srcAccount;
        @SerializedName("MerchantName")
        private String merchantName;
        @SerializedName("MerchantNameInt")
        private String merchantNameInt;
        @SerializedName("AmountBase")
        private Double amountBase;
        @SerializedName("EntryGroupName")
        private String entryGroupName;
        @SerializedName("EntryGroupNameId")
        private Integer entryGroupNameId;
        @SerializedName("ServiceId")
        private String serviceId;
        @SerializedName("PostDate")
        private Long postDate;

        public Long getAccountKey() {
            return accountKey;
        }

        public void setAccountKey(Long accountKey) {
            this.accountKey = accountKey;
        }

        public Long getEntryId() {
            return entryId;
        }

        public void setEntryId(Long entryId) {
            this.entryId = entryId;
        }

        public String getNomination() {
            return nomination;
        }

        public void setNomination(String nomination) {
            this.nomination = nomination;
        }

        public String getEntryGroup() {
            return entryGroup;
        }

        public void setEntryGroup(String entryGroup) {
            this.entryGroup = entryGroup;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        public Long getDate() {
            return date;
        }

        public void setDate(Long date) {
            this.date = date;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getDocNomination() {
            return docNomination;
        }

        public void setDocNomination(String docNomination) {
            this.docNomination = docNomination;
        }

        public String getDestAccount() {
            return destAccount;
        }

        public void setDestAccount(String destAccount) {
            this.destAccount = destAccount;
        }

        public String getSrcAccount() {
            return srcAccount;
        }

        public void setSrcAccount(String srcAccount) {
            this.srcAccount = srcAccount;
        }

        public String getMerchantName() {
            return merchantName;
        }

        public void setMerchantName(String merchantName) {
            this.merchantName = merchantName;
        }

        public String getMerchantNameInt() {
            return merchantNameInt;
        }

        public void setMerchantNameInt(String merchantNameInt) {
            this.merchantNameInt = merchantNameInt;
        }

        public Double getAmountBase() {
            return amountBase;
        }

        public void setAmountBase(Double amountBase) {
            this.amountBase = amountBase;
        }

        public String getEntryGroupName() {
            return entryGroupName;
        }

        public void setEntryGroupName(String entryGroupName) {
            this.entryGroupName = entryGroupName;
        }

        public Integer getEntryGroupNameId() {
            return entryGroupNameId;
        }

        public void setEntryGroupNameId(Integer entryGroupNameId) {
            this.entryGroupNameId = entryGroupNameId;
        }

        public String getServiceId() {
            return serviceId;
        }

        public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
        }

        public Long getPostDate() {
            return postDate;
        }

        public void setPostDate(Long postDate) {
            this.postDate = postDate;
        }
    }

}
