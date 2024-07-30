package basicExample;

public class Service {
	
	private int roleId;
	private String name;
	private String address;
	
	public double getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Service [roleId=" + roleId + ", name=" + name + ", address=" + address + "]";
	}

}
