public class CodigoParaRefactorizar{
	private static final double IVA = 0.21;

	public double calculoIva(double precioBase) {
		return precioBase + (0.21 * precioBase);
	}
	
	public double calculoIva(double precioBase, double porcentajeDescuento) {
		return calculoIva(precioBase) - (calculoIva(precioBase) * porcentajeDescuento/100);
	}

	public int diasMes(int mes, int anio) {

		int diasMes = 0;

		switch (mes) {

			case 1:
	
			case 3:
	
			case 5:
	
			case 7:
	
			case 8:
	
			case 10:
	
			case 12:
				diasMes = 31;
				break;
	
			case 4:
	
			case 6:
	
			case 9:
	
			case 11:
				diasMes = 30;
				break;
	
			case 2:
				if (
						//Comprueba si es bisiesto el año
						(anio % 400 == 0) ||((anio % 4 == 0) && (anio % 100 != 0))
					) 
	
					diasMes = 29;
	
				else
					diasMes = 28;
	
				break;
	
		}

		return diasMes;

	}

	public double subidaPrecio(double precioBase, double subida) {
		precioBase = precioBase + subida;
		return precioBase;
	}

	public double precioConIVA(double precioBase){
		return calculoIva(precioBase);
	}

	public void mostrarPrecios(double precioBase, double precioConIVA) {
		System.out.println("El nuevo precio base es " + precioBase);
		System.out.println("El precio con IVA es " + precioConIVA);
	}

}
