public class BesttimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int result= maxProfit(prices);

        System.out.println("Maximum profit is :"+result);
    }

    public static int maxProfit(int[] p){

        int minPrice = Integer.MAX_VALUE;
        int maxPrice=0;

        for(int price : p){
            if(price<minPrice){
                minPrice=price;
            } else if (price-minPrice>maxPrice) {
                maxPrice=price-minPrice;

            }
        }
        return maxPrice;
    }
}
