import java.util.Iterator;

public class ZamIterator implements Iterator<String> {
    private String[] words;
    private int position;

    public ZamIterator(String[] text) {
        this.words = text;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position < words.length){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public String next() {
        position++;
        String tempString =  words[position - 1];
        return tempString;
    }

}
