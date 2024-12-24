package Task2;

public class Task2 {
    public static void main(String[] args){
        Stock sber = new Stock("SBER", "ПАО Сбербанк");
        sber.setPrice(281.50);
        sber.setPrice(282.87);
        System.out.println("стоимость акций "+sber.name+" изменилась на "+sber.getChangePercent()+"%");
    }
}
