package medium;
// Best time to buy and sell stock
public class StockBuynSell {
  public static void main(String[] args) {
    System.out.println(" Best time to buy and sell stock");
    int prices[] = {7 ,1 ,5 ,4 ,3 ,6};
    int buy = Integer.MAX_VALUE;
    int sell = 0;
    for(int price : prices)
    {
      buy = Math.min(price, buy);
      sell = Math.max(sell, price-buy);
    }
    System.out.println("The Maximum profit is "+ sell);
  }
}
