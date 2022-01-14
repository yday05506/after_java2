package mvc.view;

import java.util.ArrayList;
import mvc.vo.OrderMenuVO;

public class KioskView {
	private ArrayList<OrderMenuVO> orderMenuArrList;
	private int sum;
	
	public KioskView(ArrayList<OrderMenuVO> orderMenuArrList) {
		this.orderMenuArrList = orderMenuArrList;
	}
	
	public String getMenuName(int menuNo) {
		String menuName = "";
		switch (menuNo) {
		case 1: 
			menuName = "������";
			break;
		case 2: 
			menuName = "�̸�";
			break;
		case 3: 
			menuName = "����";
			break;
		case 4: 
			menuName = "Ƣ��";
			break;
		case 5: 
			menuName = "���";
			break;			
		default :
			System.out.println("�߸��� �޴� ��ȣ�� �Է��Ͽ����ϴ�.");
		}
		return menuName;
	}
	
	public void print() {
		System.out.println("================= �ֹ� ���� =================");
		for(int i = 0; i < orderMenuArrList.size(); i++) {
			//ArrayList�� ����� OrderMenuVO�� ��ü �������� ��ȯ �޾Ƽ� ���� ������ ����
			OrderMenuVO om = orderMenuArrList.get(i);
			//OrderMenuVO ��ü�� ������ ��ȯ �޾Ƽ� �ֹ� ������ ���(�ݺ�)
			int price = om.getMenuPrice();
			int count = om.getMenuCount();
			System.out.printf("%d. %s : %d�� �ֹ� ����(%d) �հ� : %d\n", i+1, getMenuName(om.getOrderNo()), price, count, price * count);
			sum += price * count;
		}
		
		System.out.printf("\t\t �����ݾ� :  %d�� \n", sum);
	}
}
