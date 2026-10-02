package ejercicio2.codigo_corregido;

import java.util.ArrayList;
import java.util.List;

/** 
 * Gestiona la eliminación de clientes inactivos. 
 */
public class GestorClientes {

	/**
	 * Elimina todos los clientes cuyo nombre coincide con el valor indicado.
	 *
	 * @param clientes lista de clientes que se modificará
	 * @param inactivo nombre del cliente que debe eliminarse
	 * @throws IllegalArgumentException si la lista o el nombre son null
	 */
	public static void eliminarClientesInactivos(List<String> clientes, String inactivo) {
		if (clientes == null) {
			throw new IllegalArgumentException("La lista de clientes no puede ser null");
		}
		if (inactivo == null) {
			throw new IllegalArgumentException("El cliente inactivo no puede ser null");
		}

        // Elimina los elementos de la colección que cumplan con la condición dada.
		clientes.removeIf(cliente -> inactivo.equals(cliente));
	}

	/**
	 * Punto de entrada del programa.
	 * 
	 * @param args argumentos de línea de comandos (no se utilizan)
	 */	
    public static void main(String[] args) {
		List<String> clientes = new ArrayList<>();
		clientes.add("Juan");
		clientes.add("Pedro");
		clientes.add("Pedro");

		eliminarClientesInactivos(clientes, "Pedro");
		List<String> resultadoEsperado = new ArrayList<>();
		resultadoEsperado.add("Juan");

        // Verificamos que el resultado sea correcto
		if (clientes.equals(resultadoEsperado)) {
			System.out.println(clientes);
		} else {
			System.out.println("Error en la prueba");
		}
	}
}
