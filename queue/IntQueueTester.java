package queue;

import java.util.Scanner;

class IntQueueTester {

	public static void main(String[] args) {
		IntQueue iq = new IntQueue(8);
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		
		while (!quit) {
			System.out.println("=================================================");
		    System.out.printf("현재 데이터 개수: %d / %d\n", iq.getSize(), iq.getCapacity());
		    System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(0)종료: ");
		    
		    int menu = sc.nextInt();
		    
		    switch(menu) {
		    case 1:
		    	System.out.print("인큐할 데이터 : ");
		    	iq.enqueue(sc.nextInt());
		    	break;
		    	
		    case 2:
		    	iq.dequeue();
		    	break;
		    	
		    case 3:
		    	iq.peek();
		    	break;
		    	
		    case 4:
		    	iq.dump();
		    	break;
		    	
		    case 0:
		    	quit = true;
		    	break;
		    	
		    default:
		    	System.out.println("0에서 4번 사이 숫자를 입력해주세요.");
		    }
		    
		}
		
	}

}
