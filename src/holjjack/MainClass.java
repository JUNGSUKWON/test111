package holjjack;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	static int marble = 10;

	public static void main(String[] args) {
		// ��¡�� ������ ��������(Ȧ¦)
		// ������ ������ 10���� ������ ���ӽ���
		// ������ ������ �ϰ� Ȧ���� ¦����
		// ���߸� ������ ��� Ʋ���� ������ �Ҵ´�
		// 10���� �� ������ �װ�
		// ������ ���� 10���� �� ���� ���� ��������
//		int marble = 10;  // ���� 10 ����
		// ���� ��� ������ ���ΰ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(marble<=0||marble>=20) {
				break;
			}
			System.out.print("�ڳ� ��� �ɰڳ�?: ");//���ϳ�
			int bet = sc.nextInt();//��� �������� �Է¹޴´�.
			System.out.println("������ ����"+bet+" ���� �ɰڽ��ϴ�.");//������
			
			System.out.print("��... Ȧ�ΰ� ¦�ΰ�?");//���ϳ�
			String userDab = sc.next();
			
			System.out.println(userDab+" ������..?");
			
			String cpuDab ="Ȧ";
			
			//		int bet = 10;   // ������ ������ ��
			// ��ǻ�Ͱ� Ȧ���� ¦������ ���� ������ ������
			Random rd = new Random();
			int cpu=rd.nextInt(2)+1;
//			System.out.println(cpu);
			
			if(cpu==1) {//1�ΰ�� Ȧ��
				cpuDab="Ȧ";
				
			}else if(cpu==2){
				cpuDab="¦";
			}
//			System.out.println(cpuDab);
			
			if(cpuDab.equals(userDab)) {
				System.out.println("����� ���� �� �����̾�..");//���ϳ�
				marble+= bet;
			}else{
				System.out.println("������ �����̰屺 �ڳ� ���� �ְ���..");//���ϳ�
				marble-= bet;
			}
			System.out.println("���� ������ ������.."+ marble);
			
		}
		System.out.println(marble);
		
		if(marble<=0) {
			System.out.println("������.. �� ����ϼ���Ф�");
		}
		else if(marble>=20) {
			System.out.println("������.. �̾��մϴ�..");
		}

		// ���� ���ڸ� ���� Ȧ/¦ ���� ���� ������ ���¿���
//		int num = 7;
		// num % 2 == 1 ���� = "Ȧ"
		// �������� Ȧ���� ¦������ �Է� �ޱ�
		// ���࿡ ������ ���� ������ ������ ������ŭ �� ������ ���ϱ�
		// Ʋ���� ������ ������ŭ �� ������ ����
		// ���࿡ �� ������ 0�̸� ���ӿ���
		// ���࿡ �� ������ 20�� �� �Ǹ� ������������
	}

}