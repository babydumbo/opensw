/**
 * 
 */
package edu;

import java.util.Scanner;

/**
 * @author akwld
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �����ϱ�
		int firstNo, secondNo;
		int sum;
		
		//�μ� �Է��ϱ�: ���̺귯�� ����ؼ� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.print("ù ��:");
		firstNo=scan.nextInt();
		
		System.out.print("�ι�° ��:");
		secondNo=scan.nextInt();
		//firstNo=10;
		//secondNo=20;
		
		// �հ� ����
		sum=firstNo+secondNo;
		
		// �հ� ����ϱ�
		System.out.println("�հ�: " + sum);
	}

}
