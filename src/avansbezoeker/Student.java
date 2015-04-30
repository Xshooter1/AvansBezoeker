package avansbezoeker;

public class Student extends AvansVisitor implements Gamer{
    
    @Override
    public String getGame() {
        return "Wow";
    }
}