package Main;

public abstract class Persona {
	protected double peso;
	protected double altura;
	protected int edad;
	protected double pesoMaximo;
	protected double pesoMinimo;
	protected double alturaMaxima;
	protected double alturaMinima;
	protected int edadMinima;
	
	public Persona (double peso, double altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		
	}
	
	public boolean puedeCalcularTMB() {
		boolean puedeCalcularTMB = true;
		if(peso> pesoMaximo || peso < pesoMinimo) {
			puedeCalcularTMB = false;
		}else if(altura>alturaMaxima || altura < alturaMinima) {
			puedeCalcularTMB = false;
		}else if(edad <= edadMinima) {
			puedeCalcularTMB = false;
		}

		return puedeCalcularTMB;
		
	}
	
	public abstract double calcularTMB();
}

