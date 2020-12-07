package employesConsole;

public class Opticienne extends Personne {
	
	

	public Opticienne(String P, int A) {
		super(P, A);
		 
	}
	
	 
	public void afficher()
	{
		System.out.println( "- Je suis "+this.getPrenom()+", j’ai "+this.getAge()+" ans et je travaille en tant que opticienne  !");
	}
	

}
