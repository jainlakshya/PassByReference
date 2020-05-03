package learning;

public class test {
	public obj obj;
	
	public void check (obj obj) {
		this.obj = obj;
		this.obj.setOne(1);
		this.obj.setTwo(2);
	}
	
	public void check2 (obj obj) {
		obj obj2 = obj;
		obj2.setOne(3);
		obj2.setTwo(4);
		
	}

}
