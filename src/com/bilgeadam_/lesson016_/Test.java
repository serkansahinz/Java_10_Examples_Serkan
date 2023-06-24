package com.bilgeadam_.lesson016_;

public class Test {

	public static void main(String[] args) {
		MarketYonetim marketYonetim = new MarketYonetim();
		Market market = new Market("Market", "Ankara");
		marketYonetim.setMarket(market);
		
		
		System.out.println(marketYonetim.getMarket());
		
		
		
		Market market2 = new Market("Market2", "Bolu");
		MarketYonetim marketYonetim2 = new MarketYonetim(market2);
		System.out.println(marketYonetim2.getMarket());

	}

}
