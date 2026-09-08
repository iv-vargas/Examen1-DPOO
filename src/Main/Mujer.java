package Main;

public class Mujer extends Persona {
	private final double TMBCONSTANT = 447.593;
	private final double TMBWEIGHTCONSTANT = 9.247 ;
	private final double TMBHEIGHTCONSTANT = 3.098;
	private final double TMBAGECONSTANT = 4.33;
	
	public Mujer (float peso, float altura, int edad) {
		super(peso, altura, edad);
		pesoMaximo = 80;
		pesoMinimo = 40;
		alturaMaxima = 180;
		alturaMinima = 140;
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
