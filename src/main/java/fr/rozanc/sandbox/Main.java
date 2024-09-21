package fr.rozanc.sandbox;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        new Main().run(args);
    }

    private final PrintStream out;

    Main(PrintStream out) {
        this.out = out;
    }

    Main() {
        this(System.out);
    }

    void run(String[] args) {
        out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            out.println("i = " + i);
        }
    }
}
