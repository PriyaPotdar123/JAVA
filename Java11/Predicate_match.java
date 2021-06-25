package Java11;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Predicate_match {

		
		//asMatchPredicate() it is used to compare the pattern using match function
	   Pattern pattern =  Pattern.compile("^a.*z$");
	   Predicate<String> predicate = pattern.asMatchPredicate();
	   boolean res = predicate.test("aaaaaaaaaaaaaa******");
	   
	   Pattern pattern1 =  Pattern.compile("madam");
	   Predicate<String> predict = pattern1.asMatchPredicate();
	   boolean res1 = predict.test("madam");
	   
	   //aspredict() method gives true value if the given pattern is same or substring of
	   //that pattern
	   Pattern p = Pattern.compile(" *ab"); 
	   boolean res3 = p.asPredicate().test("abc");
	   
	   public static void main(String[] args) {
		Predicate_match pt = new Predicate_match();
		System.out.println(pt.res);
		System.out.println(pt.res1);
		System.out.println(pt.res3);
		
	}
			
}



