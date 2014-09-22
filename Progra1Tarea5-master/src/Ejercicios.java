
public class Ejercicios
{
	// Creamos el arreglo que vuelva la posicion de la columna
	// En el mismo arreglo creamos la posici0n que devuelva la fila
	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
		return mi_arreglo[columna][fila];
	}
	
	//Devuelve la cantidad de columnas de mi_arreglo
	//Creamos el arreglo dentro del return para devolver lo que se nos pide 
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
		return mi_arreglo.length;
	}
	
	//Devuelve la cantidad de filas de mi_arreglo
	// Creamos el mismo arreglo para devolver la cantidad de filas que se nos pide
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		return mi_arreglo[1].length;
	}
	
	//Devuelve la cantidad de elementos que puede alacenar mi_arreglo
	// Primero creamos la suma
	// Agregamos un ciclo for para para la columnas y las sumas
	// En return cramos suma.
	static int obtenerCantidadElementos(double mi_arreglo[][])
	{
		double suma = 0;
		
		for(int columna = 0; columna < mi_arreglo.length; columna++)
		{
			suma = suma + mi_arreglo[columna].length;
		}
		
		return (int)suma;
	}
	
	//Devuelve la sua de todos los elementos de mi_arreglo
	// Declaramos la sumas con valor inicial de cero
	// Iniciamos en cilco for para las filas y suma
	// Devuelve la suma en return
	static double sumaElementos(double mi_arreglo[][])
	{
		double suma = 0;
		
		for(int columna = 0; columna < mi_arreglo.length; columna++)
		{
			for(int fila = 0; fila < mi_arreglo[columna].length; fila++)
			{
				suma = suma + mi_arreglo[columna][fila];
			}
		}
		
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos de mi_arreglo
	// Creamos la suma y el promedio
	// Inicamos el ciclo for para las filas y columnas
	// Devuelve la sumas y el promedio en return
	static double promedioElementos(double mi_arreglo[][])
	{
		double suma = 0;
		double promedio = 0;
		
		for(int columna = 0; columna < mi_arreglo.length; columna++)
		{
			for(int fila = 0; fila < mi_arreglo[columna].length; fila++)
			{
				suma = suma + mi_arreglo[columna][fila];
				
			}
			promedio = promedio + mi_arreglo[columna].length;
		}
		
		return suma / promedio;
	}
	
	//Devuelve verdadero si num esta en mi_arreglo, de lo contrario devuelve false
	// Iniciamos con el ciclo for para las columnas
	// HAcemos otro ciclo for para las filas
	// Creamos la sentencia 
	static boolean existe(double mi_arreglo[][], int num)
	{
		for(int columna = 0; columna < mi_arreglo.length; columna++)
		{
			for(int fila = 0; fila < mi_arreglo[columna].length; fila++)
			{
				if(mi_arreglo[columna][fila] == num)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
