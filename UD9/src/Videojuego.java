
public class Videojuego implements Entregable{
	private String titulo="";
	private double HorasEstimadas=10.0;
	private boolean entregado=false;
	private String genero="";
	private String companyia="";
	
	public Videojuego() {

	}
	
	
	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		HorasEstimadas = horasEstimadas;
	}

	
	public Videojuego(String titulo, double horasEstimadas, String genero, String companyia) {
		super();
		this.titulo = titulo;
		HorasEstimadas = horasEstimadas;
		this.genero = genero;
		this.companyia = companyia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return HorasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		HorasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompanyia() {
		return companyia;
	}

	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}

	@Override
	public String toString() {
		return "Videojuego [getTitulo()=" + getTitulo() + ", getHorasEstimadas()=" + getHorasEstimadas()
				+ ", getGenero()=" + getGenero() + ", getCompanyia()=" + getCompanyia() + "]";
	}
	
	@Override
	public void entregar() {
		entregado=true;
		
	}
	
	@Override
	public void devolver() {
		entregado=false;
		
	}
	
	@Override
	public boolean isEntregado() {
		return entregado;
	}
	
	@Override
	public void compareTo(Object a) {
		if (a instanceof Videojuego) {
			if (((Videojuego) a).HorasEstimadas > HorasEstimadas) {
				System.out.println("El videojuego "+((Videojuego) a).titulo+" dura mas"
						+ " horas que "+titulo);
			}else {
				System.out.println("El videojuego "+titulo+" dura mas"
						+ " horas que "+((Videojuego) a).titulo);
			}
		}
		
	}
	
}

