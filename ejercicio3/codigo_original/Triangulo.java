package ejercicio3.codigo_original;

// Sin Javadoc de clase.
public class Triangulo extends Figura {
	// Sin Javadoc.
	// Falta la anotación @Override para indicar que se redefine el método de Figura.
	// No valida que la base o la altura sean valores positivos.
	public double calcularArea() {
		return (base * altura) / 2;
	}
}
