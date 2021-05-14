import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import javax.annotation.Resource;

public class Customer {
	
	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void printDetails() {
		System.out.println("Customer ID = "+this.customerId);
		System.out.println("Customer Name = "+this.customerName);
		System.out.println("Customer Contact = "+this.customerContact);
		System.out.println("Customer Address is = ");
		System.out.println("Street :" +getCustomerAddress().getStreet());
		System.out.println("City :" +getCustomerAddress().getCity());
		System.out.println("Zip :" +getCustomerAddress().getZip());
		System.out.println("Country :" +getCustomerAddress().getCountry());
	}

}
