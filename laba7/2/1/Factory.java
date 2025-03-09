public class Factory extends Thread{
    public final Parts parts;
    public String[] inputs;
    public String product;
    public int time;

    Factory(Parts parts, String[] inputs, String product, int time){
        this.parts = parts;
        this.inputs = inputs;
        this.product = product;
        this.time = time;
    }

    private void await(long millis){
        try {
            Thread.sleep(millis);
        } catch (Exception ignored) {
        }
    }

    public void run(){
        while (true) {
            for (String name : this.inputs) {
                while (!parts.getPart(name)) {
                    await(4);
                }
                System.out.println("\nGet part \"" + name + "\"\n" + parts);
            }
            await(this.time * 1000L);
            while (!parts.putPart(this.product)) {
                await(4);
            }
            System.out.println("\nPut part \"" + this.product + "\"\n" + parts);
        }
    }
}
