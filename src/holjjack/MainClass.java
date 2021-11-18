package holjjack;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		//오징어 게임의 다리 건너기(홀짝)
		//유저가 구슬을 10개를 가지고 게임시작
		//유저가 배팅을 하고 홀인지 짝인지

		//맞추면 구슬을 얻고 틀리면 구슬을 잃는다.
		//10개를 다 잃으면 죽고 
		//상대방의 구슬 10개를 다 따면 산다. 다 따면 다음 스테이지

		int marble = 10;//구슬 10셋팅
		//입력 받기 구슬 몇개를 베팅할 것인가
		int bet = 10;//베팅한 구슬의 수
		//컴퓨터가 홀인지 짝인지를 먼저 문제를 만들어야
		//랜덤 숫자를 만들어서 홀/짝 인지 답이 정해진 상태에서
		int num=7;
		//num%2==1 공식="홀"
		//유저에게 홀인지 짝인지를 입력받기 
		String ishj = "홀";
		
		//만약에 맞으면 내가 베팅한 구슬의 갯수만큼 내 구슬은 더하기
		//틀리면 베팅한 갯수만큼 내 구슬은 빼기
		//만약에 내 구슬이 0이면 게임오버
		//만약에 내 구슬이 20개가 되면 다음 스테이지
		Scanner sc = new Scanner(System.in);
		
		
		
		
	}
}
