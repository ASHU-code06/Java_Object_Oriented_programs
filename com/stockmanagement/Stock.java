package com.stockmanagement;

public class Stock {
    private  String stockName ;
    private int numOfShares;
    private double sharePrice;
    Stock(String stockName,int numOfShares,double sharePrice){
        this.stockName=stockName;
        this.numOfShares=numOfShares;
        this.sharePrice=sharePrice;
    }
    String getStockName(){
        return stockName;
    }
    int getNumOfShares(){
        return numOfShares;
    }
    double getSharePrice(){
        return sharePrice;
    }
    public double getValue(){
        return numOfShares*sharePrice;
    }
}
