package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Observerable ob = new Device();
        Station station = new Station();

        station.add(ob);
        station.start(10);
        station.remove(ob);
    }
}