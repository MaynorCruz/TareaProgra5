
public class Ejercicios
{
	
	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
		return mi_arreglo[columna][fila];
	}
	
	//Devuelve la cantidad de columnas de mi_arreglo
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
		return mi_arreglo.length;
	}
	
	//Devuelve la cantidad de filas de mi_arreglo
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		return mi_arreglo[1].length;
	}
	
	//Devuelve la cantidad de elementos que puede alacenar mi_arreglo
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
