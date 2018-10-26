import matrixapp.Matrix;

public class MatrixApp {

	public static void main(String... args) {

		Matrix matrix = new Matrix(5);
		matrix.setValues(new Matrix.MatrixGenerator() {

			@Override
			public double generateValueFor(int row, int col) {

				return row + col;
			}
		});
		matrix.setValues((r, c) -> r + c);
		matrix.setValues((r, c) -> r == c ? 1 : 0);

		System.out.println(matrix);
		
		for(double d:matrix) {
			System.out.println(d);
		}

	}

}
