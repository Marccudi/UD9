package EJ5;

public class Alumno extends Persona{


	protected int calificacionMates;
	protected int calificacionFisica;
	protected int calificacionFilosofia;
	

	public Alumno() {
		int rand= r.nextInt(13);
		this.nom=arrayNoms[rand];
		this.sexo=arraySexo[rand];
		rand=r.nextInt(6)+12;
		this.edad=rand;
		
		for (int i = 0; i < 3; i++) {
			rand=r.nextInt(11);
			switch (i) {
			case 0:
				this.calificacionMates=rand;
				break;
			case 1:
				this.calificacionFisica=rand;
				break;
			case 2:
				this.calificacionFilosofia=rand;
				break;

			default:
				break;
			}
			
		}

	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCalificacionMates() {
		return calificacionMates;
	}

	public void setCalificacionMates(int calificacionMates) {
		this.calificacionMates = calificacionMates;
	}

	public int getCalificacionFisica() {
		return calificacionFisica;
	}

	public void setCalificacionFisica(int calificacionFisica) {
		this.calificacionFisica = calificacionFisica;
	}

	public int getCalificacionFilosofia() {
		return calificacionFilosofia;
	}

	public void setCalificacionFilosofia(int calificacionFilosofia) {
		this.calificacionFilosofia = calificacionFilosofia;
	}


	@Override
	public String toString() {
		return "Alumno [nom=" + nom + ", edad=" + edad + ", sexo=" + sexo + ", calificacionMates=" + calificacionMates
				+ ", calificacionFisica=" + calificacionFisica + ", calificacionFilosofia=" + calificacionFilosofia
				+ "]";
	}


	//metodo que comprueba la assistencia
	public boolean asiste() {
		boolean res=true;
		
		int asistir=r.nextInt(10);
		//si da de 0 a 4 es el 50% de probabilidad de que falte a clase
		if (asistir<=4) {
			res=false;
		}
		
		return res;
	}
	
	
	

}
