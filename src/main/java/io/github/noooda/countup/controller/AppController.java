package io.github.noooda.countup.controller;

import io.github.noooda.countup.service.CounterService;
import io.github.noooda.countup.util.InputReader;

import java.util.Optional;

public class AppController {
    // finalなのにコンストラクタで初期化
    private final InputReader inputReader;
    private final CounterService counterService;

    public AppController(InputReader inputReader, CounterService counterService) {
        this.inputReader = inputReader;
        this.counterService = counterService;
    }

    public void run() {
        System.err.println("Please enter an integer. Enter 0 to exit.");

        while (true) {
            // Optionalとは
            // maybeNumber, tryReadInt()の命名
            // thisを使ってアクセスしない
            Optional<Integer> maybeNumber = inputReader.tryReadInt();

            if (maybeNumber.isEmpty()) {
                System.out.println("Invalid Value. Please enter an integer.");
                continue;
            }

            int number = maybeNumber.get();

            if (number == 0) {
                System.out.println("Finish.");
                break;
            }

            counterService.increment(number);
            System.out.println("Current total: " + counterService.getTotal());
        }
    }
}