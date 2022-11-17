import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String>meineListe = new ArrayList<>();
        meineListe.add("a");
        meineListe.add("b");
        meineListe.add("c");

        System.out.println("Inhalt von meine Liste");

        for(String s: meineListe){
            System.out.println("Eintrag: " + s);
        }


        ZamList meineZamListe = new ZamList("Hallo liebe Zam es ist Nachmittag aber wir sind fleißig!");
        int i= 0;
        for(String s: meineZamListe){
            System.out.println("Eintrag: "+ i++ + " : " + s);
        }

        //nochmal durch gehen
        Iterator<String> meinZamListItertor = meineZamListe.iterator();
         i = 0;
        while(meinZamListItertor.hasNext()){
            System.out.println("Eintrag ZAM List mit iterator " + i++  + ": "+ meinZamListItertor.next());
        }
    }
}
