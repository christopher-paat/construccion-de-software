package ejercicio3.codigo_corregido;

/** 
 * Representa un rectángulo definido por su base y altura. 
 */
public class Rectangulo extends Figura {

    /**
     * Crea un rectángulo.
     *
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public String getNombre() {
        return "del rectángulo";
    }
}
