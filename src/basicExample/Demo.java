package basicExample;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Service service = new Service();
		service.setRoleId(10);
		service.setName("Basavraj");
		service.setAddress("Kolhapur");
		System.out.println(service.getRoleId());
		System.out.println(service.getName());
		System.out.println(service.getAddress());
		
		
		

	}

}
