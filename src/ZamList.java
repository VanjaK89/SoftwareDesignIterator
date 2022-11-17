import java.util.Iterator;

public class ZamList implements Iterable<String>{
    private String[] text;

    public ZamList(String s) {
      this.text = s.split(" ");
        System.out.println("ZamList erstellt mit Text \"" + s + "\" .") ;
    }

    @Override
    public Iterator<String> iterator() {
        return new ZamIterator(text);
    }
}
