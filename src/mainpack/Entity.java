package mainpack;

import java.util.Random;

public class Entity extends Thread {
    protected final Random rnd = new Random();
    protected final Warehouse warehouse;

    public Entity(String name, Warehouse warehouse) {
        super(name);
        this.warehouse = warehouse;
    }
    protected void pause(int minMs, int maxMs){
        try {
            Thread.sleep(random(minMs,maxMs));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected int random(int min, int max) {
        return (int) (min+rnd.nextFloat()*(max-min));
    }

    }

