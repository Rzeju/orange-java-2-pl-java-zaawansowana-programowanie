package pl.sda.zad7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class GunMagazine {

    private Deque<String> magazine;
    private int size;

    public GunMagazine(int size) {
        magazine = new ArrayDeque<>();
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if (magazine.size() == size) {
            System.out.println("Magazynek jest pełen");
        } else {
            magazine.addFirst(bullet);
        }
    }

    public boolean isLoaded() {
        return magazine.size() >= 1;
    }

    public void shot() {
        if (magazine.peek() == null) {
            System.out.println("Pusty magazynek");
        } else {
            System.out.println(magazine.poll());
        }
    }


}
