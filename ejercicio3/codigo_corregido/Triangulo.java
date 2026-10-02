package ejercicio3.codigo_corregido;

/** 
 * Representa un triángulo definido por su base y altura. 
 */
public class Triangulo extends Figura {

    /**
     * Crea un triángulo.
     *
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public String getNombre() {
        return "del triángulo";
    }
}
