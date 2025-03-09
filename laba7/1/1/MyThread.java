public class MyThread extends Thread{
    String text;
    boolean ready = false;

    public MyThread(String name, String text){
        super(name);
        this.text = text;
    }

    private synchronized void print(){
        for (char c : this.text.toCharArray()){
            try{
                Thread.sleep(25L);
            }catch (Exception ignored){}
            System.out.print(c);
        }
    }

    public synchronized void run(){
        System.out.println(Thread.currentThread().getName()+" started");
        while (!ready) {
            try {
                wait(1L);
            } catch (Exception ignored) {
            }
        }
        this.print();
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}
