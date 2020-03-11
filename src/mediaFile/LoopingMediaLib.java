package mediaFile;

public class LoopingMediaLib {
    public static void main(String[] args) {
        String s = MediaFile.readString();
//        while(s != null){
//            String title = s.substring(0, s.indexOf("|"));
//            String rating = s.substring((s.indexOf("|")+1));
//            System.out.println("Title: " + title);
//            System.out.println("Rating: " + rating);
//            s = MediaFile.readString();
        //}
        while(s != null){
            String title = s.substring(0, s.indexOf("|"));
            String rating = s.substring((s.indexOf("|")+1));
//            System.out.println("Title: " + title);
//            System.out.println("Rating: " + rating);
//            s = MediaFile.readString();

            if (Integer.parseInt(rating) >= 9){
                System.out.println("Title: " +title);
                System.out.println("Rating: " +rating);
                s = MediaFile.readString();

            }

        }
    }
}
