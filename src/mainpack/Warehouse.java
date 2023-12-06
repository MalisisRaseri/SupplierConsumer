package mainpack;

public class Warehouse {
        private int amount;

        public synchronized void providerGoods(Supplier prov, int amount, int loadTime){
            try {
                Thread.sleep(loadTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("%s хочет загрузить %d единиц товара. %n", prov.getName(),amount);
            this.amount += amount;
            notifyAll();

            System.out.printf("%s загрузил товар. Баланс сейчас в %d. %n", prov.getName(),this.amount);
        }

        public synchronized void consumerGoods(Consumer cons, int amount, int consumerTime){

            System.out.printf("%s хочет взять %d единиц товара. %n",cons.getName(),amount);
            while (amount> this.amount){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.amount -=amount;

            System.out.printf("%s взял товар. Баланс сейчас %d. %n", cons.getName(), this.amount);
        }

}

