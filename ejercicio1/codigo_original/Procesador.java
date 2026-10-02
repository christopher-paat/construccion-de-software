// Sin Javadoc de clase.
// Nombre génerico.
public class Procesador {

	// Sin Javadoc (propósito, @param).
    // Nombre genérico.
	// Baja cohesión, el método imprime en lugar de retornar la suma.
	// No valida que "datos" sea null.
	public static void procesar(int[] datos) {
		int i = 0;
		int suma = 0;

		// Ciclo while propenso a errores dado que se escribe manualmente cada paso de control.
		while (i < datos.length) {
			// Suma el valor antes de verificar si debe omitirse.
			suma += datos[i];
			if (datos[i] < 0) {
				System.out.println("Valor negativo encontrado, se omite");
				// "continue" omite la instrucción "i++", creando un bucle infinito.
				continue;
			}
			i++;
		}
		System.out.println("Suma total: " + suma);
	}

	// Sin Javadoc.
	public static void main(String[] args) {
		int[] datos = {5, 10, -3, 8};
		// Imprime sin verificar el resultado esperado.
		procesar(datos);
	}
}
