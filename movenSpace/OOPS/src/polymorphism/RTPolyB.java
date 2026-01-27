package polymorphism;
//Run time polymorphism same method name but different behavior decided while program running
//Can not be override-static,final,and privat method
//RTPoly=Run time polymorphism
public class RTPolyB extends RTPolyA {

	public static void main(String[] args) {

		RTPolyA	val =new RTPolyB();
		val.start();
	}

	public void start() {
		
		System.out.println("key");
	}
	
}
