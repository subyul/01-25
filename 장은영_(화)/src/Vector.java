import java.util.Scanner;
public class Vector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score [] = null;								//������ score �迭�� ����
		int count = 0;										//������ ����Ǹ� count�� ����
		int check = -1;
		while(true)											//���α׷��� �������ʰ� ��� �ݺ�
		{													//�ؾ��ϱ� ������ while�� ���
			System.out.println("==============");
			for(int i = 0; i<count;i++)
			{
				System.out.print(score[i]+" ");
			}
			System.out.println();
			System.out.println("==============");
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1] �߰�");
			System.out.println("[2] ����(�ε���)");
			System.out.println("[3] ����(��)");
			System.out.println("[4] ����");
			System.out.println("[0] ����");
			
			System.out.print("�޴� ����:");
			int select = sc.nextInt();
			
			if(select == 1)  								// select�� 1�� �ԷµǸ�
			{												// ������ �߰���
				System.out.println("�߰��� ���� �Է�");
				int dtscore = sc.nextInt();					// ����ڰ� �Է��� ������ dtscore�� ����
				if(count == 0)								// count�� 0�̸� �Էµ� ������ ���ٴ� ��
				{
					score = new int[count+1];				// score�迭�� �ε����� ���� ������
				}											// count�� 1�� ���� ���� �ε����� ����
				else if(count>0)
				{											
					int temp [] = score;					//temp�迭�� ����� score �迭�� ������
					score = new int[count+1];
					for(int i=0; i<count;i++)				
					{
						score[i] = temp[i];					//score �迭�� i�ε����� temp[i]�� ����
					}
 				}
				score[count] = dtscore;						
				count++;
			}
			
			else if(select == 2)							//select�� 2�� �ԷµǸ� �ε��� ������ ����
			{
				if(count == 0)								// count�� 0�̸� ������ ���ٴ� ��
				{											// ������ ������ ���ٴ� �޽��� ���
					System.out.println("������ ���� ����");
				}
				else if(count>0)							// count�� 0���� ũ�� ������ �־
				{											// ������ ���� ���� ����
					int temp [] = score;					// temp�迭�� ����� score �迭�� ����
					
					score = new int[count-1];				
					
					System.out.println("������ ������ �ε����� �Է��ϼ���");
					int delin = sc.nextInt();				// ����ڰ� ������ �ε����� delin�� ����
			
					for(int i = delin; i<count-1;i++)
					{
						score[i] = temp[i+1];				// �ε��� ���� ����� ��ĭ ���� ����
					}										// �ε����� 1�� ���� �ڿ� �ִ� �ε����� ������
				}
				count --;									// �����͸� ���� �����Ƿ� count -1
			}
			
			else if(select == 3)							// select�� 3�� �ԷµǸ� �� ���� ����
			{
				if(count == 0)
				{											// count�� 0�̶�� ������ ���ٴ� ��
					System.out.println("������ ���� ����");  	// �޽��� ���
				}

					int delin = -1;							// ������� �ϴ� �ε���
					System.out.println("������ ������ �Է��ϼ���");
					int delscore = sc.nextInt();			// ������ ������ �Է¹޾� ������ ����
					
					for(int i=0;i<score.length;i++)
					{
						if(score[i] == delscore)			// score �迭�� �ִ� �����Ϳ�
						{									// ����ڰ� �Է��� ���� ���ٸ�
							delin = i;						// delin ������ i�� ����
						}
					}
					if( delin == -1)						
					{
						System.out.println("������ ���� ����");
					}
					else if(count > 1)
					{
						int temp[] = score;					// score�迭�� ������
						score = new int[count - 1];			// �迭�� ũ�⸦ ����
						int j = 0;
						for (int i=0; i<count;i++)
						{
							if(i!=delin)					// i�� delin�� �ٸ��ٸ�
							{								// score[j]�� temp[i]�� ���� ����
								score[j] = temp[i];
								j += 1;						// j�� 1�� ����
										
							}
						}
					}
					count --;								// ���� �����߱� ������ count�� ����
				}
			else if(select == 4)							// select�� 4�� �ԷµǸ� ���� ����
			{
				System.out.println("������ ��ġ(�ε���)�� �Է��ϼ���");
				int indata = sc.nextInt();
				if(count<indata || indata<0)				// ����ڰ� �����Ϸ��� ��ġ�� ������� ĭ�� ������
				{											// ũ�ų� 0���� ������ X
					System.out.println("�Ұ��մϴ�");
					continue;
				}
				System.out.println("������ ������ �Է��ϼ���");
				int numscore = sc.nextInt();
				
				if(count == 0)								
				{
					score = new int[count + 1];				// �迭�� �ε��� ���� �ø�
				}
				else if(count >0)							
				{
					int temp[] = score;						//temp�迭�� score�迭�� ����
					score = new int[count+1];
					
					int j = 0;								
					for(int i = 0; i<count; i++)
					{
						if(i != indata)						
						{
							score[i] = temp[j];
							j+=1;							// ���� ������
						}
					}
				}
				score[indata] = numscore;					// ����ڰ� �Է��� �ε����� ������ ������
				count++;									// ����� ������ �þ��� ������ 
			}												// count ����
			
			else if(select == 0)							//select�� 0�� �ԷµǸ�
			{												//���α׷� ����
				System.out.println("���� ��Ʈ�ѷ��� �����մϴ�...");
				break;										// while���� ��������
			}
			}
			
			
			
			
		}
	

}
