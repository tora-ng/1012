// �ܿ��!!@#!#@!#!@
//���� class�� �����ϰ� �� Ŭ������ �̟G�� �Լ��� ȣ���Ѵ�.
class A {
	int num = 8;
	
	public void printNum() {
		
		System.out.println(num);
	}
	
}

class B {
	int sum = 100; //�ν��Ͻ� ����: Ŭ���� ���� ����� ����
	
	public void printSum() {
		
		System.out.println(sum);
	}
	
}

class Rectangle {
	int width;
	int height;
	
	public void setWidth(int w) {
		width = w;
		
	}
	public int getWidth() {
		return width;
		
	}
	public int getArea() {
		return width * height;
		
		
	}



}


public class IntanceTest {

	public static void main(String[] args) {
		A a; //���� �����̴�. ex) int a;�� ���� ����
		a = new A(); //new: ��ü ����
		a.printNum();
		
		B b;
		b = new B();
		b.printSum();
		
		Rectangle rec = new Rectangle(); //class �̸��� �޾� �൵ ������ ������ �� ����
		Rectangle width;
		Rectangle hight;
		
		rec.width = 10;
		rec.height = 10;
		rec.setWidth(20);
		
		System.out.println(rec.width);
		System.out.println(rec.height);
		System.out.println(rec.getArea());
		System.out.println(rec.getWidth());
		
		B b1 = new B(); //��ü ����
		b1.printSum();
//
//
//
//class Circle {
//	
//	// �ٸ� �ڵ忡���� '�Լ� ����'�� ���� ������ �ߴµ�
//	// �� �ڵ�� '�Լ� �ٱ����� class ��'�� ������ �����ϰ� �ִ�.
//	//�ν��Ͻ� ���� ����
//	int radius;
//	
//	void setRadius(int r) {	//set + radius(��Ģ�� ���� �빮�ڷ�)
//		radius = r; //radius �ȿ� ���� �־� �ִ� ǥ��
//	}
//	
//	public int getRadius() {
//		return radius; //������ ���� �����ϴ� ����
//	}
//	
//	public double getArea() {
//		return radius * radius * Math.PI; //������ ���� �����ϴ� ����
//	}
//	
//	
//}
////class - ����� Circle - class ��
//
//
//public class IntanceTest {
//
//	public static void main(String[] args) {
//		Circle circle = new Circle();
////      ^ class��            ^ class��
//		
//		circle.setRadius(10); //�Լ�
//		
//		int radius = circle.getRadius();
//		System.out.println(radius);
//		System.out.println(circle.getRadius());
//
//		double area = circle.getArea();
//		
//		System.out.println(area);
//	}
	}
}

//
//Rectangle rec = new Rectangle();
//rec.width = 10;
//rec.height = 10;
//rec.setWidth(20);
//
//System.out.println(rec.width); //20
//System.out.println(rec.getWidth()); //20
//
//System.out.println(rec.getArea()); //200
