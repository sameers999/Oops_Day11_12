package com.bridgelabz;
import java.util.Scanner;

public class StockReport {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("pLease enter the number of stock ypu will enter:");
		int numberOfStock=scanner.nextInt();
		scanner.close();
		IstockService istockService=new StockService();
		for(int i=0;i<numberOfStock;i++) {
			System.out.println("Please enter stock name");
			String stockName=scanner.next();
			System.out.println("Please enter stock share");
			int share=scanner.nextInt();
			System.out.println("Please enter stock share price");
			long sharePrice=scanner.nextLong();
			
			
			istockService.addstocks(stockName,share,sharePrice);
		}
		istockService.printReport();
		
		
	}

}
