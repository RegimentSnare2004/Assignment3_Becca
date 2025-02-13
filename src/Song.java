public class Song{
    public String title;
    public String artist;
    public double price;
    public Song(String title, String artist, double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String toString(){
        return "Song Name: " + title + ", Artist: " +
                    artist + ", Price: " + price + "\n";
    }

}
