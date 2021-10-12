// 외우기!!@#!#@!#!@
//내가 class를 생성하고 그 클래스를 이욯해 함수를 호출한다.
class A {
	int num = 8;
	
	public void printNum() {
		
		System.out.println(num);
	}
	
}

class B {
	int sum = 100; //인스턴스 변수: 클래스 내에 선언된 변수
	
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
		A a; //변수 선언이다. ex) int a;와 같은 것임
		a = new A(); //new: 객체 생성
		a.printNum();
		
		B b;
		b = new B();
		b.printSum();
		
		Rectangle rec = new Rectangle(); //class 이름만 달아 줘도 컴파일 오류가 안 생김
		Rectangle width;
		Rectangle hight;
		
		rec.width = 10;
		rec.height = 10;
		rec.setWidth(20);
		
		System.out.println(rec.width);
		System.out.println(rec.height);
		System.out.println(rec.getArea());
		System.out.println(rec.getWidth());
		
		B b1 = new B(); //객체 생성
		b1.printSum();
//
//
//
//class Circle {
//	
//	// 다른 코드에서는 '함수 안쪽'에 변수 선언을 했는데
//	// 이 코드는 '함수 바깥쪽인 class 안'에 변수를 선언하고 있다.
//	//인스턴스 변수 선언
//	int radius;
//	
//	void setRadius(int r) {	//set + radius(규칙에 의해 대문자로)
//		radius = r; //radius 안에 값을 넣어 주는 표현
//	}
//	
//	public int getRadius() {
//		return radius; //반지름 값을 리턴하는 문장
//	}
//	
//	public double getArea() {
//		return radius * radius * Math.PI; //반지름 값을 리턴하는 문장
//	}
//	
//	
//}
////class - 예약어 Circle - class 명
//
//
//public class IntanceTest {
//
//	public static void main(String[] args) {
//		Circle circle = new Circle();
////      ^ class명            ^ class명
//		
//		circle.setRadius(10); //함수
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
