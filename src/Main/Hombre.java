package Main;

public class Hombre extends Persona {
	private final double TMBCONSTANT = 88.362;
	private final double TMBWEIGHTCONSTANT = 13.397 ;
	private final double TMBHEIGHTCONSTANT = 4.799;
	private final double TMBAGECONSTANT = 5.677;
	
	public Hombre (double peso, double altura, int edad) {
		super(peso, altura, edad);
		pesoMaximo = 110;
		pesoMinimo = 60;
		alturaMaxima = 195;
		alturaMinima = 160;
		edadMinima = 15;
			
	}
	
	public double calcularTMB() {
		if (puedeCalcularTMB()) {
			return TMBCONSTANT + (TMBWEIGHTCONSTANT*peso) + (TMBHEIGHTCONSTANT * altura) - (TMBAGECONSTANT*edad);
			
		}else {
			return -1;
		}
		
	}

}
