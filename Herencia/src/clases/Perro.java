package clases;

public class Perro extends Mascota {

	private boolean dominante;
	private boolean ppp;
	
	
	
	public Perro() {
	}



	public Perro(boolean dominante, boolean ppp) {
		super();
		this.dominante = dominante;
		this.ppp = ppp;
	}
	
	
	
	public Perro(String nombre, int año_nac, String nChip, String raza, String sexo, boolean dominante, boolean ppp) {
		super(nombre, año_nac, nChip, raza, sexo);
		this.dominante=dominante;
		this.ppp=ppp;
	}



	public boolean isDominante() {
		return dominante;
	}
	public void setDominante(boolean dominante) {
		this.dominante = dominante;
	}
	public boolean isPpp() {
		return ppp;
	}
	public void setPpp(boolean ppp) {
		this.ppp = ppp;
	}
	
	public void cortarUñas() {
		System.out.println("cortando uñas....");
	}



	@Override
	public String toString() {
		return "Perro [dominante=" + dominante + ", ppp=" + ppp + ", nombre=" + nombre + ", año_nac=" + año_nac
				+ ", nChip=" + nChip + ", raza=" + raza + ", sexo=" + sexo + "]";
	}



	@Override
	public void vacunar() {
		super.vacunar();
		System.out.println("Poniendo la parvovirosis");
		System.out.println("Poniendo la rabia...");
	}
	
	
	
}
