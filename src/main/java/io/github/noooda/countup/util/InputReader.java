package io.github.noooda.countup.util;

import java.io.InputStream;
import java.util.Optional;
import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    // InputStreamの引数切り出し
    public InputReader(InputStream input) {
        this.scanner = new Scanner(input);
    } 

    // Optional<Integer>とは
    public Optional<Integer> tryReadInt() {
        System.out.print("> ");
        // thisを使ってアクセスしない
        String input = scanner.nextLine();

        try {
            return Optional.of(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
