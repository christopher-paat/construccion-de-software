/**
 * Realiza operaciones matemáticas en base a un arreglo de datos.
 */
public class CalculadoraDatos {

	/**
	 * Calcula la suma de los elementos de un arreglo, omitiendo los valores negativos.
	 * 
	 * @param datos el arreglo de enteros a procesar
	 * @return la suma de todos los valores no negativos en el arreglo
	 * @throws IllegalArgumentException si el arreglo es null
	 */
	public static int sumarPositivos(int[] datos) {
		if (datos == null) {
			throw new IllegalArgumentException("El arreglo de datos no puede ser null");
		}

		int suma = 0;

		for (int dato : datos) {
			if (dato < 0) {
				System.out.println("Valor negativo encontrado, se omite");
				continue;
			}
			suma += dato;
		}
		
		return suma;
	}

	/**
	 * Punto de entrada del programa.
	 * 
	 * @param args argumentos de línea de comandos (no se utilizan)
	 */
	public static void main(String[] args) {
		int[] datos = {5, 10, -3, 8};
		
		
		int resultado = sumarPositivos(datos);
		int resultadoEsperado = 23; // 5 + 10 + 8 = 23
		
        // Verificamos que el resultado sea correcto
        if (resultado == resultadoEsperado) {
		    System.out.println(resultado);
        } else {
			System.out.println("Error en la prueba");
		}
	}
}
