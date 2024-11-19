package boletin4;

public class Ej5 {

	// Función que busca todos los índices de un valor en el array
	public static int[] buscarTodos(int[] t, int valor) {
		// Crear un array para almacenar los índices, asumiendo el peor caso en que
		// todos los elementos coinciden
		int[] indicesTemp = new int[t.length];
		int contador = 0;

		// Recorrer todos los elementos del array
		for (int i = 0; i < t.length; i++) {
			// Si encuentra el valor, agregar el índice al array temporal
			if (t[i] == valor) {
				indicesTemp[contador++] = i;
			}
		}

		// Crear un array del tamaño exacto para almacenar los índices encontrados
		int[] resultado = new int[contador];
		for (int i = 0; i < contador; i++) {
			resultado[i] = indicesTemp[i];
		}

		return resultado;
	}

	// Método main para probar la función
	public static void main(String[] args) {
		// Crear un array de ejemplo
		int[] tabla = { 10, 20, 30, 10, 40, 10, 50 };

		// Valor a buscar
		int valor = 10;

		// Llamar a la función buscarTodos
		int[] indicesEncontrados = buscarTodos(tabla, valor);

		// Imprimir el resultado
		System.out.println("Índices donde se encuentra el valor " + valor + ":");
		for (int indice : indicesEncontrados) {
			System.out.print(indice + " ");
		}

		// Probar con un valor que no está en el array
		valor = 60;
		indicesEncontrados = buscarTodos(tabla, valor);

		// Imprimir el resultado
		System.out.println("\nÍndices donde se encuentra el valor " + valor + ":");
		for (int indice : indicesEncontrados) {
			System.out.print(indice + " ");
		}
	}
}
