package avansbezoeker;

public class Teacher extends AvansVisitor{
	private String secondaryActivity;
        
        public Teacher(String name, String mainActivity, String secondaryActivity){
            super(name, mainActivity);
            this.secondaryActivity = secondaryActivity;
        }
}