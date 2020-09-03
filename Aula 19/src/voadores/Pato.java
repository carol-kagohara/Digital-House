package voadores;

public class Pato implements Voador{
	
	private Integer energia;

	public Pato(Integer energia) {
		this.energia = energia;
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	@Override
	public void voar() {
		energia = energia - 5;
		System.out.println("Estou voando como um pato");
		System.out.println("Energia restante: " + energia);
	}

}
