import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100;i++) {
			System.out.println(fizzBuzz(i));
		}
	}
	
	public static String fizzBuzz(int i){
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if(i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else {
//				Czy mo¿na tutaj zastosowaæ zapis i + ""
			return Integer.valueOf(i).toString();
		}		
	}
}
