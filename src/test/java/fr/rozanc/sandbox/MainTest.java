package fr.rozanc.sandbox;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void should_print_hello() throws IOException {
        try (final ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            final PrintStream out = new PrintStream(outputStream);

            new Main(out).run(new String[0]);

            assertThat(outputStream.toString()).startsWith("Hello and welcome!" + System.lineSeparator());
        }

        System.out.println(System.getProperty("java.runtime.version"));
    }
}