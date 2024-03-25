import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *  Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий 
 интерфейс Iterable;
 — Создать класс StreamComparator, реализующий сравнение количества групп, 
 входящих в Поток;
 */
public class Main {

    public static void main(String[] args) {
       
        List<StudyGroup> stream1 = new ArrayList<>();
        stream1.add(new StudyGroup("Python", 6745, 32));
        stream1.add(new StudyGroup("Python", 6744, 34));
        stream1.add(new StudyGroup("Python", 6743, 33));
        stream1.add(new StudyGroup("Python", 6742, 28));
        stream1.add(new StudyGroup("Python",6746, 30));
       
        List<StudyGroup> stream2 = new ArrayList<>();   
        stream2.add(new StudyGroup("Java", 6754, 30));
        stream2.add(new StudyGroup("Java", 6753, 32));
        stream2.add(new StudyGroup("Java", 6750, 33));
        stream2.add(new StudyGroup("Java", 6749, 28));
         
        Stream iteribleGroup = new Stream(stream2);
        iteribleGroup.setList(stream2);
        Iterator<StudyGroup> iterator = iteribleGroup.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<Stream> streams = new ArrayList<>(List.of(
            new Stream(stream1),
            new Stream(stream2)));    

        Collections.sort(streams, new StreamCorparator());
        System.out.println(streams);

    }
}

