package chapter3;

public class OperationEx8 {

	public static void main(String[] args) {
		int num = 0B00000101;	// 5를 8비트 2진수로 표현
		System.out.println(num << 2);	// 왼쪽으로 2비트 이동
		System.out.println(num >> 2);	// 오른쪽으로 2비트 이동
		System.out.println(num >>> 2);	// 오른쪽으로 2비트 이동
		
		System.out.println(num);
		num = num << 2;
		System.out.println(num);
	}

}
