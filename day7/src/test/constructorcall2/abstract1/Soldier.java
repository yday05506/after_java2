package test.abstract1;

public class Soldier extends Weapon3 {
	//�θ� Ŭ������ �߻� Ŭ������ ��� �θ� Ŭ������ �߻� �޼ҵ带 �ݵ�� �����ؾ߸� �Ѵ�.
	@Override
	public void fire() {
		System.out.println("�������� �������� �������� ���� ���� �������� Ÿ�������� �������� ��������");
	}

	public void walk() {
		System.out.println("������ �ȴ´�.");
	}
}
