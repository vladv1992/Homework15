package ro.fasttrackit.lab15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadFile {
    private final String doc;
    private String l;

    public ReadFile(String doc){
        this.doc = doc;
    }
    public List<Quote> read() throws IOException{
        List<String> line = Files.readAllLines(Path.of(doc));
        List<Quote> rst = new ArrayList<>();
        for(String l : line){
            rst.add(addNumber(l));
        }
        return rst;

    }

    private Quote addNumber(String id) {
        String[] doct = l.split(Pattern.quote("~"));
        return new Quote("id","doct[1]","doct[2]");
    }

}
