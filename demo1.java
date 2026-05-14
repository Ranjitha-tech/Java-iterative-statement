

class demo1 {
	
	int age = 30;
	
	void study() {
		System.out.println("default method 1 ");
	}
	
	demo1(){
		System.out.println("Default constructor 1");
	}
	
	
	public static void main(String[] args) {
		
		
		demo1 d = new demo1();
		
		System.out.println(d.age);
		d.study();
	}

}
