package ro.fasttrackit.lab15;

import java.util.ArrayList;
import java.util.List;

public class QuoateService {
    private List<Quote> quotes;

    public QuoateService(List<Quote> list) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        List<String> allQuotes = new ArrayList<>();
        for (Quote quote : quotes) {
            allQuotes.add(quote.getQoute());
        }
        return allQuotes;
    }

    public List<Quote> getQuotesFromAuthor(String author) {
        List<Quote> quotesAuthor = new ArrayList<>();
        for (Quote quot : quotes) {
            if (quot.getAuthor().equals(author)) {
                quotesAuthor.add(quot);
            }

        }
        return quotesAuthor;
    }

    public List<String> getAuthor() {
        List<String> quoteList = new ArrayList<>();
        for (Quote quot : quotes) {
            quoteList.add(quot.getAuthor());
        }
        return quoteList;
    }

    public void setFavorite(int id) {
        for (Quote quo : quotes) {
            if (quo.getId().equals(id)) {
                quo.setFavorite(false);
            }
        }
    }

    public List<Quote> getFavorite() {
        List<Quote> quoteLt = new ArrayList<>();
        for (Quote que : quotes) {
            if (que.isFavorite() == false) {
                quoteLt.add(que);
            }
        }
        return quoteLt;
    }

}
