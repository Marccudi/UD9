package EJ5;
import java.util.Random;

public class Aula {
	Random r=new Random();

	protected int id;
	protected int maxEstudiantes;
	protected String materia;
	protected int MAXEST_DEF=16;
	
	protected final String arrayMaterias[]= {"Matematicas", "Filosofia", "Fisica"};

	public Aula(int id) {
		this.id = id;
		this.maxEstudiantes = MAXEST_DEF;
		int num=r.nextInt(3);
		this.materia = arrayMaterias[num];
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}






	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}






	public String getMateria() {
		return materia;
	}






	public void setMateria(String materia) {
		this.materia = materia;
	}






	public void rellenar() {
		int minEstudiantes=maxEstudiantes/2;
		int asistenciaAlumnos=0;
		int aprobadosH=0;
		int aprobadosM=0;
		int nota=0;
		
		//Comprobar alumnos
		for (int i = 0; i < maxEstudiantes; i++) {
			Alumno alumn = new Alumno();
			if (alumn.asiste()) {
				asistenciaAlumnos++;
				
				switch (materia) {
				case "Matematicas":
					nota=alumn.calificacionMates;
					break;
				case "Filosofia":
					nota=alumn.calificacionFilosofia;
					break;
				case "Fisica":
					nota=alumn.calificacionFisica;
					break;

				default:
					break;
				}
				
				if (alumn.getSexo().equals("H")) {
					if (nota>=5) {
						aprobadosH++;
					}
				}else if(alumn.getSexo().equals("M")){
					if (nota>=5) {
						aprobadosM++;
					}
				}

			}

		}
		Professor profe = new Professor();
		
		//Comprobar si se puede dar clases
		
		if (profe.asiste() && profe.getMateria().equals(materia) && asistenciaAlumnos>=minEstudiantes) {
			System.out.println("Alumnos aprobados: "+aprobadosH);
			System.out.println("Alumnas aprobadas: "+aprobadosM);
			System.out.println("-------");
			System.out.println("Alumnos presentes: "+asistenciaAlumnos);
			System.out.println("Profesor asiste:"+profe.asiste());
			System.out.println("Materia profe: "+profe.getMateria());
			System.out.println("Materia aula: "+this.getMateria());
		}else {
			System.out.println("No se puede dar la clase");
			System.out.println("-------");
			System.out.println("Alumnos presentes: "+asistenciaAlumnos);
			System.out.println("Profesor asiste:"+profe.asiste());
			System.out.println("Materia profe: "+profe.getMateria());
			System.out.println("Materia aula: "+this.getMateria());

		}
		
	}
	
	
	
	
}
