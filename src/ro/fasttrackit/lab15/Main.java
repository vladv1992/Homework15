package ro.fasttrackit.lab15;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFile fil = new ReadFile("File/quotes.txt");
        List<Quote> author = fil.read();

    }
}