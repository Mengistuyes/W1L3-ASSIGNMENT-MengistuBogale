package problem1;

public class Main {

	public static void main(String[] args) {
				
		//Billing Address for Customers
		Address C1billingAddress = new Address("1011 Fairfield","Fairfield","Iowa","45478");
		Address C2billingAddress = new Address("1011 Chddsdf","Chicago","illons","21564");
		Address C3billingAddress = new Address("1011 Fairfield","Minnetonka","Minnesota","55556");
		//Shipping Address for Customers
		Address C1ShippingAddress = new Address("1000 N.4th St.MR#11111","Fairfield","Iowa","52557");
		Address C2ShippingAddress = new Address("1450 N.9th St.","Alexandria","Virgina","52557");
		Address C3ShippingAddress = new Address("1011 Timberland","St.Poal","Minnesota","55588");
		
		//inserting customer information through constructor 
		Customer C1=new Customer("Mengistu","Bogale","123456");
		Customer C2=new Customer("Abebe","lema","789456");
		Customer C3=new Customer("Solomon","Nebiyou","987654");
		
		//Setting billing and shipping address to customer info
		C1.setMybillingAddress(C1billingAddress);
		C1.setMyShippingAddress(C1ShippingAddress);
		
		C2.setMybillingAddress(C2billingAddress);
		C2.setMyShippingAddress(C2ShippingAddress);
		
		C3.setMybillingAddress(C3billingAddress);
		C3.setMyShippingAddress(C3ShippingAddress);

		//Adding customer info to array of Customer info
		Customer[] ListOfCustomers={C1,C2,C3};
		
		//looping through Customers
		for(Customer cust: ListOfCustomers)
		{
			//Checking city of billing address 
			if(cust.getMybillingAddress().getCity().equals("Chicago"))//If customer is in chicago print it.
			{
				System.out.println("" + cust.toString());//
			}
		}
		
		
	

	}

}
