package res01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int pr = 90;			//강화 확률
		int count = 1;			//강화 횟수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[system] : 안녕하세요 용사님! 마왕에게 납치당한 공주를 구해야 해요");           
		System.out.println("[system] : 무기를 강화해서 안전하게 공주를 데려올 수 있도록 해주세요");           
		System.out.println("------------------------------------------------------");           
		System.out.println("[system] : 무기를 선택하여 주세요.");
		System.out.println("[system] : 1. Knife 2. Spear 3. Sword");
		
		int a = sc.nextInt();
		
		Weapon weapon = new Weapon();
		Spear spear = new Spear("불", 10);
		Knife knife = new Knife("물", 10);
		Sword sword = new Sword("전기", 10);

		while (true) {
			
			switch (a) {

			case 1:
				System.out.println("[system] : 강화를 진행하시겠습니까?"+ " [강화확률 : " + pr + "%]");
				System.out.println("[system] : 1.네 2.아니요");
				int num1 = sc.nextInt();

				if (num1 == 1) {
					int random = (int) (Math.random() * 100) + 1;
					if (random < pr) {
						System.out.println("[system] : 강화에 성공하셨습니다. " + "[" + count + "강]");
						 
						count++;		//강화 횟수
						pr -= 10;		//강화 확률
						knife.addAttack(10);
						knife.addDefence(10);
						knife.addLety(10);
						knife.addavoid(10);
						System.out.println(knife.getInformation());
						System.out.println();
											
						if(count == 4) {
						knife.skill1();
						} 
						
						if(count == 6) {
						System.out.println("[system] : 축하드립니다~~~~!!!");
						weapon.skill();
						System.out.println("[system] : 최종 레벨" + (count-1) +  " 입니다.");
						System.out.println("[system] : 이 무기를 가지고 마왕을 무찌르러 가세요!");
		                System.out.println("===================================================================");
		                System.out.println("[system] : 용사님은 강력한 무기를 가지고 마왕을 무찌른 후 공주를 구하고 돌아와 행복하게 살았답니다~!!!");
		                System.out.println();
						System.out.println("[system] : 게임을 종료합니다.");
						return;
						}
						
				} else if (random > pr) {
					System.out.println("[system] : 강화에 실패하였습니다.");
					System.out.println("[system] : 최종 강화는 " + (count-1) + "강 입니다." );
					System.out.println("=========================================");
						
						if(count < 3) {
							weapon.sound3();
							return;
						}
						if(count < 4) {
							weapon.sound4();
							return;
						}
						if(count <= 5) {
							weapon.sound5();
							return;
						}
					
						System.out.println("[system] : 게임을 종료합니다.");
						return;
					}
					
				} else {
					System.out.println("[system] : 강화를 종료합니다.");
					System.out.println("[system] : 최종 강화는 " + (count-1) + "강 입니다." );

					if(count < 3) {
						weapon.sound3();
					} else if(count < 4) {
						weapon.sound4();
					} else if(count <= 5) {
						weapon.sound5();
					}	
					
					return;
				}
				
				break;
				
			case 2:
				System.out.println("[system] : 강화를 진행하시겠습니까?"+ " [강화확률 : " + pr + "%]");
				System.out.println("[system] : 1.네 2.아니요");
				int num2 = sc.nextInt();

				if (num2 == 1) {
					int random = (int) (Math.random() * 100) + 1;
					if (random < pr) {
						System.out.println("[system] : 강화에 성공하셨습니다. " + "[" + count + "강]");
						count++;
						pr -= 10;
						spear.addAttack(10);
						spear.addDefence(10);
						spear.addLety(10);
						spear.addSpeed(10);
						System.out.println(spear.getInformation());
						System.out.println();
					
						if(count == 4) {
						spear.skill2();
						}
						
						if(count == 6) {
						System.out.println("[system] : 축하드립니다~~~~!!!");
						weapon.skill();
						System.out.println("[system] : 최종 레벨" + (count-1) + " 입니다.");
						System.out.println("[system] : 이 무기를 가지고 마왕을 무찌르러 가세요!");
		                System.out.println("===================================================================");
		                System.out.println("[system] : 용사님은 강력한 무기를 가지고 마왕을 무찌른 후 공주를 구하고 돌아와 행복하게 살았답니다~!!!");
		                System.out.println();
						System.out.println("[system] : 게임을 종료합니다.");
						return;
						}
						
				} else if (random > pr) {
					System.out.println("[system] : 강화에 실패하였습니다.");
					System.out.println("[system] : 최종 강화는 " + (count-1) + "강 입니다." );
					System.out.println("=========================================");
					
					if(count < 3) {
						weapon.sound3();
						return;
					}
					if(count < 4) {
						weapon.sound4();
						return;
					}
					if(count <= 5) {
						weapon.sound5();
						return;
					}
				
					System.out.println("[system] : 게임을 종료합니다.");
					return;
					}
					
				} else {
					System.out.println("[system] : 강화를 종료합니다.");
					System.out.println("[system] : 최종 강화는 " + (count-1) + "강 입니다." );

					if(count < 3) {
						weapon.sound3();
					} else if(count < 4) {
						weapon.sound4();
					} else if(count <= 5) {
						weapon.sound5();
					}	
					
					return;
				}
				
				break;
				
				case 3:
					System.out.println("[system] : 강화를 진행하시겠습니까?"+ " [강화확률 : " + pr + "%]");
					System.out.println("[system] : 1.네 2.아니요");
					int num3 = sc.nextInt();

				if (num3 == 1) {
					int random = (int) (Math.random() * 100) + 1;
					if (random < pr) {
						System.out.println("[system] : 강화에 성공하셨습니다. " + "[" + count + "강]");
						count++;
						pr -= 10;
						sword.addAttack(10);
						sword.addDefence(10);
						sword.addLety(10);
						sword.addpd(10);
						System.out.println(sword.getInformation());
						System.out.println();
						
						if(count == 4) {
						sword.skill3();
						}
						
						if(count == 6) {
							System.out.println("[system] : 축하드립니다~~~~!!!");
							weapon.skill();
							System.out.println("[system] : 최종 레벨" + (count-1) + " 입니다.");
							System.out.println("[system] : 이 무기를 가지고 마왕을 무찌르러 가세요!");
			                System.out.println("===================================================================");
			                System.out.println("[system] : 용사님은 강력한 무기를 가지고 마왕을 무찌른 후 공주를 구하고 돌아와 행복하게 살았답니다~!!!");
			                System.out.println();
							System.out.println("[system] : 게임을 종료합니다.");
							return;
							}
						
					} else if (random > pr) {
						System.out.println("[system] : 강화에 실패하였습니다.");
						System.out.println("[system] : 최종 강화는 " + (count-1) + "강 입니다." );
						System.out.println("=========================================");
						
						if(count < 3) {
							weapon.sound3();
							return;
						}
						if(count < 4) {
							weapon.sound4();
							return;
						}
						if(count <= 5) {
							weapon.sound5();
							return;
						}
					
						System.out.println("[system] : 게임을 종료합니다.");
						return;
					}
					
				} else {
					System.out.println("[system] : 강화를 종료합니다.");
					System.out.println("[system] : 최종 강화는 " + (count-1) + "강 입니다." );

					if(count < 3) {
						weapon.sound3();
					} else if(count < 4) {
						weapon.sound4();
					} else if(count <= 5) {
						weapon.sound5();
					}	
					
					return;
				}
				
				break;
				
			default :
				System.out.println("[system] : 준비된 무기가 없습니다.");
				return;
			}

		}
	}

}
