
public class Array_Ex35 {
public static void main(String[] args) {
	int arr[] = {87, 100, 24, 11, 79};	
	
	for(int i=0; i<arr.length;i++)					// 반복문을 사용해서 i 값을 증가 시키고
	{												// 증가한 i를 arr 배열의 인덱스로 사용해
		System.out.println(arr[i] +" ");			// arr 배열의 값을 출력시킴
	}
	System.out.println();
	
	
	
	int temp[] = arr;								//temp배열을 만들어서 arr의 값을 temp 배열에 넣음
	temp[1] = 0;									//인덱스 1에는 0의 값을 넣음
	
	for(int i = 0; i<arr.length;i++)				//위에서 실행한 프로그램과 같게 실행
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	
	for(int i = 0;i<arr.length;i++)
	{
		System.out.println(temp[i]+" ");			//위에서 temp배열에 arr 값을 넣었기 때문에
	}												// temp 배열을 출력해도 똑같은 값이 나옴
}
}
