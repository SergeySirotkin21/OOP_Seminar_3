import java.util.Comparator;

public class StreamCorparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
           
        return Integer.compare(o1.getSize(), o2.getSize());
    } 
}

