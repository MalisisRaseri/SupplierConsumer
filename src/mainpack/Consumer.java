package mainpack;

public class Consumer extends Entity {
    public Consumer(String name, Warehouse warehouse) {
        super(name, warehouse);
    }

    @Override
    public void run() {
        while (true) {
            pause(1000, 2000);
            warehouse.consumerGoods(this, 5 + rnd.nextInt(14), random(200, 300));

        }
    }
}
