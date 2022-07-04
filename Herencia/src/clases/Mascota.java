package clases;

public class Mascota {

	protected String nombre;
	protected int año_nac;
	protected String nChip;
	protected String raza;
	protected String sexo;
	
	
	
	public Mascota() {
		this.nChip="";
	}
	
	public Mascota(String nombre, int año_nac, String nChip, String raza, String sexo) {
		super();
		this.nombre = nombre;
		this.año_nac = año_nac;
		this.nChip = nChip;
		this.raza = raza;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño_nac() {
		return año_nac;
	}

	public void setAño_nac(int año_nac) {
		this.año_nac = año_nac;
	}

	public String getnChip() {
		return nChip;
	}

	public void setnChip(String nChip) {
		this.nChip = nChip;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void vacunar() {
		System.out.println("Poniendo la trivalente....");
	}
	
	public void desparasitar() {
		System.out.println("Aplicar pipeta");
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", año_nac=" + año_nac + ", nChip=" + nChip + ", raza=" + raza + ", sexo="
				+ sexo + "]";
	}
	
	
	
}
