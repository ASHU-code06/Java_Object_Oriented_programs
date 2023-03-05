package com.stockmanagement;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stockportfolio stockportfolio = new Stockportfolio();
        System.out.println("Enter the number of stocks");
        int n = scanner.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println("Enter the stockname ");
            String stockName = scanner.next();
            System.out.println("Enter the number Of Shares ");
            int numOfShares = scanner.nextInt();
            System.out.println("Enter sharePrice");
            double sharePrice = scanner.nextDouble();
            Stock stock = new Stock(stockName,numOfShares,sharePrice);
            stockportfolio.addStock(stock);
        }
        stockportfolio.printStockReport();
    }
}
