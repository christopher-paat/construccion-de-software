package ejercicio3.codigo_corregido;

/** 
 * Calcula y muestra el área de figuras geométricas. 
 */
public class CalculadoraAreas {
    private static final double BASE = 4;
    private static final double ALTURA = 5;

    /**
     * Calcula el área de una figura.
     *
     * @param figura figura a la que se le desea calcular el área
     * @return el área de la figura
     * @throws IllegalArgumentException si la figura es null
     */
    public double calcularArea(Figura figura) {
        if (figura == null) {
            throw new IllegalArgumentException("La figura no puede ser null");
        }
        return figura.calcularArea();
    }

    /**
     * Imprime el área de una figura.
     *
     * @param figura figura cuyo resultado se mostrará
     */
    public void imprimirArea(Figura figura) {
        System.out.println("Área " + figura.getNombre() + ": " + calcularArea(figura));
    }

    /**
	 * Punto de entrada del programa.
	 * 
	 * @param args argumentos de línea de comandos (no se utilizan)
	 */
    public static void main(String[] args) {
        CalculadoraAreas calculadora = new CalculadoraAreas();
        Figura rectangulo = new Rectangulo(BASE, ALTURA);
        Figura triangulo = new Triangulo(BASE, ALTURA);
        double areaRectangulo = calculadora.calcularArea(rectangulo);
        double areaTriangulo = calculadora.calcularArea(triangulo);
        
        double areaRectanguloEsperada = 20;
        double areaTrianguloEsperada = 10;
        
        if (areaRectangulo == areaRectanguloEsperada && areaTriangulo == areaTrianguloEsperada) {
            calculadora.imprimirArea(rectangulo);
            calculadora.imprimirArea(triangulo);
        } else {
            System.out.println("Error en la prueba");
        }
    }
}
