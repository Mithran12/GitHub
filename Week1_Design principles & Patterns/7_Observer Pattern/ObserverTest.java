public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile1 = new MobileApp("ClientA");
        Observer web1 = new WebApp("ClientB");

        market.register(mobile1);
        market.register(web1);

        System.out.println("Setting price to ₹100.50");
        market.setPrice(100.50);

        System.out.println("\nDeregistering WebApp observer...\n");
        market.deregister(web1);

        System.out.println("Setting price to ₹102.75");
        market.setPrice(102.75);
    }
}
