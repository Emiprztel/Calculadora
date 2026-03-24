package proyecto.edes;

public class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}
	
	//nuevo metodo restar
	public int restar(int a, int b) {
	    return a - b; 
	}
	
	// nuevo método multiplicar
	public int multiplicar(int a, int b) {
	    return a * b;
	}
	
	//nuevo método dividir
	//public double dividir(int a, int b) {
	//   return (double) a / b; }
	
	//método dividir modificado
	public double dividir(int a, int b) {
	    if (b == 0) {
	        throw new IllegalArgumentException("No se puede dividir entre cero");
	    }
	    return (double) a / b;
	}




}
