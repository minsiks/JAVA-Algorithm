
package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberLee = new Member(101,"이순신");
		Member memberKim = new Member(102,"김유신");
		Member memberShin = new Member(103,"신사임당");
	
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		
	}

}
