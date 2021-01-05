package U11_one_star;

import java.util.*;

public class S11_9 {
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.set();
		matrix.findrow();
		matrix.findcol();
		matrix.print1();
	}

}

class Matrix {

	public int n;

	public double random;

	public int max;

	Scanner input = new Scanner(System.in);
	ArrayList<Integer> row = new ArrayList<>();
	ArrayList<Integer> col = new ArrayList<>();
	int[][] a = new int[10][10];

	public void set() {
		System.out.print("enter the n:");
		n = input.nextInt();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				random = (Math.random() > 0.5 ? 1 : 0);
				a[i][j] = (int) (random);
				if (j < n - 1)
					System.out.print(a[i][j] + " ");
				else
					System.out.println(a[i][j]);
			}
	}

	public void findrow() {
		int max = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				row.clear();
				row.add(i);
			} else if (count == max) {
				row.add(i);
			}
		}

	}

	public void findcol() {
		int max = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j][i] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				col.clear();
				col.add(i);
			} else if (count == max) {
				col.add(i);
			}
		}

	}

	public void print1() {
		int l1 = row.size();
		int l2 = col.size();

		System.out.print("row ");
		for (int i = 0; i < l1; i++)
			System.out.print(row.get(i) + 1 + ",");
		System.out.println();
		System.out.print("col ");
		for (int i = 0; i < l2; i++)
			System.out.print(col.get(i) + 1 + ",");

	}
}