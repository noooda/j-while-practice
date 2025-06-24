package io.github.noooda.countup.service;

public class CounterService {
    private int total = 0; 

    public void increment(int value) {
        total += value;
    }

    public int getTotal() {
        return total;
    }
}
