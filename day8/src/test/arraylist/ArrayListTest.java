package test.arraylist;

//ArrayList�� java.util ��Ű���� Ŭ����
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//�迭�� ���ѵ� ������ ���� ������ ���(�迭 ��ü ������ �� ���� ���ϱ� ����)
		//ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ���� ������ �߰�(add)�ؼ� ����� �� �ִ�.
		//ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ���� ������ ����(remove)�ؼ� ����� �� �ִ�.
		
		//ArrayList ��ü ���� : GenericType(����� ����� �ڷ��� ����)
		ArrayList<String> arrList = new ArrayList<String>();
		//arrList�� �����͸� �߰��Ѵ�.
		arrList.add("�ռ�ȣ");
		arrList.add("�ڼ���");
		arrList.add("ȫ����");
		arrList.add("�漺��");
		arrList.add("�Ű漱");
		arrList.add("�ſ��");
		arrList.add("ȫ��ȿ");
		arrList.add("�����");
		arrList.add("�̿쿬");
		arrList.add("���μ�");
		
		arrList.remove(7);
		arrList.remove("�ſ��");
		arrList.add("������");

		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}
}
