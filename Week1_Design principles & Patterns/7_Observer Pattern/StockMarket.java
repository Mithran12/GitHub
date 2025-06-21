import java.util.*;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private double price;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void deregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
