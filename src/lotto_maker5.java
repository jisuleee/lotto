import java.io.*;
import java.util.Random;

public class lotto_maker5 {
	
	public void sleep(int time){
	    try {
	      Thread.sleep(time);
	    } catch (InterruptedException e) { }

	}           //sleep�Լ��� ���� ���� ������ �Լ�
                                                          
	
	public static void main(String[] args) throws IOException{
		
		lotto_maker5 lot = new lotto_maker5();
		
		Random ra = new Random();
		int temp;
		
		int lotto[] = new int[45];
		//System.out.println(a.length); //45
		
		for(int i=0; i<45;i++) {
			lotto[i] = i+1;
		}
		
		
		System.out.println("***********���� ��*********** ");
		for (int i=0; i<lotto.length;i++) {			
			System.out.print(lotto[i]+" ");
			if( (i+1)%10 == 0) {
				System.out.println(" ");
			}
		}
			
		for (double j= 0; j<1000; j++) {
			
			int k = ra.nextInt(45); 
			temp = lotto[0];
			lotto[0] = lotto[k];
			lotto[k] = temp;			
		}              //������ lotto[0]���� ������ lotto[i]����  ��ȯ�ϴ� �۾��� ����� �����Ͽ�
		               //���� �ζ� ��ȣ���� ���� ���� �� �ֵ��� �Ѵ�
		
		System.out.print("\n\n");
		System.out.println("***********���� �� *********** ");
		for (int i=0; i<lotto.length;i++) {			
			System.out.print(lotto[i]+" ");
			if( (i+1)%10 == 0) {  //���ٿ� 10���� ��Ÿ�� 
				System.out.println(" ");
			}
		}
		
		
		System.out.println("\n\n��÷��ȣ��");   // ���ڰ� ���� ���� 1��°~6��° ���� �ζǹ�ȣ�� ���� 
		
		for (int i=0; i<6; i++) {		
			System.out.print(lotto[i]+" ");
			lot.sleep(1000);  //������ȣ���� ���� �ξ� ���尨 ����  
			}
		
		
		System.out.println("\n\n ���ʽ���ȣ��");
		lot.sleep(3000);
		System.out.print(lotto[9]);   //lotto[]�� 9��° ���� ������ȣ�� ������ ���ʽ���ȣ�� ����  
	}

}
