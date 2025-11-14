/*public class ProfitandLoss {
    public static void main(String[] args) {
        int cost_price =129;
        int  selling_price=191;

        int profit = selling_price- cost_price;
        int profit_percentage = profit / cost_price * 100;
        System.out.println("The Cost Price is " +cost_price+"INR  and Selling Price is"+ selling_price +  \n+ "and the Profit Percentage is"+ profit_percentage);

    }
}*/

public class ProfitandLoss {
    public static void main(String[] args) {
        int cost_price = 129;
        int selling_price = 191;

        int profit = selling_price - cost_price;
        double profit_percentage = ((double) profit / cost_price) * 100;

        System.out.println("The Cost Price is " + cost_price + " INR and Selling Price is " + selling_price +
                           "\nThe Profit is " + profit + " INR" +
                           "The Profit Percentage is " + profit_percentage + "%");
    }
}

