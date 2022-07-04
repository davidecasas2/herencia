package main;

import clases.Gato;
import clases.Mascota;
import clases.Perro;

public class Ppal {

	public static void main(String args[]) {
		
		Mascota m = new Mascota("Pipo",2020,"010101010101", "colie", "Macho");
		System.out.println("La mascota es "+m);
		
		m.desparasitar();
		m.vacunar();
		
		
		Perro p = new Perro();
		
		System.out.println(p);
		p.vacunar();
		
		Perro p2 = new Perro("Minie", 2018, "0202020202", "Chihuahua", "hembra", true, false);
		
		p2.cortarUñas();
		p2.vacunar();
		
		Mascota p3 =new Perro("Toby", 2018, "0303030303", "pitbul", "Macho", true, true);
		System.out.println(p3);
		p3.vacunar();
		((Perro)p3).cortarUñas();
		
		Gato g = new Gato("Rata", 2016, "0404040404", "americano", "macho", true);
		
		System.out.println(g);
		
		
		
	}
}
