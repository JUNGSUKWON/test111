package holjjack;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	static int usermarble = 10;
	static int cpumarble =10;
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
		Random rd = new Random();

		while(true) {
			if(usermarble<=0||usermarble>=20) {
				break;
			}
			System.out.print("[���ϳ�]�ڳ� ��� �ɰڳ�?: ");//���ϳ�
			int bet = sc.nextInt();//��� �������� �Է¹޴´�.
			System.out.println("[������]������ ����"+bet+" ���� �ɰڽ��ϴ�.");//������
			System.out.print("[���ϳ�]��... �� ������ Ȧ�ϱ� ¦�ϱ�?");//���ϳ�
			
			String userDab = sc.next();
			System.out.println("[������] "+userDab+"... ������..?");
			
			String cpuDab ="Ȧ";
			// ��ǻ�Ͱ� Ȧ���� ¦������ ���� ������ ������
			int cpu=rd.nextInt(2)+1;
			if(cpu==1) {//1�ΰ�� Ȧ��
				cpuDab="Ȧ";
				
			}else if(cpu==2){
				cpuDab="¦";
			}
			if(cpuDab.equals(userDab)) {
				System.out.println("[���ϳ�]����� ���� �� �����̾�..");//���ϳ�
				usermarble+= bet;
			}else{
				System.out.println("[���ϳ�]������ �����̰屺 �ڳ� ���� �ְ���..");//���ϳ�
				usermarble-= bet;
			}
			System.out.println("[������]���� ������ ������.."+ usermarble);
			
			if(usermarble<=0||usermarble>=20) {
				break;
			}
			//���ϳ��� ���ߴ�����
			
			System.out.print("[���ϳ�]�� ���� �ڳװ� ������ �������Գ�..");
			int sung = rd.nextInt(2)+1;
			
			//�������� ��� ���� �������
			int sungInput =sc.nextInt();
			if(sungInput%2==1) {//Ȧ���ϰ��
				userDab="Ȧ";
				
			}else {
				userDab="¦";
			}
			int cpuChoice = rd.nextInt(2)+1;
			if(cpuChoice==1) {//1�ΰ�� Ȧ��
				cpuDab="Ȧ";
				
			}else if(cpu==2){
				cpuDab="¦";
			}
			
			int oilbet=rd.nextInt(cpumarble)+1;
			System.out.println("[���ϳ�]���� "+oilbet+"���� �ɰڳ�..");
			System.out.println("[���ϳ�]�ڳ� ������ "+cpuDab+" �̾�..");
			
			
			if(userDab.equals(cpuDab)) {
				System.out.println("[������]���߼̾��..���� �� �����Դϴ�..");//�������� ����
				usermarble-= oilbet;
			}else{
				System.out.println("[������]Ʋ�Ƚ��ϴ�. ������ ���� �ֽðھ��?");//������
				usermarble+= oilbet;
			}
			
			if(usermarble<=0||usermarble>=20) {
				break;
			}
			System.out.println("[������]���� ������ ������.."+ usermarble);
			
			
		}
		System.out.println(usermarble);
		
		if(usermarble<=0) {
			System.out.println("[������]������.. �� ����ϼ���Ф�");
		}
		else if(usermarble>=20) {
			System.out.println("[������]������.. �̾��մϴ�..");
		}

		// ���� ���ڸ� ���� Ȧ/¦ ���� ���� ������ ���¿���
		// �������� Ȧ���� ¦������ �Է� �ޱ�
		// ���࿡ ������ ���� ������ ������ ������ŭ �� ������ ���ϱ�
		// Ʋ���� ������ ������ŭ �� ������ ����
		// ���࿡ �� ������ 0�̸� ���ӿ���
		// ���࿡ �� ������ 20�� �� �Ǹ� ������������
	}

}