package holjjack;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 구슬 게임
		Random randNum = new Random();
		Scanner sc = new Scanner(System.in);

		int Bead = 10; // 구슬 갯수

		int a = Bead;
		int b = Bead; // a, b 각각 10개씩 가지고 시작함.

		while (true) {
			if (a <= 0 || b <= 0) {
				if (a == 0) {
					System.out.println("게임에서 패배했습니다.");
					System.out.println("당신은 사망했습니다.");
				}
				else {
					System.out.println("게임에서 승리했습니다.");
					System.out.println("당신은 생존했습니다.");
				}
				break;
			}
			//dsafdsfsdfsadfsadfasdfasdfsdafsdafadsfsadfsdafasdfsdfasdf
//asfasdfsdfdsafadsfdsafdasfasdfsdafasdfasdfdsfsdafsadfasdfasdfadsfdsasdfdsa
			int aPick = randNum.nextInt(a) + 1;

			int ans = 0;

			if (aPick % 2 == 0)
				ans = 2; // 짝수면 2
			else
				ans = 1; // 홀수면 1

			System.out.println("홀(1) or 짝(2) : "); // 상대방의 구슬 추측하기
			int me = sc.nextInt();

			if (ans == me) {
				System.out.println("맞췄습니다.");
				System.out.println("상대방의 구슬 " + aPick + "개를 뺏어옵니다.");
				b = b - aPick;
				a = a + aPick;
			} else {
				System.out.println("틀렸습니다.");
				System.out.println("당신의 구슬을 상대방에게 " + aPick + "개를 뺏깁니다.");
				a = a - aPick;
				b = b + aPick;
			}

			int bPick = randNum.nextInt(2) + 1;

			System.out.println("\n당신의 구슬은 " + a + "개 남았습니다.");
			System.out.println("상대방의 구슬은 " + b + "개 남았습니다.");
			
			if (a <= 0 || b <= 0) {
				if (a == 0) {
					System.out.println("게임에서 패배했습니다.");
					System.out.println("당신은 사망했습니다.");
				}
				else {
					System.out.println("게임에서 승리했습니다.");
					System.out.println("당신은 생존했습니다.");
				}
				break;
			}
			
			int Min = 21;
			if (a >= b) {
				Min = b;
			} else {
				Min = a;
			}
			System.out.println("\n몇 개의 구슬을 움켜쥐겠습니까? (1 ~ " + Min + ")");
			
			int myPick = sc.nextInt();
			
			while (myPick > Min) {	// 최대 구슬 수보다 내가 고른 수가 많다면 다시 골라야한다.
				System.out.println("\n다시 고르세요 (1 ~ " + Min + ")");
				myPick = sc.nextInt();
			}
			
			if (bPick == 0) {
				System.out.println("상대방은 '짝'을 선택했습니다.");
				if (myPick % 2 == 0) {
					System.out.println("당신이 이겼습니다.");
					System.out.println("당신의 구슬을 상대방에게 " + myPick + "개를 뺏깁니다.");
					a = a - myPick;
					b = b + myPick;
					
				} else {
					System.out.println("당신이 이겼습니다.");
					System.out.println("당신은 상대방의 구슬을 " + myPick + "개를 빼앗아옵니다.");
					a = a + myPick;
					b = b - myPick;
				}
				System.out.println("\n당신의 구슬은 " + a + "개 남았습니다.");
				System.out.println("상대방의 구슬은 " + b + "개 남았습니다.\n");

			} else {
				System.out.println("\n상대방은 '홀'을 선택했습니다.");
				if (myPick % 2 != 0) {
					System.out.println("상대방이 이겼습니다.");
					System.out.println("당신의 구슬을 상대방에게 " + myPick + "개를 뺏깁니다.");
					a = a - myPick;
					b = b + myPick;
				} else {
					System.out.println("당신이 이겼습니다.");
					System.out.println("당신은 상대방의 구슬을 " + myPick + "개를 빼앗아옵니다.");
					a = a + myPick;
					b = b - myPick;
				}
				System.out.println("\n당신의 구슬은 " + a + "개 남았습니다.");
				System.out.println("상대방의 구슬은 " + b + "개 남았습니다.\n");
			}

		}

	}

}