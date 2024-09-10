
public class FamilyMemberTest {

	public static void main(String[] args) {
		System.out.println("the "+FamilyMember.familyName+ " family has $"+FamilyMember.commonFund);
		System.out.println("----------------------");
		FamilyMember[] arrayFamily;
		arrayFamily = new FamilyMember[4];
		arrayFamily[0] = new FamilyMember("John", 254639.12);
		arrayFamily[1] = new FamilyMember("Erika", 187346.56);
		arrayFamily[2] = new FamilyMember("James", 56783.12);
		arrayFamily[3] = new FamilyMember("Paris", 12124.88);
		for(int i = 0;i < 4; i++) {
			arrayFamily[i].printPrivateFund();
		}
		System.out.println("----------------------");
		arrayFamily[1].contributeToComonFund(10000);
		arrayFamily[3].contributeToComonFund(10000);
		for(int i = 0;i < 4; i++) {
			arrayFamily[i].printPrivateFund();
		}
		System.out.println("----------------------");
		FamilyMember.printFamilyFund();
		System.out.println("----------------------");
	}

}
