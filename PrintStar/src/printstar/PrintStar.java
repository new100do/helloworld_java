package printstar;
import java.util.Scanner;

public class PrintStar {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int inputInt;
		String inputSelect;
		do{
			System.out.println("숫자를 입력하세요 1~4");
			inputInt = scanner.nextInt();
			switch(inputInt){
				case 1:
					for(int i =0;i<inputInt;i++)
					{
						System.out.println("*");
					}
					System.out.println('\n');
					break;
				case 2:
					System.out.println("    *");
					System.out.println("   **");
					System.out.println("  ***");
					System.out.println(" ****");
					System.out.println("*****");
					break;	
				case 3:
					System.out.println("*****");
					System.out.println(" ****");
					System.out.println("  ***");
					System.out.println("   **");
					System.out.println("    *");
					break;
				case 4:
					System.out.println("*****");
					System.out.println("****");
					System.out.println("***");
					System.out.println("**");
					System.out.println("*");
					break;	
			}
			System.out.println("게임을 진행하시겠습니까? y/n");
			inputSelect = scanner.nextLine();
		} while(! inputSelect.equals("n"));
			System.out.println("게임을 종료합니다.");
		
	}
}
