package U11_one_star;

import java.util.*;

public class S11_13 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; ++i) {
			list.add(sc.nextInt());
		}

		removeDuplicate(list);

		for (int i = 0; i < list.size(); ++i) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
	}
}
