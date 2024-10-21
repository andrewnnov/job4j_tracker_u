package ru.job4j.queue;

import java.util.Queue;
import java.util.SplittableRandom;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String happy = null;
        for (int i = 0; i < count; i++) {
            happy = queue.poll().name().toString();
        }
        return happy;
    }

    public String getFirstUpsetCustomer() {
        String happy = null;
        for (int i = 0; i < count + 1; i++) {
            happy = queue.poll().name().toString();
        }
        return happy;
    }
}
