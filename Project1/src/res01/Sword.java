package res01;

public class Sword extends Weapon{
	
	private String volt;		//속성 : 전기
	private int pd;				//관통 데미지
	private int addpd;			//추가 관통 데미지
	private String skill3;
	
	public void skill3(){
		System.out.println("[system] : 건곤대나이 스킬을 배우셨습니다.");
}
	public Sword() {
		
	}

	public Sword(String volt, int pd) {
		super();
		this.volt = volt;
		this.pd = pd;
	}

	public String getVolt() {
		return volt;
	}

	public void setVolt(String volt) {
		this.volt = volt;
	}

	public int getPd() {
		return pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}
	
	public void addpd(int num) {
		addpd += num;
	}
	
	@Override
	public String getInformation() {
		return super.getInformation()
				+ ", 속성 : " + volt + ", 관통 데미지 :" + pd +" (+"+addpd+")";
	}
	
}
