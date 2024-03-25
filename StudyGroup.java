public class StudyGroup {
    
    int number;
    String name;
    int amount;

    public StudyGroup(String name, int number, int amount ){
        this.name = name;
        this.number = number;
        this.amount = amount;
    }

    public String getNane() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getNumber() {
        return number;
    }
    
    public String toString(){
        return String.format("%s %d %d", name, number, amount);
    }
}

