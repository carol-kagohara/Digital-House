package voadores;

public class SuperHomem implements Voador {
	
	private Integer experiencia;

	public SuperHomem() {
		this.experiencia = 0;
	}

	public Integer getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public void voar() {
		experiencia = experiencia + 3;
		System.out.println("Estou voando como um campeão");
		System.out.println("Experiência: " + experiencia);
	}

}
