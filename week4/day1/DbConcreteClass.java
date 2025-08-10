package week4.day1;

public class DbConcreteClass implements DatabaseConnection{
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("DB execute Update");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConcreteClass obj1 = new DbConcreteClass();
		obj1.connect();
		obj1.disconnect();
		obj1.executeUpdate();
	}

}
