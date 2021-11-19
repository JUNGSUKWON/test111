package holjjack;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	static int usermarble = 10;
	static int cpumarble =10;
	public static void main(String[] args) {
		// 오징어 게임의 구슬게임(홀짝)
		// 유저가 구슬을 10개를 가지고 게임시작
		// 유저가 베팅을 하고 홀인지 짝인지
		// 맞추면 구슬을 얻고 틀리면 구슬을 잃는다
		// 10개를 다 잃으면 죽고
		// 상대방의 구슬 10개를 다 따면 다음 스테이지
		//		int marble = 10;  // 구슬 10 셋팅
		// 구슬 몇개를 베팅할 것인가 입력 받기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		while(true) {
			if(usermarble<=0||usermarble>=20) {
				break;
			}
			System.out.print("[오일남]자네 몇개를 걸겠나?: ");//오일남

			//만약에 숫자만 입력이 되어야하는데 문자를 입력했을때
			int bet = 0;//배팅변수
			try {
				//숫자를 입력해야 되는데 문자를 입력할 경우 에러난다.
				//이렇게 예외처리를 하면된다. 

				bet = sc.nextInt();
			}catch(Exception e) {
				System.out.println("숫자만 입력이 가능합니다.");
				sc.nextLine();
				continue;
			}

			if(usermarble<bet) {
				System.out.println("당신이 가진 구슬이 부족하다. 다시 입력하라.");
				continue;
			}

			//			int bet = sc.nextInt();//몇개를 배팅할지 입력받는다.
			System.out.println("[성기훈]영감님 저는"+bet+" 개를 걸겠습니다.");//성기훈
			System.out.print("[오일남]자... 내 구슬이 홀일까 짝일까?");//오일남

			String userDab ="홀";
			try {
				userDab = sc.next();

			}catch(Exception e){
				System.out.println("문자만 입력이 가능합니다.");
				sc.nextLine();
				continue;
			}
			System.out.println("[성기훈] "+userDab+"... 이지요..?");

			String cpuDab ="홀";
			// 컴퓨터가 홀인지 짝인지를 먼저 문제를 만들어야
			int cpu=rd.nextInt(2)+1;
			if(cpu==1) {//1인경우 홀수
				cpuDab="홀";

			}else if(cpu==2){
				cpuDab="짝";
			}
			if(cpuDab.equals(userDab)) {
				System.out.println("[오일남]맞췄어 여기 내 구슬이야..");//오일남
				if(cpumarble>=bet) {//배팅한갯수보다 상대방 구슬이 많은경우 배팅한것 전부빼도 상관없는경우
					usermarble+= bet;
					cpumarble-=bet;
				}
				else {
					usermarble+= cpumarble;
					cpumarble=0;

				}
			}else{//배팅한사람은 따질필요없다.
				System.out.println("[오일남]흐흐흐 내가이겼군 자네 구슬 주개나..");//오일남
				usermarble-= bet;
				cpumarble+=bet;

			}
			System.out.println("오일남의 남은 구슬갯수는 "+" "+cpumarble);
			System.out.println("[성기훈]남은 구슬의 갯수는.."+ usermarble);

			if(usermarble<=0||usermarble>=20) {
				break;
			}
			//오일남이 맞추는차례


			System.out.print("[오일남]자 이제 자네가 구슬을 움켜쥐어보게나..");
			int sung = rd.nextInt(2)+1;

			//성기훈이 몇개를 움켜 쥘것인지
			int sungInput =0;
			try {
				sungInput =sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("숫자만 입력이 가능합니다.");
				sc.nextLine();
				continue;
			}
			if(sungInput%2==1) {//홀수일경우
				userDab="홀";

			}else {
				userDab="짝";
			}
			int cpuChoice = rd.nextInt(2)+1;
			if(cpuChoice==1) {//1인경우 홀수
				cpuDab="홀";

			}else if(cpu==2){
				cpuDab="짝";
			}

			int oilbet=rd.nextInt(cpumarble)+1;
			System.out.println("[오일남]나는 "+oilbet+"개를 걸겠네..");
			System.out.println("[오일남]자네 구슬은 "+cpuDab+" 이야..");


			if(userDab.equals(cpuDab)) {
				System.out.println("[성기훈]맞추셨어요..여기 제 구슬입니다..");//성기훈이 졌다
				if(usermarble>=oilbet) {

					cpumarble+=oilbet;
					usermarble-= oilbet;
				}
				else {
					cpumarble+=usermarble;
					usermarble=0;
					
					
				}
			}else{
				System.out.println("[성기훈]틀렸습니다. 영감님 구슬 주시겠어요?");//성기훈
				usermarble+= oilbet;
				cpumarble-=oilbet;
			}

			if(usermarble<=0||usermarble>=20) {
				break;
			}
			System.out.println("오일남의 남은 구슬갯수는 "+" "+cpumarble);
			System.out.println("[성기훈]남은 구슬의 갯수는.."+ usermarble);


		}
		System.out.println(usermarble);

		if(usermarble<=0) {
			System.out.println("[성기훈]영감님.. 꼭 우승하세요ㅠㅠ");
		}
		else if(usermarble>=20) {
			System.out.println("[성기훈]영감님.. 미안합니다..");
		}

		// 랜덤 숫자를 만들어서 홀/짝 인지 답이 정해진 상태에서
		// 유저에게 홀인지 짝인지를 입력 받기
		// 만약에 맞으면 내가 베팅한 구슬의 갯수만큼 내 구슬은 더하기
		// 틀리면 베팅한 갯수만큼 내 구슬은 빼기
		// 만약에 내 구슬이 0이면 게임오버
		// 만약에 내 구슬이 20개 가 되면 다음스테이지
	}

}