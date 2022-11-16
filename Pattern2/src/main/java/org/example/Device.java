package org.example;

public class Device implements Observerable{
    int temp;
    int press;
    int hum;

    public void notifyOb(int t, int p, int h) {
        if (t==temp && p==press && h==hum)
            return;

        if (t!=temp) {
            System.out.println("Температура изменилась: " + t);
            temp = t;
        }

        if (p!=press) {
            System.out.println("Давление изменилось: " + p);
            press = p;
        }

        if (h!=hum) {
            System.out.println("Влажность изменилась: " + h);
            hum = h;
        }
    }
}
