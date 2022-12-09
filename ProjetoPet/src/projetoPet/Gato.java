package projetoPet;

public class Gato extends Pet {
	
	private	boolean peloBranco;
	private	boolean olhoAzul;
	private String tamanhoPelagem;

	public Gato(String nome, String sexo, double peso, int idade, boolean peloBranco, boolean olhoAzul, String tamanhoPelagem) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.idade = idade;
		this.peloBranco = peloBranco;
		this.olhoAzul = olhoAzul;
		this.tamanhoPelagem = tamanhoPelagem;
		
	}
	
	public String toString() {	
		return "\n\nNome do gato: " + nome + "\nSexo: " + sexo + "\nPeso: " + peso + "kg\nIdade: " + idade + "\nTamanho da pelagem: " + tamanhoPelagem;
	}
	
	      
	
	public void alertaSurdez(){
		if(this.peloBranco == true && this.olhoAzul == true) {
			System.out.println("Atenção: 80% dos gatos brancos de olhos azuis são surdos, fique atento aos sinais do seu pet!");
		}
	}
	
//getters e setters
	

	public boolean isPeloBranco() {
		return peloBranco;
	}

//
	
	public String getTamanhoPelagem() {
		return tamanhoPelagem;
	}

	public void setTamanhoPelagem(String tamanhoPelagem) {
		this.tamanhoPelagem = tamanhoPelagem;
	}

//
	
	public void setPeloBranco(boolean peloBranco) {
		this.peloBranco = peloBranco;
	}

	public boolean isOlhoAzul() {
		return olhoAzul;
	}

//
	
	public void setOlhoAzul(boolean olhoAzul) {
		this.olhoAzul = olhoAzul;
	}

	}

