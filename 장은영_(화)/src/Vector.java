import java.util.Scanner;
public class Vector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score [] = null;								//점수를 score 배열에 저장
		int count = 0;										//점수가 저장되면 count는 증가
		int check = -1;
		while(true)											//프로그램을 멈추지않고 계속 반복
		{													//해야하기 때문에 while문 사용
			System.out.println("==============");
			for(int i = 0; i<count;i++)
			{
				System.out.print(score[i]+" ");
			}
			System.out.println();
			System.out.println("==============");
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1] 추가");
			System.out.println("[2] 삭제(인덱스)");
			System.out.println("[3] 삭제(값)");
			System.out.println("[4] 삽입");
			System.out.println("[0] 종료");
			
			System.out.print("메뉴 선택:");
			int select = sc.nextInt();
			
			if(select == 1)  								// select에 1이 입력되면
			{												// 성적을 추가함
				System.out.println("추가할 성적 입력");
				int dtscore = sc.nextInt();					// 사용자가 입력한 성적은 dtscore에 저장
				if(count == 0)								// count가 0이면 입력된 성적이 없다는 뜻
				{
					score = new int[count+1];				// score배열에 인덱스가 없기 때문에
				}											// count에 1을 더한 값을 인덱스로 지정
				else if(count>0)
				{											
					int temp [] = score;					//temp배열을 만들고 score 배열을 참조함
					score = new int[count+1];
					for(int i=0; i<count;i++)				
					{
						score[i] = temp[i];					//score 배열의 i인덱스에 temp[i]를 저장
					}
 				}
				score[count] = dtscore;						
				count++;
			}
			
			else if(select == 2)							//select에 2가 입력되면 인덱스 삭제를 실행
			{
				if(count == 0)								// count가 0이면 성적이 없다는 뜻
				{											// 삭제할 성적이 없다는 메시지 출력
					System.out.println("삭제할 성적 없음");
				}
				else if(count>0)							// count가 0보다 크면 성적이 있어서
				{											// 데이터 삭제 진행 가능
					int temp [] = score;					// temp배열을 만들어 score 배열을 참조
					
					score = new int[count-1];				
					
					System.out.println("삭제할 성적의 인덱스를 입력하세요");
					int delin = sc.nextInt();				// 사용자가 삭제할 인덱스는 delin에 저장
			
					for(int i = delin; i<count-1;i++)
					{
						score[i] = temp[i+1];				// 인덱스 값을 지우고 한칸 당기기 위해
					}										// 인덱스에 1을 더해 뒤에 있던 인덱스를 저장함
				}
				count --;									// 데이터를 삭제 했으므로 count -1
			}
			
			else if(select == 3)							// select에 3이 입력되면 값 삭제 실행
			{
				if(count == 0)
				{											// count가 0이라면 성적이 없다는 뜻
					System.out.println("삭제할 성적 없음");  	// 메시지 출력
				}

					int delin = -1;							// 지우려고 하는 인덱스
					System.out.println("삭제할 성적을 입력하세요");
					int delscore = sc.nextInt();			// 삭제할 성적을 입력받아 변수에 저장
					
					for(int i=0;i<score.length;i++)
					{
						if(score[i] == delscore)			// score 배열에 있는 데이터와
						{									// 사용자가 입력한 값이 같다면
							delin = i;						// delin 변수에 i값 저장
						}
					}
					if( delin == -1)						
					{
						System.out.println("삭제할 성적 없음");
					}
					else if(count > 1)
					{
						int temp[] = score;					// score배열을 참조함
						score = new int[count - 1];			// 배열의 크기를 줄임
						int j = 0;
						for (int i=0; i<count;i++)
						{
							if(i!=delin)					// i와 delin이 다르다면
							{								// score[j]에 temp[i]의 값을 넣음
								score[j] = temp[i];
								j += 1;						// j에 1을 더함
										
							}
						}
					}
					count --;								// 값을 삭제했기 때문에 count를 줄임
				}
			else if(select == 4)							// select에 4가 입력되면 삽입 실행
			{
				System.out.println("삽입할 위치(인덱스)를 입력하세요");
				int indata = sc.nextInt();
				if(count<indata || indata<0)				// 사용자가 삽입하려는 위치가 만들어진 칸의 수보다
				{											// 크거나 0보다 작으면 X
					System.out.println("불가합니다");
					continue;
				}
				System.out.println("삽입할 성적을 입력하세요");
				int numscore = sc.nextInt();
				
				if(count == 0)								
				{
					score = new int[count + 1];				// 배열의 인덱스 수를 늘림
				}
				else if(count >0)							
				{
					int temp[] = score;						//temp배열에 score배열을 참조
					score = new int[count+1];
					
					int j = 0;								
					for(int i = 0; i<count; i++)
					{
						if(i != indata)						
						{
							score[i] = temp[j];
							j+=1;							// 위와 동일함
						}
					}
				}
				score[indata] = numscore;					// 사용자가 입력한 인덱스에 성적을 삽입함
				count++;									// 저장된 성적이 늘었기 떄문에 
			}												// count 증가
			
			else if(select == 0)							//select에 0이 입력되면
			{												//프로그램 종료
				System.out.println("벡터 컨트롤러를 종료합니다...");
				break;										// while문을 빠져나감
			}
			}
			
			
			
			
		}
	

}
