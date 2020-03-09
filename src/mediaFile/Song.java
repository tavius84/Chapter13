package mediaFile;

public class Song {
    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    private static int numSongs = 0;
    public Song(){
        title = "";
        rating = 4;
        price = 0.0;
    }

    public Song(String t, double p) {
        this.title = t;
        this.price = p;
        numSongs++;
    }
    public Song(String t, double p, int r) {
        this.title = t;
        this.price = p;
        this.rating = r;
        numSongs++;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        this.rating = r;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }
    public void addToFavorites(){
        favorite = true;
    }

    public int getNumSongs(){
        return numSongs;
    }
}
