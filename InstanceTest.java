class Circle{
	//인스턴스 변수 선언
	int radius;
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius; //반지름 값을 리턴한다.
		//getter - read : 메모리에 무슨 값이 저장되어 있는지 확인
		//setter - write: 메모리에 값을 저장 (변경)
	
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}





public class InstanceTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setRadius(10);
		
		int radius = circle.getRadius();
		
		System.out.println(radius);
		System.out.println(circle.getRadius());
		
		double area = circle.getArea();
		System.out.println(area);
	}

}
