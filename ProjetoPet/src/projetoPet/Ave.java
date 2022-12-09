package projetoPet;

public class Ave extends Pet {
	
	private boolean asaCortada;
	private String corPenas;
	private boolean livre;
	private int mesCorte;
	private String especie;
	

	public Ave(String nome, String sexo, double peso, int idade, boolean asaCortada, String corPenas, boolean livre, int mesCorte, String especie) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.asaCortada = asaCortada;
		this.corPenas = corPenas;
		this.livre = livre;
		this.mesCorte = mesCorte;
		this.especie = especie;
	}
	
	public String toString() {	
		return "\n\nNome do passaro: " + nome + "\nSexo: " + sexo + "\nPeso: " + peso + "kg\nIdade: " + idade + "\nCor das penas: " + corPenas +
				"\nÉ livre: " + livre + "\nEspécie: " + especie;
	}
	
	public void cortarAsas(){
		if(asaCortada == true) {
			System.out.println("É recomendado cortar novamente as penas das asas de seu passaro no mês: " 
					+ (this.mesCorte + 3) + ".");
		}
	}

// gets e sets
	
	public boolean isAsasCortadas() {
		return asaCortada;
	}


	public void setAsasCortadas(boolean asaCortada) {
		this.asaCortada = asaCortada;
	}

//
	
	public String getCorPenas() {
		return corPenas;
	}


	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}

//
	
	public boolean isLivre() {
		return livre;
	}


	public void setLivre(boolean livre) {
		this.livre = livre;
	}
	
	

}
