package projetoPet;

public class Cachorro extends Pet {
	
	private String porte;
	private int tempoPasseio;
	private String raca;
	
			
	public Cachorro(String nome, String sexo, double peso, int idade, String porte, int tempoPasseio, String raca) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.idade = idade;
		this.porte = porte;
		this.tempoPasseio = tempoPasseio;
		this.raca = raca;
		
	}
	
	public String toString() {	
		return "\n\nNome do cachorro: " + nome + "\nSexo: " + sexo + "\nPeso: " + peso + "kg\nIdade: " + 
				idade + "\nPorte: "+ porte +"\nRaça: " + raca + "\nTempo de passeio (Em minutos): " + tempoPasseio;
	}

	
	public void alertaPasseio() {
		if (this.porte == "Pequeno" && tempoPasseio >= 20 ) {
			
			System.out.println("Seu pequeno cachorrinho também possui pequena energia, invista em brincadeiras leves ao invés de passeios mais longos!");
		}
		
		if (this.porte == "Medio" && tempoPasseio <= 34) {
			System.out.println("\nO recomendado para raças deste porte é entre 35 e 60 minutos, se exercite junto com seu animalzinho!");
			
		}
		
		if (this.porte == "Grande" && tempoPasseio <= 34) {
			System.out.println("\nO recomendado para raças deste porte é entre 35 e 60 minutos, se exercite junto com seu animalzinho!");
			
		}
		
	}
	
	
	
	//getters e setters


//
	
	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}

//
	
	public int PasseioRegular() {
		return tempoPasseio;
	}


	public void setPasseioRegular(int passeioRegular) {
		this.tempoPasseio = passeioRegular;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}

}
