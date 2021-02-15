package EJ5;
import java.util.Random;
public abstract class Persona {
//abstracta
	Random r=new Random();
	
	protected String nom;
	protected int edad;
	protected String sexo;
	
	String arrayNoms[]= {"Marc","Juan","Estefania","Calamardo","Mireia","Juana","Jose","Matias","Pepe","Maria","Anna","Adan","Eva"};
	String arraySexo[]= {"H","H","M","H","M","M","H","H","H","M","M","H","M"};
	
	
	
	public abstract boolean asiste();
	
}
