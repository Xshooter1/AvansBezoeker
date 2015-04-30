package avansbezoeker;

public class Student extends AvansVisitor implements Gamer{

    public Student(String name, String mainActivity) {
        super(name, mainActivity);
    }
    
    @Override
    public String getGame() {
        return "Wow";
    }
}