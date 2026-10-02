package ejercicio3.codigo_original;

// Sin Javadoc de clase.
public class Figura {
	// Atributos públicos y no se validan valores negativos.
	public double base;
	public double altura;

	// Sin Javadoc.
	// El cálculo corresponde al de un rectángulo pero la clase representa cualquier figura.
	public double calcularArea() {
		return base * altura;
	}
}
