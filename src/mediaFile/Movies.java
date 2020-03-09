package mediaFile;

public class Movies {
    private String title;
    private int rating;
    public Movies(){
        title = "";
        rating = 2;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        rating = r;
    }
}
