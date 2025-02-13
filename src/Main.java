//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 4.00);

        SLlist songList = new SLlist();
        AList songsList = new AList(5);
        DLlist songyList = new DLlist();

        System.out.print(songsList.toString());

        songsList.listAdd(song1);
        songsList.listAdd(song3);
        songsList.listAdd(song2);
        songsList.listAdd(song1);

        songList.addy(song1);
        songList.addy(song3);
        songList.addy(song2);
        songList.addy(song1);

        songyList.addy(song1);
        songyList.addy(song3);
        songyList.addy(song2);
        songyList.addy(song1);


        System.out.print("AList: " + songsList.toString() + "\n");
        System.out.print("SLlist: " + songList.toString() + "\n");
        System.out.print("DLlist: " + songyList.toString() + "\n");

        songsList.listRemove(1);
        songList.removey(1);
        songyList.removy(1);

        System.out.print("AList: " + songsList.toString() + "\n");
        System.out.print("SLlist: " + songList.toString() + "\n");
        System.out.print("DLlist: " + songyList.toString() + "\n");


    }
}