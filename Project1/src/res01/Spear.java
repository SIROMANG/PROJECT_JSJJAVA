package res01;

public class Spear extends Weapon{

	private String fire;		//속성 : 불
	private int speed;			//공격속도
	private int addSpeed;		//추가 공격속도
	private String skill2;
	
	public void skill2() {
		System.out.println("[system] : 동귀어진 스킬을 배우셨습니다.");
	}
	
	public Spear() {
		
	}

	public Spear(String fire, int speed) {
		super();
		this.fire = fire;
		this.speed = speed;
	}

	public String getFire() {
		return fire;
	}

	public void setFire(String fire) {
		this.fire = fire;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void addSpeed(int num) {
		addSpeed +=num;
	}
	
	@Override
	public String getInformation() {
		return super.getInformation()
				+ ", 속성 : " + fire + ", 공격속도 : " +speed +" (+"+addSpeed+")";
	}
}
