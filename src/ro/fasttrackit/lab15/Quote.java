package ro.fasttrackit.lab15;

public class Quote {
   final private String id;
   final private String author;
   final private String qoute;
   private boolean favorite;

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Quote(String id, String author, String quote){
       this.id = id;
       this.author = author;
       this.qoute = quote;
       this.favorite = true;
   }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getQoute() {
        return qoute;
    }

    public boolean isFavorite() {
        return favorite;
    }


}

