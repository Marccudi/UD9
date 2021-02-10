package EJ1;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	final protected String COLOR_DEF="Blanco";
	final protected char CONSUMO_DEF='F';
	final protected double PRECIO_DEF=100;
	final protected double PESO_DEF=5;
	
	public Electrodomestico() {
		this.color=COLOR_DEF;
		this.consumoEnergetico=CONSUMO_DEF;
		this.precioBase=PRECIO_DEF;
		this.peso=PESO_DEF;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color=COLOR_DEF;
		this.consumoEnergetico=CONSUMO_DEF;
		
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		String a = comprobarColor(color);
		this.color = a;
		char s = comprobarConsumoEnegetico(consumoEnergetico);
		this.consumoEnergetico = s;
		this.peso = peso;
	}
	
	
	
	public static String comprobarColor(String color) {
		color.toLowerCase();
		String[] colores= {"blanco", "negro", "rojo", "azul", "gris"};
		boolean acierto=false;
		for (String col : colores) {
			if (color.equals(col)) {
				acierto=true;
			}
		}
		
		if (!acierto) {
			color="Blanco";
		}
		
		return color;
	}
	
	public static char comprobarConsumoEnegetico(char letra) {
		char[] letras= {'A', 'B', 'C', 'D', 'E', 'F',
				'a', 'b', 'c', 'd', 'e', 'f'
		};
		boolean acierto=false;
		for (char c : letras) {
			if (letra == c) {
				acierto=true;
			}
		}
		if (!acierto) {
			letra='f';
		}
		return letra;
	}
	
	public void precioFinal() {
		//Subimos precio por consumo Energetico
		switch (consumoEnergetico) {
		case 'a':
		case 'A':
			precioBase+=100.0;
			break;
		case 'b':
		case 'B':
			precioBase+=80.0;
			break;
		case 'c':
		case 'C':
			precioBase+=60.0;
			break;
		case 'd':
		case 'D':
			precioBase+=50.0;
			break;
		case 'e':
		case 'E':
			precioBase+=30.0;
			break;
		case 'f':
		case 'F':
			precioBase+=10.0;
			break;

		default:
			break;
		}
		
		if (peso<=19.0) {
			precioBase+=10.0;
		}else if (peso>=20.0 && peso<=49.0) {
			precioBase+=50.0;
		}else if (peso>=50.0 && peso<=79.0) {
			precioBase+=80.0;
		}else{
			precioBase+=100.0;
		}
		
	}
	

}
