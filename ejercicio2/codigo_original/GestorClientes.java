package ejercicio2.codigo_original;

import java.util.ArrayList;
import java.util.List;

// Sin javadoc de clase.
public class GestorClientes {

    // Sin Javadoc (propósito, @param).
    // Nombre genérico.
	// No valida si "clientes" o "inactivo" son null.
	public static void eliminarInactivos(List<String> clientes, String inactivo) {

		// Eliminar elementos durante un for-each puede provocar ConcurrentModificationException.
		for (String cliente : clientes) {
			// "==" compara referencias, se debe usar "equals()".
			if (cliente == inactivo) {
				clientes.remove(cliente);
			}
		}
	}

    // Sin javadoc.
	public static void main(String[] args) {
		List<String> clientes = new ArrayList<>();
		clientes.add("Juan");
		clientes.add("Pedro");
		// new String("Pedro") crea un objeto innecesario para representar el mismo texto.
		clientes.add(new String("Pedro"));
		
		eliminarInactivos(clientes, "Pedro");
        // Imprime sin verificar el resultado esperado.
		System.out.println(clientes);
	}
}
