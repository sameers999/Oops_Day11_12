package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockService implements IstockService{

	
	public List<Stock> stockList=new ArrayList<Stock>();

	
	
	
	public void addstocks(String stockName, int share, long sharePrice) {
		// TODO Auto-generated method stub
		Stock stock=new Stock();
		stock.setStockName(stockName);
		stock.setShare(share);
		stock.setSharePrice(sharePrice);
		stockList.add(stock);
		
	}
	
	public void printReport() {
		System.out.println("********Stock Report*******");
		for(int i=0;i<stockList.size();i++) {
			System.out.println("***************");
			System.out.println("Stock name:"+stockList.get(i).getStockName());
			System.out.println("Stock share:"+stockList.get(i).getShare());
			System.out.println("Stock price:"+stockList.get(i).getSharePrice());
			long totalValue=stockList.get(i).getSharePrice()*stockList.get(i).getShare();
			System.out.println("Total Value:"+totalValue);
			System.out.println("***************");
		}
	}
	
	
}
