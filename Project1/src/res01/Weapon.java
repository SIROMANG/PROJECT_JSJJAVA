package res01;

public class Weapon {
	
	private int sp = 50;					//공격력
	private int dp = 50;					//방어력
	private int cc = 40;					//치명타
	private int addinationalAttack =0;		//추가 공격력
	private int addinationaldefense =0;		//추가 방어력
	private int addinationallethality= 0;	//추가 치명타
	

public Weapon() {
		
	}
	public void sound3() {
		System.out.println("[system] : 약한 용사는 필요없으니 돌아가세요. ");
	}
	
	public void sound4() {
		
        System.out.println("===================================================================");
        System.out.println("[system] : 현재 가진 무기가 약해서 공주와 용사 둘 다 사망하였습니다.");
	}
	public void sound5() {
		
		System.out.println("[system] : 마왕을 무찔렀으나 강화수치가 부족하여 목숨만 간신히 건져 돌아왔습니다.");
	}
	
	public void skill() {
		System.out.println("[system] : 슈슉..슉..슈슛슉...슉..슉발럼아... 스킬을 배우셨습니다.");
	}
		
	
	public Weapon(int sp, int dp, int cc) {
		super();
		this.sp = sp;
		this.dp = dp;
		this.cc = cc;
	}



	public int getSp() {
		return sp;
	}



	public void setSp(int sp) {
		this.sp = sp;
	}



	public int getDp() {
		return dp;
	}



	public void setDp(int dp) {
		this.dp = dp;
	}



	public int getCc() {
		return cc;
	}



	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void addAttack(int num) {
		addinationalAttack += num;
	}
	
	public void addDefence(int num2) {
		addinationaldefense += num2;
	}
	public void addLety(int num3) {
		addinationallethality += num3;
	}
	



	public String getInformation() {
		return " 공격력 : " + sp + " (+"+addinationalAttack +")"+ ", 방어력 : " + dp +" (+"+ addinationaldefense +")"+ ", 치명률 : " + cc +" (+" +addinationallethality+")" ;   
	}
	
}
