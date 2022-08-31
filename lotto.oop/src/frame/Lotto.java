package frame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto extends Abstract{
	
private int count;
private int rank;
private double money;
private Set<Integer> luckyset;
private Set<Integer> myset;


	
public Lotto() {
	}



	public Lotto(int count, int rank, double money, Set<Integer> luckyset, Set<Integer> myset) {
		this.count = count;
		this.rank = rank;
		this.money = money;
		this.luckyset = luckyset;
		this.myset = myset;
}


	//당첨번호 set + 내 번호 set + 일치하는 개수 count
	public void draw(Customer c){
		count = 0;
			
		Set<Integer> luckyset = new HashSet<Integer>();
		Random r = new Random();
		Set<Integer> myset = new HashSet<Integer>();
		Random k = new Random();
		
		if(c.getTicket() >= 1) {
			

			while(luckyset.size() < 6) {
				int num = r.nextInt(45) + 1;
				luckyset.add(num);
			}
			
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

			this.luckyset = luckyset;
			this.myset = myset;
			rank = 7 - count;
			c.setTicket(c.getTicket() - 1);
			
		} else {
			System.out.println("티켓이 없습니다.");
			rank = 0;
			luckyset = null;
			myset = null;
		} 
		money += count * 100000;
			
			
	}

	// 순위
	public int getRank() {
		return rank;
	}
	
	// 당첨금
	public double getMoney() {
		return money;
	}
	
	public int getCount() {
		return count;
	}

	public String getResult() {
		String result = "일치하는 수: " + count + "개";
		return result;
	}


	public String getLuckyset() {
		return "당첨번호: " + luckyset;
	}


	public String getMyset() {
		return "내 번호: " + myset;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "Lotto [count=" + count + ", rank=" + rank + ", money=" + money + ", luckyset=" + luckyset + ", myset="
				+ myset + "]";
	}
	
	
	
}



	
	
