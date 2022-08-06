package LottoGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	private int count;
	private int rank;
	private int money;
	
	public void draw() {
		Random r = new Random();
		int a = r.nextInt();
		HashSet<Integer> res = new HashSet<Integer>();
		res.add(a);
	}
}
