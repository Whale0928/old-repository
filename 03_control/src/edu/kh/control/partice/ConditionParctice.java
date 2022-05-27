package edu.kh.control.partice;

import java.util.Scanner;

public class ConditionParctice {

	public void practce1() {
//		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//		짝수가 아니면 “홀수입니다.“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개를 입력하시오 : ");
		int input = sc.nextInt();
		String result;

		if (input <= 0) {
			result = "양수만 입력해주세요.";
		} else if (input % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수 입니다.";
		}

		System.out.println(result);
	}

	public void practce2() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3;

		if (kor < 40 || eng < 40 || math < 40 || sum < 60) {
			System.out.println("불합격 입니다.");
		} else {
			System.out.printf("\n 국어%d \n 영어%d\n 수학%d \n 합계%d\n 평균%.1f\n\"축하합니다 합격입니다.\"", kor, eng, math, sum, avg);
		}

	}

	public void practce3If() {
//		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

//		1월 31일
//		2월 28일 
//		3월 31일
//		4월 30일
//		5월 31일
//		6월 30일
//		7월 31일
//		8월 31일
//		9월 30일
//		10월 31일
//		11월 30일
//		12월 31일
//31일인 월 : 1 , 3 , 5 , 7, 8,10 ,12
//30일인 월 : 4, 6, 9, 11
//28일인 월 : 2

		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 월(month)을 입력하시오 : ");
		int month = sc.nextInt();

		String result;

		if (month < 1 || month > 12) {
			result = "월은 잘못된 입력 값입니다.";
		} else if (month == 2) {
			result = "은 28일까지 있습니다.";
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			result = "은 30일까지 있습니다.";
		} else {
			result = "은 31일 까지 있습니다.";
		}

		System.out.printf("%d%s", month, result);
	}

	public void practce3Switch() {
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.) // 잘못 입력한 경우 “OO월은 잘못
		 * 입력된 달입니다.”를 출력하세요. (switch문 사용)
		 * 
		 * //31일인 월 : 1 , 3 , 5 , 7, 8,10 ,12 //30일인 월 : 4, 6, 9, 11 //28일인 월 : 2
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 달을 입력하세요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		case 1:case 3:case 5:case 7:case 8:	case 10:case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}

	}

	public void practce4() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만

		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력(cm) : ");

		// 키를 입력받으면서 100으로 나눠 cm를 m로 변환시켜 저장시켰다.
		double height = sc.nextDouble() / 100;
		double bmi = 0;

		if (height < 0.00 || height > 5) { // 만약 키가 0.0m 작 고 50M 보다 크면 에러 ( 기록상 최대 272cm까지 있음)
			System.out.print("height error"); // 둘중 하나라도 false일 경우 error)
		} else {
			System.out.print("몸무게를 입력(kg) : ");
			double weight = sc.nextDouble();
			bmi = weight / (height * height); // bmi계산

			if (weight < 0 || weight > 500) {
				System.out.print("height error"); // 둘중 하나라도 false일 경우 error)
			} else if (18.5 > bmi) {
				System.out.printf("BMI 지수 :%.2f\n저체중입니다", bmi);
			} else if (23 > bmi) {
				System.out.printf("BMI 지수 :%.2f\n정상 체중입니다", bmi);
			} else if (25 > bmi) {
				System.out.printf("BMI 지수 :%.2f\n과체중입니다", bmi);
			} else if (30 > bmi) {
				System.out.printf("BMI 지수 :%.2f\n비만입니다", bmi);
			} else {
				System.out.printf("BMI 지수 :%.2f\n고도비만입니다", bmi);
			}

		}
	}

	public void practce5() {
//		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

		Scanner sc = new Scanner(System.in);

		// 전체값 * 퍼센트 /100

		System.out.print("중간고사 점수를 입력 : ");
		double proj1 = (sc.nextDouble() * 20 / 100);
		System.out.print("기말고사 점수를 입력 : ");
		double proj2 = (sc.nextDouble() * 30 / 100);
		System.out.print("과제 점수를 입력 : ");
		double homeWork = (sc.nextDouble() * 30 / 100);
		System.out.print("출석 횟수를 입력 : ");
		double attend = sc.nextDouble(); // Attend 참여하다

		String result;
		double sum = proj1 + proj2 + homeWork + attend;
		if (attend <= 14) {
			System.out.println("Fail [출석 횟수 부족]");
		} else {
			if (sum < 70) {
				result = "[Fail 점수미달]";
			} else {
				result = "[PASS]";
			}

			System.out.printf(
					"중간 고사 점수(20%%): %.2f\n" + "기말 고사 점수(30%%): %.2f\n" + "과제 점수(30%%)	: %.2f\n"
							+ "출석 점수(20%%)	: %d\n" + "총점	: %.2f\n" + "%s",
					proj1, proj2, homeWork, (int) attend, sum, result);
			// 출석은 출석자체가 전부 점수라 소수점이 나오지않아 인트로 형 변환 시켰다
		}
	}
}