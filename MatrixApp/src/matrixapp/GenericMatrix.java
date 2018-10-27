package matrixapp;

import java.util.ArrayList;
import java.util.List;

public class GenericMatrix<T> {

	private List<List<T>> listMatrix;

	public GenericMatrix(int rows, int cols) {
		listMatrix = new ArrayList<List<T>>(rows);
		for (int i = 0; i < rows; i++) {
			listMatrix.set(i, new ArrayList<T>());
		}
	}

	public void setValue(int row, int col, T value) {
		listMatrix.get(row).set(col, value);
	}

	public T getValue(int row, int col) {
		return listMatrix.get(row).get(col);
	}

}
