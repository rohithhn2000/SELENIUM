package methodrecursion;

public class printno {
	public static void printno(int num) {
		if(num==0){
			return;
		}
		System.out.print(num+" ");
		printno(num-1);
		System.out.print(num+" ");          return;
		
			
		}
	public static void main(String [] args) {
		printno(5);
	}

}
