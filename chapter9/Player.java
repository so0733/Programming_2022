package chapter9;

public class Player {
	private PlayerLevel level;			// Player�� ������ level ���� ����
	
	public Player() {					// ����Ʈ ������ (ó�� ������ BeginnerLevel�� �����ϸ� ���� �޽��� ���)
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {	// ���� ���� �޼��� (���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���)
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);				// PlayerLevel�� ���ø� �޼��� go()ȣ��
	}
}
