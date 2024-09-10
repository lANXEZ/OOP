public class Address {
	String houseNO = "-";
	String soi = "-";
	String road = "-";
	String subDistrict = "-";
	String district = "-";
	String province = "-";
	String postcode = "-";
	
	Address(String houseNo, String Soi, String Road, String subDistrict, String district, String province, String postcode){
		this.houseNO = houseNo;
		this.soi = Soi;
		this.road = Road;
		this.subDistrict = subDistrict;
		this.district = district;
		this.province = province;
		this.postcode = postcode;
	}
	Address(String district, String province) {
		this.district = district;
		this.province = province;
	}
	void printFullAddress() {
		System.out.printf("%s, %s, %s, %s, %s, %s, %s",houseNO,soi,road,subDistrict,district,province,postcode);
		System.out.println("");
	}
	void printShortAddress() {
		System.out.printf("%s, %s", district, province);
		System.out.println("");
	}
}
