public class TestPeopleID {
	public static void main(String[] args) {
		Date dobObj = new Date(23, 4, 2000);
		Name nameObj = new Name("Waingping", "Sangjun");
		Address addressObj = new Address("81/9", "2", "ChiangMai-HangDong", "Sunpakwan", "Hang Dong", "ChiangMai",
				"50230");
		String idObj = "3-5015-00274-987";
		PeopleID peopleIDObj = new PeopleID(nameObj, idObj, dobObj, addressObj);
		System.out.println("--------------------------------------------");
		System.out.print("The name of peopleIDObj is ");
		peopleIDObj.printPeopleID();
		System.out.print("The postcode of the peopleIDObj is ");
		peopleIDObj.name.printname();
		System.out.println("--------------------------------------------");
		System.out.println(peopleIDObj.address.postcode);
	}
}