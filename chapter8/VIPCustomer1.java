package chapter8;

public class VIPCustomer1 extends Customer1 {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer1(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {	// 지불 가격 메서드 재정의
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo( ) {	// 고객 정보 출력 메서드 재정의
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다";
	}
	
	public int getAgentID( ) {
		return agentID;
	}
	
}
