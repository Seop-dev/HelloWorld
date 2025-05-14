package com.yedam;

import java.util.Scanner;

public class JSExe {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 30;
//		System.out.println(num1 == num2); // 숫자열을 비교할때는 == 비교연산자 사용

		String str1 = new String("Hello");
		String str2 = new String("Hello");
//		System.out.println(str1);
//		System.out.println(str2);

//		System.out.println(str1.equals(str2)); // 문자열을 비교할때는 .equals메소드를 사용해야함
//		test2(); // 평균 구하기 소수점까지 출력
//		test3(); // 스캐너 사용
		test4(); // 4번 끝
	} // end of main

	public static void test4() { // 사용자에게 이름 입력 받아서 이름 목록 출력하기
		// 시간 남으면 뒤에 콤마 없애기
		Scanner scn = new Scanner(System.in);
		String name = "친구목록은 ";
		while (true) {
			System.out.println("친구이름을 입력하세요. 종료하려면 quit 입력>>");
			String msg = scn.nextLine();
			// equals로 문자열 비교
			if (msg.equals("quit")) {
				name += " 입니다";
				break;
			}
			name += msg + ", ";
//			System.out.println("당신이 입력한 값은: " + name);
		}
		// 홍길동, 김민규, 최석영
		// 친구목록은 홍길동, 김민규, 최석영 입니다
		System.out.println(name);
	} // end of test4

	public static void test3() { // 사용자에게 값을 입력 받아 평균 구하기
		// 사용자의 입력값 읽기
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("학생의 점수를 입력 >>");
			String value = scn.nextLine(); // 입력값을 문자열 형태로 반환
			int score = Integer.parseInt(value); // 문자열을 숫자열로 정수형 숫자열로 변환
//			System.out.println("입력 값은 " + value); 
			sum += score;
		}
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("합계: " + sum + ",결과: " + avg);
	} // end of test3

	public static void test2() { // 랜덤 난수 생성 후 평균 구하기

		// 변경된 부분.
		// 충돌 연습 아무내용 기입
		// 임의의 수를 생성 30 ~ 100 사이의 임의의 값 생성
		// 평균 : 173.0*1.0/5.0 => 34.6
		// 1 <= x < 101
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int result = (int) (Math.random() * 71) + 30;
			sum += result;
		}
		double avg = sum / 7.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("합계: " + sum + ",결과: " + avg);

	} // end of test2

	public static void test() {
		int sum = 0;
		// 1 ~ 10 까지의 값을 누적하는 반복문
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과: " + sum);
	} // end of test
} // end of class
