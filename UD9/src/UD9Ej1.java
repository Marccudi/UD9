public class UD9Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico array[]= new Electrodomestico[10];
		
		array[0]=new Lavadora();
		array[1]=new Lavadora(200, 50);
		array[2]=new Television();
		array[3]=new Television(100, 50);
		array[4]=new Lavadora(100.0 , 100, "Azul", 'F', 50);
		array[5]=new Television(41, false, 200, "gris", 'A', 50);
		array[6]=new Lavadora(100.0 , 200, "berde", 'B', 450);
		array[7]=new Television(20, false,500, "Amariyo", 'C', 40);
		array[8]=new Lavadora();
		array[9]=new Television();

		
		double precioTv=0;
		double precioLavadora=0;
		double preciosTotales=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Lavadora) {
				precioLavadora+=array[i].precioBase;
				preciosTotales+=array[i].precioBase;
			}else if(array[i] instanceof Television) {
				precioTv+=array[i].precioBase;
				preciosTotales+=array[i].precioBase;
			}
		}
		
		System.out.println(array[5].precioBase);		
		array[5].precioFinal();
		System.out.println(array[5].precioBase);	
		
		
		System.out.println("TV: "+precioTv);
		System.out.println("Lavadora: "+precioLavadora);
		System.out.println("Electrodomestico: "+preciosTotales);
		
		
		
		
	
	}

}
