package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Station {
    private List<Observerable> ob;

    public Station() {
        ob = new ArrayList<>();
    }
    public void add(Observerable o) {ob.add(o);}
    public void remove(Observerable o) {ob.remove(o);}

    protected void notifyAll(int t, int p, int h) {
        for (var o : ob) {
            o.notifyOb(t,p,h);
        }
    }

    private int getRandomInRange(Random random, int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public void start(int times) throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            notifyAll(getRandomInRange(random,-25, 30), getRandomInRange(random,10, 100),
                    getRandomInRange(random,10, 100));
            Thread.sleep(1000);
        }
    }

}
