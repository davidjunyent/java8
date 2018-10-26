package matrixapp;

import java.util.Iterator;

public class Matrix implements Iterable<Double> {

	private double[][] matrix;

	public Matrix(int side) {
		matrix = new double[side][side];
	}

	public Matrix(int rows, int cols) {
		matrix = new double[rows][cols];
	}

	public Matrix(double[][] matrix) {
		if (matrix == null)
			throw new IllegalArgumentException("Invalid null value argument, matrix");
		if (matrix.length > 0) {
			int lenghtFirstCol = matrix[0].length;
			for (double[] row : matrix) {
				if (row.length != lenghtFirstCol) {
					throw new IllegalArgumentException("The given matrix must be square");
				}
			}
		}
		this.matrix = matrix;
	}

	public void setValues(MatrixGenerator matrixGenerator) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = matrixGenerator.generateValueFor(i, j);
			}
		}
	}

	public interface MatrixGenerator {
		double generateValueFor(int row, int col);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (double[] row : matrix) {
			sb.append("[\t");

			for (double el : row) {
				sb.append(el + "\t");
			}
			sb.append("]\n");
		}

		return sb.toString();
	}

	private class MatrixRowIterator implements Iterator<Double> {

		int row = 0, col = -1;

		@Override
		public boolean hasNext() {

			if (col + 1 < Matrix.this.matrix[row].length) {
				col++;
				return true;

			}
			if (row < Matrix.this.matrix.length - 1) {
				row++;
				col = 0;
				return true;
			}
			return false;
		}

		@Override
		public Double next() {
			return Matrix.this.matrix[row][col];
		}

	}

	@Override
	public Iterator<Double> iterator() {
		@SuppressWarnings("unused")
		class MatrixColIterator implements Iterator<Double> {

			int row = -1, col = 0;

			@Override
			public boolean hasNext() {

				if (row + 1 < Matrix.this.matrix.length) {
					row++;
					return true;
				}
				if (col < Matrix.this.matrix[row].length-1) {
					row = 0;
					col++;
					return true;
				}
				return false;
			}

			@Override
			public Double next() {
				return Matrix.this.matrix[row][col];
			}
		}
		
		// Opcio 1 Member inner class
		return new MatrixRowIterator();

		// Opcio 2, Local inner class dins el metode
		//return new MatrixColIterator();
	}
}
