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

//���� ���̴� ���ϴ� ���α׷��� �Ʒ��� ���� �ۼ��Ͻÿ�.
//- ��Ŭ������ �����
//  - ���� radius
//  - ���� radius�� ���� setter getter �Լ� �����
//  - getArea �Լ�
//
//-���� �޼ҵ带 ���� �ٸ� Ŭ����(CircleAr)���� �� ��ü�� �����Ұ�