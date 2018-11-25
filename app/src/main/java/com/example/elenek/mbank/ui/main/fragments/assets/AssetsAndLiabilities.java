package com.example.elenek.mbank.ui.main.fragments.assets;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssetsAndLiabilities {
    @SerializedName("Points")
    private List<Point> points;
    @SerializedName("Assets")
    private List<Asset> assets;
    @SerializedName("Liabilities")
    private List<Liability> liabilities;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public List<ProductAmount> getAvailableAmounts() {
        return availableAmounts;
    }

    public void setAvailableAmounts(List<ProductAmount> availableAmounts) {
        this.availableAmounts = availableAmounts;
    }

    @SerializedName("AvailableAmounts")
    private List<ProductAmount> availableAmounts;

    abstract class Product {
        abstract public String getProductName();
        abstract public String getProductType();
        abstract public Double getAmountBase();
        abstract public void setProductName(String productName);
        abstract public void setProductType(String productType);
        abstract public void setAmountBase(Double amountBase);
    }

    class Point extends Product {
        @SerializedName("ProductName")
        private String productName;
        @SerializedName("ProdType")
        private String productType;
        @SerializedName("Amount")
        private Double amountBase;
        @SerializedName("Id")
        private Integer id;
        @SerializedName("OrderNo")
        private Integer orderNo;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(Integer orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public String getProductName() {
            return productName;
        }

        @Override
        public String getProductType() {
            return productType;
        }

        @Override
        public Double getAmountBase() {
            return amountBase;
        }

        @Override
        public void setProductName(String productName) {
            this.productName = productName;
        }

        @Override
        public void setProductType(String productType) {
            this.productType = productType;
        }

        @Override
        public void setAmountBase(Double amountBase) {
            this.amountBase = amountBase;
        }
    }

    class SimilarProduct extends Product{
        @SerializedName("ProductName")
        private String productName;
        @SerializedName("ProductType")
        private String productType;
        @SerializedName("AmountBase")
        private Double amountBase;

        @Override
        public String getProductName() {
            return productName;
        }

        @Override
        public void setProductName(String productName) {
            this.productName = productName;
        }

        @Override
        public String getProductType() {
            return productType;
        }

        @Override
        public void setProductType(String productType) {
            this.productType = productType;
        }

        @Override
        public Double getAmountBase() {
            return amountBase;
        }

        @Override
        public void setAmountBase(Double amountBase) {
            this.amountBase = amountBase;
        }
    }

    class Asset extends SimilarProduct{
    }

    class Liability extends SimilarProduct{

    }

    class ProductAmount extends SimilarProduct{

    }

}
