package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();	
		
		Member memberLee = new Member(101,"�̼���");
		Member memberKim = new Member(102,"������");
		Member memberShin = new Member(103,"�Ż��Ӵ�");
	
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
		memberTreeMap.showAllMember();
		
//		memberTreeMap.removeMember(101);
//		
//		memberTreeMap.showAllMember();
	}

}
