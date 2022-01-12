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
	
	public int calcPrice(int price) {	// ���� ���� �޼��� ������
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo( ) {	// �� ���� ��� �޼��� ������
		return super.showCustomerInfo() + "��� ���� ��ȣ�� " + agentID + "�Դϴ�";
	}
	
	public int getAgentID( ) {
		return agentID;
	}
	
}
