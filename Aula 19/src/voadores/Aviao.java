package voadores;

public class Aviao implements Voador {

	private Integer horasVoo;

	public Aviao() {
		this.horasVoo = 0;
	}

	public Integer getHorasVoo() {
		return horasVoo;
	}

	public void setHorasVoo(Integer horasVoo) {
		this.horasVoo = horasVoo;
	}
	
	@Override
	public void voar() {
		horasVoo = horasVoo + 13;
		System.out.println("Estou voando como um avi�o");
		System.out.println("Tempo de voo: " + horasVoo);
	}	
}
