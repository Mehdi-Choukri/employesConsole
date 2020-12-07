package employesConsole;

public class Personne {
	
	 
	private String prenom ;
	private int age ;
	public Personne Personne[];
	 
	 
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Personne( String P , int A)
	{
 
		setPrenom(P);
		setAge(A);
	}
	public void afficher()
	{
		
	}

}
