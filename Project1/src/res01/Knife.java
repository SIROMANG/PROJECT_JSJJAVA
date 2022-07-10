package res01;

public class Knife extends Weapon{
	
	private String water;		//속성 : 물
	private int avoid;			//회피율
	private int addavoid;		//추가 회피율	
	private String skill1;
	
	
	public void skill1() {
		System.out.println("[system] : 백호검무 스킬을 배우셨습니다.");
	}
	
	
	public Knife () {
		
	}

	public Knife(String water, int avoid) {
		super();
		this.water = water;
		this.avoid = avoid;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public int getAvoid() {
		return avoid;
	}

	public void setAvoid(int avoid) {
		this.avoid = avoid;
	}
	public void addavoid(int num) {
		addavoid += num;
	}
	@Override
	public String getInformation() {
		return super.getInformation()
				+ ", 속성 : " + water + ", 회피율 : " + avoid +" (+" +addavoid+")";
	}
}
