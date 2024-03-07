package Day3_oops;

public class CustomerExecutor {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(112);
		c1.setCname("sindhu");
		c1.setCaddress("pondicherry");
        System.out.println("Customer ID:"+c1.getCid()+"\nCustomer Name:"+c1.getCname()+"\nCustomer Address:"+c1.getCaddress());
	}

}
