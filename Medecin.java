package employesConsole;

public class Medecin extends Personne {
	
	public Medecin( String P, int A) {
		super( P, A);
		 
	}

	public void afficher()
	{
		System.out.println( "- Je suis "+this.getPrenom()+", j’ai "+this.getAge()+" ans et je travaille en tant que Medecin  !");
	}

}
