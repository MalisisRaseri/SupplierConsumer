package mainpack;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse();
        Entity [] entities = new Entity[]{
                new Supplier("Supplier1", warehouse),
                new Supplier("Supplier2", warehouse),
                new Consumer("Consumer1", warehouse),
                new Consumer("Consumer2", warehouse),
                new Consumer("Consumer3", warehouse),
                new Consumer("Consumer", warehouse),
        };
        for (Entity entity : entities) {
                entity.start();
        }

        entities[0].join();

    }

}
