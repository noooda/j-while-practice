package io.github.noooda.countup.service;

public class CounterService {
    private int total = 0; 

    public void increment(int value) {
        // thisを使ってアクセスしない
        total += value;
    }

    public int getTotal() {
        // thisを使ってアクセスしない
        return total;
    }
}
