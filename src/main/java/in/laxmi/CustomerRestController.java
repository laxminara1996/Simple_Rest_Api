package in.laxmi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerRestController {
    @GetMapping("/")
	public Customer getCustomer() {
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("laxmi");
		c.setEmail("lakshmi@gmail.com");
		c.setPwd("1234");
		return c;
	}
}
