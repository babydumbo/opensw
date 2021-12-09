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
		//변수 선언하기
		int firstNo, secondNo;
		int sum;
		
		//두수 입력하기: 라이브러리 사용해서 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 수:");
		firstNo=scan.nextInt();
		
		System.out.print("두번째 수:");
		secondNo=scan.nextInt();
		//firstNo=10;
		//secondNo=20;
		
		// 합계 내기
		sum=firstNo+secondNo;
		
		// 합계 출력하기
		System.out.println("합계: " + sum);
	}

}
