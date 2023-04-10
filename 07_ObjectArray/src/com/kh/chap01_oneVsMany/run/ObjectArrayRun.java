package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		Book[] arr = new Book[3];

		Scanner sc = new Scanner(System.in);

		// 3개의 전체 도서 정보를 입력 받은 후 각 객체에 초기화
		for (int i = 0; i < arr.length; i++) { // 0 1 2 || 3
			System.out.print("제목 : ");
			String title = sc.nextLine();

			System.out.print("저자 : ");
			String author = sc.nextLine();

			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();

			arr[i] = new Book(title, author, price, publisher);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 사용자에게 검색할 도서 제목을 입력받아
		System.out.print("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		// 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주기.
		boolean isExist = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getTitle().equals(searchTitle)) { // 검색된 책이름이 앞에 arr에 들은 값(get된 책) 이름과 같다면
				isExist = true; // 존재여부에 true를 하고 
				System.out.println(arr[i].getPrice()); // 보유하고있는 가격을 출력하라
				break;
			}
		}
		// 만약 일치하는 도서를 찾지 못한경우 : 검색된 도서가 없습니다를 출력.
		if (!isExist) {
			System.out.println("검색된 도서가 없습니다.");

		}

	}
}
