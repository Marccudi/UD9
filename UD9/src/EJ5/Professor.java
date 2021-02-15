package EJ5;

import java.util.Arrays;

public class Professor extends Persona{

	protected String materia;
	
	protected final String arrayMaterias[]= {"Matematicas", "Filosofia", "Fisica"};

	
	
	public Professor() {
		int rand= r.nextInt(13);
		this.nom=arrayNoms[rand];
		this.sexo=arraySexo[rand];
		rand=r.nextInt(44)+21;
		this.edad=rand;		
		rand=r.nextInt(3);
		this.materia = arrayMaterias[rand];
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


	public String getMateria() {
		return materia;
	}



	@Override
	public String toString() {
		return "Professor [materia=" + materia + ", nom=" + nom + ", edad=" + edad + ", sexo=" + sexo + "]";
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}


	

	public boolean asiste() {
		boolean res=true;
		
		int asistir=r.nextInt(10);
		//si da 1 o 0 es el 20% de probabilidad de que falte a clase
		if (asistir<=1) {
			res=false;
		}
		
		return res;
	}

}
