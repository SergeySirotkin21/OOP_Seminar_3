import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {
    public List<StudyGroup> listStudyGroups;

    public  StreamIterator (List<StudyGroup> listGroups){
        this.listStudyGroups = listGroups;
    }
    int count;

    @Override
    public boolean hasNext() {
        return count < listStudyGroups.size();
    }

    @Override
    public StudyGroup next() {
        return listStudyGroups.get(count++);
    }
}

