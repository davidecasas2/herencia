package clases;

public class Gato extends Mascota{
	
	private boolean pelo;

	public Gato(String nombre, int a�o_nac, String nChip, String raza, String sexo, boolean pelo) {
		super(nombre, a�o_nac, nChip, raza, sexo);
		this.pelo = pelo;
	}
	
	public Gato() {
		this.pelo=true;
	}

	public boolean provocaAlergia() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	@Override
	public void vacunar() {
		System.out.println("Poniendo la vacuna del moquillo");
		System.out.println("Poniendo vacuna de la leucemia");
	}
	
	
	

}
