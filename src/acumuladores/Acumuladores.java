package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		if (mat == null || num <= 0) {
			return false;
		}
		
		for (int i = 0; i < mat.length; i++) {
			boolean todosMultiplos = true;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] % num != 0) {
					todosMultiplos = false;
				}
			}
			if (todosMultiplos) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		if (mat1 == null || mat2 == null || mat1.length != mat2.length) {
			return false;
		}
		
		for (int i = 0; i < mat1.length; i++) {
			boolean interseccion = false;
			
			for (int j = 0; j < mat1[i].length; j++) {
				for (int k = 0; k < mat2[i].length; k++) {
					if (mat1[i][j] == mat2[i][k]) {
						interseccion = true;
					}
				}
			}
			if (interseccion) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		if (nColum < 0 || nColum >= mat[0].length || mat == null) {
		    return false;
		}
		int acumCol = 0;
		for (int i = 0; i < mat.length; i++) {
			acumCol += mat[i][nColum];
		}
		
		for (int i = 0; i < mat.length; i++) {
			int acumFil = 0;
			
			for (int j = 0; j < mat[i].length; j++) {
				acumFil += mat[i][j];
			}
			if (acumFil > acumCol) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) { 
		if (mat1[0].length != mat2[0].length || mat1 == null || mat2 == null) {
			return false;
		}
		
		for (int c = 0; c < mat1[0].length; c++) {
			boolean interseccion = false;
			
			for (int i = 0; i < mat1.length; i++) {
		        for (int k = 0; k < mat2.length; k++) {
		            if (mat1[i][c] == mat2[k][c]) {
		                interseccion = true;
		            }
		        }
		    }
			if (interseccion) {
				return true;
			}
		}
		return false;
	}
}
