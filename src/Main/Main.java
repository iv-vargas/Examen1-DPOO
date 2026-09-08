package Main;

public class Main {
	public static void main(String[] args) {
        Hombre hombre1 = new Hombre(70, 160,40);
        Mujer mujer1 = new Mujer(70, 140,23);
        Persona ninho1 = new Mujer(30, 120, 15);
        
        System.out.println(hombre1.calcularTMB());
        System.out.println(mujer1.calcularTMB());
        System.out.println(ninho1.calcularTMB());
    }

}
