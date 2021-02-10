
public class Libro {
	private int ISBN;
	private String Titulo;
	private String Autor;
	private int numPag;
	
	
	
	public Libro(int iSBN, String titulo, String autor, int numPag) {
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
		this.numPag = numPag;
	}
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	@Override
	public String toString() {
		return "El libro "+Titulo+" con ISBN "+ISBN+" creado por el autor "+Autor+" tiene "+
				numPag+" páginas";
	}
	
	
	
	
	
}
