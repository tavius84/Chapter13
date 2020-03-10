package mediaFile;

public class MediaLib {
    public static void main(String[] args) {
        double totalCost = 0;
        double aveRating = 0;

        System.out.println("Welcome to your Media Library");
        Song getNumSongs = new Song();
        Song song1 = new Song("OOO kill em",1.29,8);
        System.out.println(song1.getTitle() + " " + song1.getTitle() + " " + song1.getTitle());
        totalCost = song1.getPrice() + totalCost;
        aveRating = song1.getRating() + aveRating;
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());
        Song song2 = new Song("ya yeet",1.50,9);
        System.out.println(song2.getTitle() + " " + song2.getTitle() + " " + song2.getTitle());
        totalCost = song2.getPrice() + totalCost;
        aveRating = song2.getRating() + aveRating;
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());


        Song song3 = new Song("Bofa",1.50,10);
        System.out.println(song3.getTitle() + " " + song3.getTitle() + " " + song3.getTitle());
        totalCost = song3.getPrice() + totalCost;
        aveRating = song3.getRating() + aveRating;
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());
        Song song4 = new Song("Joe",1.50,4);
        System.out.println(song4.getTitle() + " " + song4.getTitle() + " " + song4.getTitle());
        totalCost = song4.getPrice() + totalCost;
        aveRating = song4.getRating() + aveRating;
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());
        Song song5 = new Song("Deez",1.50,7);
        System.out.println(song5.getTitle() + " " + song5.getTitle() + " " + song5.getTitle());
        totalCost = song5.getPrice() + totalCost;
        aveRating = song5.getRating() + aveRating;
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());
        Song song6 = new Song("Ligma",1.50,8);
        System.out.println(song6.getTitle() + " " + song6.getTitle() + " " + song6.getTitle());
        totalCost = song6.getPrice() + totalCost;
        aveRating = song6.getRating() + aveRating;
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());
        Song song7 = new Song("Sugon",1.50,99);
        System.out.println(song7.getTitle() + " " + song7.getTitle() + " " + song7.getTitle());
        totalCost = song7.getPrice() + totalCost;
        aveRating = song7.getRating() + aveRating;
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());
        Song song8 = new Song("up dog",1.50,13);
        System.out.println(song8.getTitle() + " " + song8.getTitle() + " " + song8.getTitle());
        totalCost = song8.getPrice() + totalCost;
        aveRating = song8.getRating() + aveRating;
        MediaFile.writeString(song8.getTitle() + "|" + song8.getRating());

        System.out.println("Total cost: "+ totalCost );
        System.out.println("Average Rating: " +aveRating/getNumSongs.getNumSongs());

        Books book1 = new Books();
        Movies movie1 = new Movies();

        System.out.println(song1);
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        System.out.println(song1.getPrice());
        System.out.println(book1);
        book1.setTitle("Children of the Corn");
        System.out.println(book1.getTitle());
        System.out.println(book1.getRating());

        System.out.println(movie1);
        movie1.setTitle("Battle LA");
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getRating());
        //String songInfo = MediaFile.readString();
       // System.out.println(songInfo);

        String s = MediaFile.readString();
        while (s != null){
            System.out.println("From File: " + s);
            s = MediaFile.readString();
        }
        MediaFile.saveAndClose();
    }
}
