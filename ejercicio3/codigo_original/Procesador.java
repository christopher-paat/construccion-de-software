package ejercicio3.codigo_original;

// Sin Javadoc de clase.
// Nombre genérico.
public class Procesador {
	// Sin Javadoc (propósito, @param).
	// No valida que "figura" sea null.
	// Baja cohesión, el método calcula e imprime el resultado.
	public void imprimirArea(Figura figura) {
		// "instanceof" y el casteo acoplan el procesador a Triangulo.
		if (figura instanceof Triangulo) {
			// Nombre genérico.
			Triangulo t = (Triangulo) figura;
			System.out.println("Área del triángulo: " + t.calcularArea());
		} else {
			System.out.println("Área: " + figura.calcularArea());
		}
	}

	// Sin Javadoc.
	public static void main(String[] args) {
		// Nombre genérico.
		Procesador p = new Procesador();
		Figura rectangulo = new Figura();
		// Números mágicos.
		rectangulo.base = 4;
		rectangulo.altura = 5;

		Triangulo triangulo = new Triangulo();
		triangulo.base = 4;
		triangulo.altura = 5;
        
		// Imprime sin verificar los resultados esperados.
		p.imprimirArea(rectangulo);
		p.imprimirArea(triangulo);
	}
}
