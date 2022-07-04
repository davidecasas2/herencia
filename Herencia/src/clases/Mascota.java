package clases;

public class Mascota {

	protected String nombre;
	protected int a�o_nac;
	protected String nChip;
	protected String raza;
	protected String sexo;
	
	
	
	public Mascota() {
		this.nChip="";
	}
	
	public Mascota(String nombre, int a�o_nac, String nChip, String raza, String sexo) {
		super();
		this.nombre = nombre;
		this.a�o_nac = a�o_nac;
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

	public int getA�o_nac() {
		return a�o_nac;
	}

	public void setA�o_nac(int a�o_nac) {
		this.a�o_nac = a�o_nac;
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
		return "Mascota [nombre=" + nombre + ", a�o_nac=" + a�o_nac + ", nChip=" + nChip + ", raza=" + raza + ", sexo="
				+ sexo + "]";
	}
	
	
	
}
