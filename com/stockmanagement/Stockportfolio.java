package com.stockmanagement;

import java.util.ArrayList;

public class Stockportfolio {
    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateStockValue() {
        double totalvalue = 0;
        for (Stock mystock : stocks) {
            totalvalue += mystock.getValue();
        }
        return totalvalue;
    }

    public void printStockReport() {
        for (Stock vstock : stocks) {
            System.out.println("Stock Name : "+vstock.getStockName()+" -> \nNumber Of Shares : "+vstock.getNumOfShares()+"\nShare price : "+vstock.getSharePrice()+"\nValue of Share : "+vstock.getValue());
        }
        System.out.println("Total value of  stocks "+calculateStockValue());
    }
}
