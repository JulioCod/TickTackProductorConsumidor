public class Consumidor extends Thread{
    private TickTack cola;

    public Consumidor(TickTack cola) {
        this.cola = cola;
    }

    @Override
    public synchronized void run() {
        System.out.println("...Consumidor empieza a consumir...");
        for (int i = 0; i < 200; i++) {
            System.out.println(cola.getTickTack());
        }

    }
}
