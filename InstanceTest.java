class Circle{
	//�ν��Ͻ� ���� ����
	int radius;
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius; //������ ���� �����Ѵ�.
		//getter - read : �޸𸮿� ���� ���� ����Ǿ� �ִ��� Ȯ��
		//setter - write: �޸𸮿� ���� ���� (����)
	
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
