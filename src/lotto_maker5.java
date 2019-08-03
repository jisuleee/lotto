import java.io.*;
import java.util.Random;

public class lotto_maker5 {
	
	public void sleep(int time){
	    try {
	      Thread.sleep(time);
	    } catch (InterruptedException e) { }

	}           //sleep함수를 쓰기 위해 설정한 함수
                                                          
	
	public static void main(String[] args) throws IOException{
		
		lotto_maker5 lot = new lotto_maker5();
		
		Random ra = new Random();
		int temp;
		
		int lotto[] = new int[45];
		//System.out.println(a.length); //45
		
		for(int i=0; i<45;i++) {
			lotto[i] = i+1;
		}
		
		
		System.out.println("***********섞기 전*********** ");
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
		}              //고정된 lotto[0]값과 임의의 lotto[i]값을  교환하는 작업을 충분히 시행하여
		               //판의 로또 번호들이 전부 섞일 수 있도록 한다
		
		System.out.print("\n\n");
		System.out.println("***********섞은 후 *********** ");
		for (int i=0; i<lotto.length;i++) {			
			System.out.print(lotto[i]+" ");
			if( (i+1)%10 == 0) {  //한줄에 10개씩 나타냄 
				System.out.println(" ");
			}
		}
		
		
		System.out.println("\n\n당첨번호는");   // 숫자가 섞인 판의 1번째~6번째 값을 로또번호로 설정 
		
		for (int i=0; i<6; i++) {		
			System.out.print(lotto[i]+" ");
			lot.sleep(1000);  //다음번호까지 텀을 두어 긴장감 연출  
			}
		
		
		System.out.println("\n\n 보너스번호는");
		lot.sleep(3000);
		System.out.print(lotto[9]);   //lotto[]의 9번째 값을 뽑힌번호를 제외한 보너스번호로 설정  
	}

}
