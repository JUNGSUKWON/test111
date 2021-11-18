package holjjack;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	static int marble = 10;

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
		while(true) {
			if(marble<=0||marble>=20) {
				break;
			}
			System.out.print("자네 몇개를 걸겠나?: ");//오일남
			int bet = sc.nextInt();//몇개를 배팅할지 입력받는다.
			System.out.println("영감님 저는"+bet+" 개를 걸겠습니다.");//성기훈
			
			System.out.print("자... 홀인가 짝인가?");//오일남
			String userDab = sc.next();
			
			System.out.println(userDab+" 이지요..?");
			
			String cpuDab ="홀";
			
			//		int bet = 10;   // 베팅한 구슬의 수
			// 컴퓨터가 홀인지 짝인지를 먼저 문제를 만들어야
			Random rd = new Random();
			int cpu=rd.nextInt(2)+1;
//			System.out.println(cpu);
			
			if(cpu==1) {//1인경우 홀수
				cpuDab="홀";
				
			}else if(cpu==2){
				cpuDab="짝";
			}
//			System.out.println(cpuDab);
			
			if(cpuDab.equals(userDab)) {
				System.out.println("맞췄어 여기 내 구슬이야..");//오일남
				marble+= bet;
			}else{
				System.out.println("흐흐흐 내가이겼군 자네 구슬 주개나..");//오일남
				marble-= bet;
			}
			System.out.println("남은 구슬의 갯수는.."+ marble);
			
		}
		System.out.println(marble);
		
		if(marble<=0) {
			System.out.println("영감님.. 꼭 우승하세요ㅠㅠ");
		}
		else if(marble>=20) {
			System.out.println("영감님.. 미안합니다..");
		}

		// 랜덤 숫자를 만들어서 홀/짝 인지 답이 정해진 상태에서
//		int num = 7;
		// num % 2 == 1 공식 = "홀"
		// 유저에게 홀인지 짝인지를 입력 받기
		// 만약에 맞으면 내가 베팅한 구슬의 갯수만큼 내 구슬은 더하기
		// 틀리면 베팅한 갯수만큼 내 구슬은 빼기
		// 만약에 내 구슬이 0이면 게임오버
		// 만약에 내 구슬이 20개 가 되면 다음스테이지
	}

}