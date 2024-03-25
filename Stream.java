// Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий 
// интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества 
// групп, входящих в Поток;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{

    List<StudyGroup> listStudyGroups;

    public Stream(List<StudyGroup> listStudyGroups){
        this.listStudyGroups  = listStudyGroups;
    }  
    public String toString(){
        return String.format("Поток %s Количество групп %d", listStudyGroups, getSize() );
    }
    public int getSize(){
        return listStudyGroups.size();
    }
    public void setName(List<StudyGroup> name){
        this.listStudyGroups = name;
    }
    // public String getName(){  
    //     return   name;
    // }   
    public void setList(List<StudyGroup> listGroups){
        this.listStudyGroups = listGroups;
    }
    public List<StudyGroup> getList(){
        return listStudyGroups;
    }
    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(listStudyGroups);
    }
}


