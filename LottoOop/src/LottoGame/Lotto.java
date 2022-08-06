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



	//��÷��ȣ set + �� ��ȣ set + ��ġ�ϴ� ���� count
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
			
	
// e1 num�� �ߺ����� �̹� �߻��ؼ� count�ǳ�? �ߺ��̸� set�� ������� ������
// luckyset�� ���ؼ� count�� �Ǿ����
// e2 count�� 0�϶� -1�ϸ� �ȵ�. e3 �ϳ��� �پ��� ����
		
		System.out.println("��÷��ȣ" + luckyset);
		System.out.println("�� ��ȣ" + myset);
		System.out.println("��ġ�ϴ� ��: " + count + "��");
		this.count = count;
		
	}

	// ����
	public int getRank() {
		rank = 7 - count;
		return rank;
	}
	
	// ��÷��
	public double getMoney() {
		money = count * 1000000.0;
		return money;
	}

	
}
