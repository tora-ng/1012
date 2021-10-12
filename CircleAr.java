class CircleA {
	int radius;
	
	public void setRadius(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}

public class CircleAr {

	public static void main(String[] args) {
		CircleA circle = new CircleA();
		
		circle.setRadius(10);
		
		int radius = circle.getRadius();
		
		System.out.println(radius);
		System.out.println(circle.getRadius());
		
		double area = circle.getArea();
		System.out.println(area);
		

	}

}

//원의 넓이는 구하는 프로그램을 아래와 같이 작성하시오.
//- 원클래스를 만들것
//  - 변수 radius
//  - 변수 radius에 대한 setter getter 함수 만들것
//  - getArea 함수
//
//-메인 메소드를 가진 다른 클래스(CircleAr)에서 원 객체를 생성할것