package EJ1;

public class Television extends Electrodomestico{
	private double resolucion=20.0;
	private boolean sintonizadorTdt=false;
	
	public Television() {
		super();
	}

	public Television(double precio, double peso) {
		super(precio, peso);
	}

	public Television(double resolucion, boolean sintonizadorTdt, double precioBase, 
			String color, char consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (resolucion>40.0) {
			precioBase*=1.3;
		}
		
		if (sintonizadorTdt) {
			precioBase+=50;
		}
		
	}
	
	
	
	
	
}
