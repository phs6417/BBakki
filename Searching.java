import java.util.Scanner;

public class Searching {
	public static void main(String args[]) {
		
	
		
		//substring , indexOf , char
		
		//matches 
		
		String ex = "예시용 단어 example word";
//		Scanner searching = new Scanner(System.in);
		
//		if(ex.matches(.searching))
//			System.out.println(searching);
//		입력을 직접 받는형식 연구해보기
//				
		if(ex.matches(".*example.*"))
			System.out.println("yes");
		else
			System.out.println("no");
		
				
				
	}
}

