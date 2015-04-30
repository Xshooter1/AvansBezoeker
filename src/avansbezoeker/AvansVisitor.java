package avansbezoeker;

public abstract class AvansVisitor {

	private String name;
	private String mainActivity;

        public AvansVisitor(String name, String mainActivity){
            this.name = name;
            this.mainActivity = mainActivity;
        }
        
	public void print() {
		// TODO - implement AvansVisitor.print
		System.out.println("Naam: " + name + "\nHoofd activiteit: " + mainActivity);
	}

}