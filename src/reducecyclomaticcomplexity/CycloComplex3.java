/**
 * 
 */
package reducecyclomaticcomplexity;

/**
 * @author reddy
 *
 */
public class CycloComplex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(formatAddress("", "", ""));
		System.out.println(formatAddressCC("", "", ""));
	}

	private static String formatAddressCC(String street, String city, String country) {
		String string =  appendItem(street) + appendItem(city) + appendItem(country);
		if(string.contains(",")){
			return string.substring(0,string.lastIndexOf(","));	
		}else{
			return "";
		}
		
	}

	private static String appendItem(String item) {
		if (item == "") {
			return "";
		}
		return item + ",";
	}

	private static String formatAddress(String street, String city, String country) {
		if (street == "") {
			if (city == "") {
				if (country == "") {
					return "";
				} else {
					return country;
				}
			} else {
				if (country == "") {
					return city;
				} else {
					return city + "," + country;
				}
			}
		} else {
			if (city == "") {
				if (country == "") {
					return street;
				} else {
					return street + "," + country;
				}
			} else {
				if (country == "") {
					return street + "," + city;
				} else {
					return street + "," + city + "," + country;
				}
			}
		}
	}
}