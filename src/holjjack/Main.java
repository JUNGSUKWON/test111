package holjjack;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���� ����
		Random randNum = new Random();
		Scanner sc = new Scanner(System.in);

		int Bead = 10; // ���� ����

		int a = Bead;
		int b = Bead; // a, b ���� 10���� ������ ������.

		while (true) {
			if (a <= 0 || b <= 0) {
				if (a == 0) {
					System.out.println("���ӿ��� �й��߽��ϴ�.");
					System.out.println("����� ����߽��ϴ�.");
				}
				else {
					System.out.println("���ӿ��� �¸��߽��ϴ�.");
					System.out.println("����� �����߽��ϴ�.");
				}
				break;
			}
			//dsafdsfsdfsadfsadfasdfasdfsdafsdafadsfsadfsdafasdfsdfasdf
//asfasdfsdfdsafadsfdsafdasfasdfsdafasdfasdfdsfsdafsadfasdfasdfadsfdsasdfdsa
			int aPick = randNum.nextInt(a) + 1;

			int ans = 0;

			if (aPick % 2 == 0)
				ans = 2; // ¦���� 2
			else
				ans = 1; // Ȧ���� 1

			System.out.println("Ȧ(1) or ¦(2) : "); // ������ ���� �����ϱ�
			int me = sc.nextInt();

			if (ans == me) {
				System.out.println("������ϴ�.");
				System.out.println("������ ���� " + aPick + "���� ����ɴϴ�.");
				b = b - aPick;
				a = a + aPick;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("����� ������ ���濡�� " + aPick + "���� ����ϴ�.");
				a = a - aPick;
				b = b + aPick;
			}

			int bPick = randNum.nextInt(2) + 1;

			System.out.println("\n����� ������ " + a + "�� ���ҽ��ϴ�.");
			System.out.println("������ ������ " + b + "�� ���ҽ��ϴ�.");
			
			if (a <= 0 || b <= 0) {
				if (a == 0) {
					System.out.println("���ӿ��� �й��߽��ϴ�.");
					System.out.println("����� ����߽��ϴ�.");
				}
				else {
					System.out.println("���ӿ��� �¸��߽��ϴ�.");
					System.out.println("����� �����߽��ϴ�.");
				}
				break;
			}
			
			int Min = 21;
			if (a >= b) {
				Min = b;
			} else {
				Min = a;
			}
			System.out.println("\n�� ���� ������ ������ڽ��ϱ�? (1 ~ " + Min + ")");
			
			int myPick = sc.nextInt();
			
			while (myPick > Min) {	// �ִ� ���� ������ ���� �� ���� ���ٸ� �ٽ� �����Ѵ�.
				System.out.println("\n�ٽ� ������ (1 ~ " + Min + ")");
				myPick = sc.nextInt();
			}
			
			if (bPick == 0) {
				System.out.println("������ '¦'�� �����߽��ϴ�.");
				if (myPick % 2 == 0) {
					System.out.println("����� �̰���ϴ�.");
					System.out.println("����� ������ ���濡�� " + myPick + "���� ����ϴ�.");
					a = a - myPick;
					b = b + myPick;
					
				} else {
					System.out.println("����� �̰���ϴ�.");
					System.out.println("����� ������ ������ " + myPick + "���� ���Ѿƿɴϴ�.");
					a = a + myPick;
					b = b - myPick;
				}
				System.out.println("\n����� ������ " + a + "�� ���ҽ��ϴ�.");
				System.out.println("������ ������ " + b + "�� ���ҽ��ϴ�.\n");

			} else {
				System.out.println("\n������ 'Ȧ'�� �����߽��ϴ�.");
				if (myPick % 2 != 0) {
					System.out.println("������ �̰���ϴ�.");
					System.out.println("����� ������ ���濡�� " + myPick + "���� ����ϴ�.");
					a = a - myPick;
					b = b + myPick;
				} else {
					System.out.println("����� �̰���ϴ�.");
					System.out.println("����� ������ ������ " + myPick + "���� ���Ѿƿɴϴ�.");
					a = a + myPick;
					b = b - myPick;
				}
				System.out.println("\n����� ������ " + a + "�� ���ҽ��ϴ�.");
				System.out.println("������ ������ " + b + "�� ���ҽ��ϴ�.\n");
			}

		}

	}

}