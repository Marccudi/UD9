package EJ1;

public class Lavadora extends Electrodomestico{
	protected double carga=5.0;

	public Lavadora() {
		super();
	}

	public Lavadora(double precio, double peso) {
		super(precio,peso);
		
	}

	public Lavadora(double carga, double precioBase, String color, 
			char consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void precioFinal() {
		super.precioFinal();
		if (carga>30.0) {
			precioBase+=50;
		}
		
	}


	
}
