package array2D;

import java.util.Scanner;

public class Array2DEx_03 {

	public static void main(String[] args) {

		// 1~3�г�
		// 2����
		// 4��
		// 3���� ����
		//		int[][][][] score = new int [3][2][4][3];
		//		
		//		int[][][] s1 = new int [2][4][3]; // 1�г�
		//		int[][][] s2 = new int [2][4][3]; // 2�г�
		//		int[][][] s3 = new int [2][4][3]; // 3�г�
		//		
		//		// 2���� ����, ����, ���� ������ �����ϴ� �迭
		//		int[][] sc = new int[2][3];
		//		
		//		int[] sum; // 2���� ���� �迭
		//		double[] avg; // 2���� ��� �迭


		// 0. ���� �Է�

		// 1. ���� ���

		// 2. ��� ���

		// 3. ���
		// ex) ��ȣ ���� ���� ���� ���� ���
		//	   1��   ?   ?  ?  ?	 ?
		//	   2��   ?   ?  ?  ?	 ?

		int[][] sc=new int [2][5];

		String[] subject= {"����", "����", "����"};

		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				int num=(int) (Math.floor(Math.random() * 100) + 1);
				System.out.println((i+1)+"��° �л��� "+subject[j]+"���� ����: "+num);
				sc[i][j] = num;  // �迭�� new�� �����ϸ� 0���� �ڵ��ʱ�ȭ
				sc[i][3] += num;
			}
			System.out.println((i+1)+"��° �л��� ������: "+sc[i][3]+"��");
			sc[i][4]=sc[i][3]/3;
			System.out.println((i+1)+"��° �л��� �����: "+sc[i][4]+"��");
			System.out.println("-------------------------------------------");
		}

		System.out.print("��ȣ\t����\t����\t����\t����\t���\n");
		for(int i=0; i<2; i++) {
			System.out.print(i+1+"\t");
			for(int j=0; j<5; j++) {
				System.out.print(sc[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
