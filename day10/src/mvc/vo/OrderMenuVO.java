package mvc.vo;

public class OrderMenuVO {
	private int orderNo;
	private String memuNo;
	private int menuPrice;
	private int menuCount;
	
	public OrderMenuVO(int orderNo, String memuNo, int menuPrice, int menuCount) {
		this.orderNo = orderNo;
		this.memuNo = memuNo;
		this.menuPrice = menuPrice;
		this.menuCount = menuCount;
	}
	
	public OrderMenuVO(int orderNo2, int menuNo, int menuPrice2, int menuCount2) {
		// TODO Auto-generated constructor stub
	}

	public String getMemuNo() {
		return memuNo;
	}
	public void setMemuName(String memuNo) {
		this.memuNo = memuNo;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getMenuCount() {
		return menuCount;
	}
	public void setMenuCount(int menuCount) {
		this.menuCount = menuCount;
	}
	public int getOrderNo() {
		return orderNo;
	}
}
