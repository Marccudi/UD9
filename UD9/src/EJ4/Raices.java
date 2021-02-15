package EJ4;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double obtenerRaices() {
		double v= Math.sqrt(getDiscriminante());
		return v;
	}
	
	public double obtenerRaiz() {
		double v= Math.sqrt(getDiscriminante());
		return v;	
	}

	//dicriminante es lo que hay dentro de la raiz quadrada
	public double getDiscriminante(){
		double formula=Math.pow(b, 2)-(4*a*c);
		return formula;
	}
	
	//Devuelve true si tene 2 resultados
	public boolean tieneRaices() {
		boolean tieneRaiz=false;
		double disc=getDiscriminante();
		if (disc>0) {
			tieneRaiz=true;
		}
		return tieneRaiz;
	}
	
	//Devuelve true si tiene 1 resultado
	public boolean tieneRaiz() {
		boolean tieneRaiz=false;
		double disc=getDiscriminante();
		if (disc==0) {
			tieneRaiz=true;
		}
		return tieneRaiz;
	}
	 
	//metodo de los calculos finales y mostrar resultados
	public void calcular() {
		//ejecutamos la formula
		double v= obtenerRaices();
		double res1= (-b+v)/(2*a);
		double res2= (-b-v)/(2*a);
		
		
		//solo 1 resultado
		if (tieneRaiz()) {
			System.out.println(res1);
		}
		//2 resultados
		if (tieneRaices()) {
			System.out.println(res1);
			System.out.println(res2);
		}
		//ningun resultado
		if (getDiscriminante()<0) {
			System.out.println("La equacion no tiene solucion");
		}
		
	}
	
}
