package Task2;

public class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    Stock(String symbol_, String name_){
        this.symbol = symbol_;
        this.name = name_;
    }

    void setPrice(double price){
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = price;
    }

    double getChangePercent(){
        return (this.currentPrice / this.previousClosingPrice - 1) * 100.0;
    }
}
