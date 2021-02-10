package EJ3;

public class UD9Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro a = new Libro(123456, "Efecto Mariposa", "Manolito gafotas", 145);
		Libro b = new Libro(654321, "El camino de los reyes", "Brandon Sanderson", 1106);
		
		System.out.println(a.toString());
		System.out.println(b.toString());

		
		if (a.getNumPag()>b.getNumPag()) {
			System.out.println("El libro con más paginas es: "+a.getTitulo());
		}else {
			System.out.println("El libro con más paginas es: "+b.getTitulo());
		}
		
	}

}
