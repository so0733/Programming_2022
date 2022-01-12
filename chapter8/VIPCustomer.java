package chapter8;

public class VIPCustomer extends Customer {	// VIPCustomer Ŭ������ Customer Ŭ������ ��ӹ���
	private int agentID;			// VIP �� ��� ���� ���̵�	(VIP �� ���� ��� ���� �� ���� �ʿ��� ��� ����)
	double saleRatio;				// ������

	public VIPCustomer( ) {
		super( );	// �����Ϸ��� �ڵ����� �߰��ϴ� �ڵ�	(���� Ŭ������ Customer()�� ȣ���)
		customerGrade = "VIP";		// �� ��� VIP	(����Ʈ ������)
		bonusRatio = 0.05;			// ���ʽ� ���� 5%
		saleRatio = 0.1;			// ������ 10%
		System.out.println("VIPCustomer( ) ������ ȣ�� ");		// ���� Ŭ���� ������ �� �ܼ� ��¹�
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// ���� Ŭ���� ������ ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	@Override	// �������� �޼���
	public int CalcPrice(int price) {		// ���ʽ� ����Ʈ ����, ���� ���� ��� �޼���
		bonusPoint += price * bonusRatio;	// ���ʽ� ����Ʈ ���
		return price - (int)(price * saleRatio);	// ������ ����, ���ε� ������ ����Ͽ� ��ȯ
	}
	
	public int getAgentID( ) {				// VIP �����Ը� �ʿ��� �޼���
		return agentID;
	}
	
}
