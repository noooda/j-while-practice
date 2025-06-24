package io.github.noooda.countup.util;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner = new Scanner(System.in);

    public int readInt() throws NumberFormatException {
        System.out.println("> ");
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }
}
