package LottoGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	
private int count;
private int rank;
private double money;


	
public Lotto() {
	}



	public Lotto(int count, int rank, double money) {
	this.count = 0;
	this.rank = rank;
	this.money = money;
}



	//당첨번호 set + 내 번호 set + 일치하는 개수 count
	public void draw(){
		Set<Integer> luckyset = new HashSet<Integer>();
		Random r = new Random();
		
		while(luckyset.size() < 6) {
			int num = r.nextInt(45) + 1;
			luckyset.add(num);
		}

		Set<Integer> myset = new HashSet<Integer>();
		Random k = new Random();
		
		
		while(myset.size() < 6) {
			int num = k.nextInt(45) + 1;
			boolean same = luckyset.contains(num);
	
			if(!myset.contains(num)) {
				myset.add(num);
				if(same) {
					count++;
				}
			}
		}
			
	
// e1 num이 중복으로 이미 발생해서 count되나? 중복이면 set에 담기지는 않지만
// luckyset과 비교해서 count는 되어버림
// e2 count가 0일때 -1하면 안됨. e3 하나가 줄어드는 오류
		
		System.out.println("당첨번호" + luckyset);
		System.out.println("내 번호" + myset);
		System.out.println("일치하는 수: " + count + "개");
		this.count = count;
		
	}

	// 순위
	public int getRank() {
		rank = 7 - count;
		return rank;
	}
	
	// 당첨금
	public double getMoney() {
		money = count * 1000000.0;
		return money;
	}

	
}
