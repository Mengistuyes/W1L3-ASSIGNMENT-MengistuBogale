package problem1;

public class Customer {

	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address MybillingAddress;
	private Address MyShippingAddress;
	
 public Customer(String firstName, String lastName, String socSecurityNum){
		  this.firstName =firstName;
		  this.lastName= lastName;
		  this.socSecurityNum=socSecurityNum;
	  }
	 
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
		+ "]";
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	public Address getMybillingAddress() {
		return MybillingAddress;
	}
	public void setMybillingAddress(Address mybillingAddress) {
		MybillingAddress = mybillingAddress;
	}
	public Address getMyShippingAddress() {
		return MyShippingAddress;
	}
	public void setMyShippingAddress(Address myShippingAddress) {
		MyShippingAddress = myShippingAddress;
		
	}
}
