package ro.ase.cts.GitAssignment;

public class Bride implements Wedding {
	public String name;
	public String weddingLocation;
	public double budget;
	
	public Bride(String name, String weddingLocation, double budget) {
		super();
		this.name = name;
		this.weddingLocation = weddingLocation;
		this.budget = budget;
	}

	@Override
	public void showWeddingDate() {
		System.out.println(name + "has the wedding in the summer of 2020");
		
	};
	
	
	

}
