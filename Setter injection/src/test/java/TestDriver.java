import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestDriver {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("one.xml");
		Customer cust=(Customer) context.getBean("Customer");
		assertAll(
		()->assertEquals(cust.getCustomerName(),"Naman"),
		()->assertEquals(cust.getCustomerId(),1234),
		()->assertEquals(cust.getCustomerContact(),9720531773L),
		()->assertEquals(cust.getCustomerAddress().getStreet(),"Pant Vihar Colony"),
		()->assertEquals(cust.getCustomerAddress().getCity(),"Pantnagar"),
		()->assertEquals(cust.getCustomerAddress().getZip(),263149),
		()->assertEquals(cust.getCustomerAddress().getCountry(),"India")
	);
	}

}
