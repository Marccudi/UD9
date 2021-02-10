package EJ2;

public class Serie  implements Entregable{
	private String titulo="";
	private int numTemporadas=3;
	private boolean entregado=false;
	private String genero="";
	private String creador="";
	
	public Serie() {
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [getTitulo()=" + getTitulo() + ", getNumTemporadas()=" + getNumTemporadas() + ", getGenero()="
				+ getGenero() + ", getCreador()=" + getCreador() + "]";
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
		if (a instanceof Serie) {
			if (((Serie) a).numTemporadas > numTemporadas) {
				System.out.println("La serie "+((Serie) a).titulo+" tiene mas"
						+ " temporadas que "+titulo);
			}else {
				System.out.println("La serie "+titulo+" tiene mas"
						+ " temporadas que "+((Serie) a).titulo);
			}
		}
		
	}
	
	
}
