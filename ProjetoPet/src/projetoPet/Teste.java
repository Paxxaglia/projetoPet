package projetoPet;

public class Teste {
	
	static Gato g;
	static Cachorro c;
	static Ave p;
	static Vacina v;
	
	public static void main(String[] args) {
		
		g = new Gato("tigrao", "macho", 3, 12, true, true, "curta");	
		c = new Cachorro("Romeu", "Macho", 15, 2, "Pequeno", 32, "Delacruz");
		p = new Ave("Chico", "Macho", 0.700, 1, true, "azuis", false, 5);
		v = new Vacina("Parvovirose", "09/09/2022", 4);
		
		
		System.out.println(g.toString());
		g.alertaSurdez();
		
		System.out.println(c.toString());
		c.alertaPasseio();
		
		System.out.println(p.toString());
		p.cortarAsas();
		
		System.out.println(v.toString());
		v.revacina();
		

	}

}
