package Day3_oops;

public class CustomerExecutor {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(112);
		c1.setCname("sindhu");
		c1.setCaddress("pondicherry");
        System.out.println("Customer ID:"+c1.getCid()+"\nCustomer Name:"+c1.getCname()+"\nCustomer Address:"+c1.getCaddress());
        
        Customer c2=new Customer();
        c2.setCid(113);
        c2.setCname("subha");
        c2.setCaddress("Bangalore");
        System.out.println(c2); //calling the toString
        
        Customer c3=new Customer(); //invoke implicit default constructor
        System.out.println(c3);
        
        Customer c4=new Customer(115,"bhu","pune"); //invoke parameterized constructor
        System.out.println(c4);
	}

}
