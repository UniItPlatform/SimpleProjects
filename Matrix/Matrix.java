public class Matrix {

/**
конструкторы: пустой, с размером, копирования
методы сама
геттеры сеттеры не возвращать матрицы они только для элементов
сумма, разность, произведение, определитель, обратная, треугольник(private), ранг
исключения
**/

	private int n;
	private int m;
	private int[][] content;

	//пустой конструктор
	Matrix() {

		// установить константу на размер или вообще запретить такой конструктор

	}

	//конструктор с размером
	Matrix(int newN, int newM) {

		n = newN;
		m = newM;
		content = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				content[i][j] = 0;
			}
		}

	}

	//конструктор копии

	//set
	public void Set(int row, int column, int newValue) {
		content[row][column] = newValue;
	}

	//get
	public int Get(int row, int column) {
		return content[row][column];
	}
	private int GetN() {
		return n;
	}
	private int GetM() {
		return m;
	}

	//проверка на одинаковость для суммы и разности
	private boolean CheckSize(Matrix a, Matrix b) {

		if (a.GetN() == b.GetN() && a.GetM() == b.GetM()) {
			return true;
		}

		return false;

	}

	// проверка на возможность умножения
	private boolean CheckSizeForMultiply(Matrix a, Matrix b) {

		if (a.GetM() == b.GetN()) {
			return true;
		}

		return false;

	}

	//сумма
	public Matrix Sum(Matrix a, Matrix b) {

		if (CheckSize(a,b)) {

			int thisN = a.GetN();
			int thisM = a.GetM();
			Matrix result = new Matrix(thisN, thisM);
			
			for (int i = 0; i < thisN; i++) {
				for (int j = 0; j < thisM; j++) {
					result[i][j] = a.Get(i,j) + b.Get(i,j);
				}
			}

			return result;

		}

		// exception

	}

	//разность
	public Matrix Substract(Matrix a, Matrix b) {

		if (CheckSize(a,b)) {


			int thisN = a.GetN();
			int thisM = a.GetM();
			Matrix result = new Matrix(thisN, thisM);

			for (int i = 0; i < thisN; i++) {
				for (int j = 0; j < thisM; j++) {
					result[i][j] = a.Get(i,j) - b.Get(i,j);
				}
			}

			return result;

		}

		// exception

	}

	//произведение
	public Matrix Multiply(Matrix a, Matrix b) {

		if (CheckSizeForMultiply(a,b)) {

			int thisN = a.GetN();
			int thisM = b.GetM();
			Matrix result = new Matrix(thisN, thisM);

			for (int i = 0; i < thisN; i++) {
				for (int j = 0; j < thisM; j++) {
					for (int k = 0; k < a.GetM(); k++) {
						result[i][j] += a.Get(k,i) * b.Get(j.k);
					}
				}
			}

			return result;

		}

		// exception

	}

	//треугольник (приват)
	//проверка на квадрат (приват)
	//определитель
	//ранг

}