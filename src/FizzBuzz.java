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
			return String.valueOf(i);
		}
	}
	
//	Tutaj napisałem jeszcze krótszą wersję z ternariuszami. Wydaje mi się że moze być szybszaponieważ jest mniej dzielenia
	public static String fizzBuzz2(int i){
		String fizz = (i % 3 == 0)?"Fizz":"";
		String buzz = (i % 5 == 0)?"Buzz":"";
		return ((fizz + buzz).isEmpty())?String.valueOf(i):(fizz + buzz);	
	}
}
