
public class Array_Ex35 {
public static void main(String[] args) {
	int arr[] = {87, 100, 24, 11, 79};	
	
	for(int i=0; i<arr.length;i++)					// �ݺ����� ����ؼ� i ���� ���� ��Ű��
	{												// ������ i�� arr �迭�� �ε����� �����
		System.out.println(arr[i] +" ");			// arr �迭�� ���� ��½�Ŵ
	}
	System.out.println();
	
	
	
	int temp[] = arr;								//temp�迭�� ���� arr�� ���� temp �迭�� ����
	temp[1] = 0;									//�ε��� 1���� 0�� ���� ����
	
	for(int i = 0; i<arr.length;i++)				//������ ������ ���α׷��� ���� ����
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	
	for(int i = 0;i<arr.length;i++)
	{
		System.out.println(temp[i]+" ");			//������ temp�迭�� arr ���� �־��� ������
	}												// temp �迭�� ����ص� �Ȱ��� ���� ����
}
}
