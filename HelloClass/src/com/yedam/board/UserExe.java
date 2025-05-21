package com.yedam.board;

import java.util.Scanner;

import com.yedam.member.Member;

/*
 * User: 아이디, 비밀번호, 이름
 */
class User {

	private String userId;
	private String passwd;
	private String userName;

	// 생성자
	public User(String userId, String passwd, String userName) {
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
	}
	// getter

	public String getUserId() {
		return userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getUserName() {
		return userName;
	}

}

public class UserExe {
	static User[] users = { new User("holy", "1111", "김영광")//
			, new User("cutie", "2222", "홍예쁨")//
			, new User("guest", "3333", "밤손님")//
	};

	// 아이디, 비밀번호 =>
	static boolean login(String uname, String passwd) {
		Scanner scn = new Scanner(System.in);
		// code HERE.
		boolean isLogin = false;
		while (!isLogin) {
			System.out.println("유저 아이디 입력>> ");
			String uId = scn.nextLine();
			System.out.println("비밀번호 입력>> ");
			String uPw = scn.nextLine();


			for (User user : users) {
				if (user.getUserId().equals(uId) && user.getPasswd().equals(uPw)) {
					System.out.println("로그인 성공!");
					isLogin = true;
					break;
				}
			}
			if (!isLogin) {
				System.out.println("아이디 또는 비밀번호를 확인해주세요.");
			}
		}
		return true;
	}
}