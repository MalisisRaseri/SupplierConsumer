package mainpack;
public class Supplier extends Entity {
    public Supplier(String name, Warehouse warehouse) {
        super(name, warehouse);
    }

    @Override
    public void run() {
        while (true) {
            warehouse.providerGoods(this, 5 + rnd.nextInt(15), random(100, 500));
            pause(2000, 3000);
        }
    }
}
