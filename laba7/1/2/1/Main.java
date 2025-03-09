

public class Main {
    public static void main(String[] args){
        Parts parts = new Parts(new String[]{"A", "B", "C", "D", "Product"});
        parts.arr[4].limit = 999_999_999;
        Factory[] factories = new Factory[]{
                new Factory(parts, new String[]{}, "A", 1),
                new Factory(parts, new String[]{"C", "D"}, "B", 3),
                new Factory(parts, new String[]{}, "C", 2),
                new Factory(parts, new String[]{}, "D", 1),
                new Factory(parts, new String[]{"A", "B"}, "Product", 2)
        };
        //сбалансированный завод
        /*Factory[] factories = new Factory[]{
                new Factory(parts, new String[]{}, "A", 1),
                new Factory(parts, new String[]{"C", "D"}, "B", 3),
                new Factory(parts, new String[]{"C", "D"}, "B", 3),
                new Factory(parts, new String[]{"C", "D"}, "B", 3),
                new Factory(parts, new String[]{}, "C", 2),
                new Factory(parts, new String[]{}, "C", 2),
                new Factory(parts, new String[]{}, "D", 1),
                new Factory(parts, new String[]{"A", "B"}, "Product", 2),
                new Factory(parts, new String[]{"A", "B"}, "Product", 2)};*/
        for(Factory factory : factories){ factory.start();}
        try{
            Thread.sleep(9_999_999_999L);
        }catch(Exception ignored){
        }
    }
}
