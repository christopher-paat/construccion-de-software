package ejercicio3.codigo_corregido;

/** 
 * Representa una figura geométrica con base y altura. 
 */
public abstract class Figura {
    private final double base;
    private final double altura;

    /**
     * Crea una figura y valida sus dimensiones.
     *
     * @param base base de la figura
     * @param altura altura de la figura
     * @throws IllegalArgumentException si una dimensión no es positiva
     */
    protected Figura(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base y altura deben ser positivas");
        }
        this.base = base;
        this.altura = altura;
    }

    /** 
     * @return la base de la figura 
     */
    public double getBase() {
        return base;
    }

    /** 
     * @return la altura de la figura 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @return el área calculada de la figura 
     */
    public abstract double calcularArea();

    /** 
     * @return el nombre de la figura para mostrarlo al usuario 
     */
    public abstract String getNombre();
}
