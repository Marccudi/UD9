package EJ2;

public class UD9Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Videojuego arrayV[]= new Videojuego[5];
		Serie arrayS[]= new Serie[5];
		
		arrayV[0]=new Videojuego("Last of us", 100);
		arrayV[1]=new Videojuego("God of war", 70, "Hack n slash", "Santa Monica");
		arrayV[2]=new Videojuego("Persona 5 Royal",170);
		arrayV[3]=new Videojuego("Binding of isaac",1000);
		arrayV[4]=new Videojuego("Hades",500);
		
		arrayS[0]=new Serie("Daredevil", "Marvel");
		arrayS[1]=new Serie("Luck cage", 2, "Superheroes","Marvel");
		arrayS[2]=new Serie("Peacky blinders", 5, "Drama", "Manolito gafotas");
		arrayS[3]=new Serie("Breaking bad", 6, "Suspense", "Bill Murray");
		arrayS[4]=new Serie("Mandalorian", 2, "Accion", "Disney");

		
		arrayV[0].entregar();
		arrayV[4].entregar();
		
		arrayS[4].entregar();
		arrayS[2].entregar();
		
		int numS=0;
		int numV=0;
		
		int numTS=0;
		double NumHV=0.0;
		
		String nombreS="";
		String nombreV="";
		
		for (Serie serie : arrayS) {
			if (serie.isEntregado()) {
				numS++;
			}
			
			if (serie.getNumTemporadas()>numTS) {
				nombreS=serie.getTitulo();
				numTS=serie.getNumTemporadas();
			}
		}
		
		
		for (Videojuego juego : arrayV) {
			if (juego.isEntregado()) {
				numV++;
			}
			if (juego.getHorasEstimadas()>NumHV) {
				nombreV=juego.getTitulo();
				NumHV=juego.getHorasEstimadas();
			}
		}
		
		System.out.println("Numero de series entregadas: "+numS);
		System.out.println("Numero de videouegos entregados: "+numV);
		
		System.out.println("Juego con mas horas estimadas: " + nombreV);
		System.out.println("Serie con mas temporadas: " + nombreS);

		//compare to
//		arrayV[2].compareTo(arrayV[3]);
//		arrayS[2].compareTo(arrayS[3]);
		
	}

}
