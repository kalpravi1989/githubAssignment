package sprint2gitAssignment;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GitAssignment {

	@Test
	public void test1() {
		String str = "Show09allBC 1950AD";
		String ans = sortArray(str);
		System.out.println(ans);
		Assert.assertEquals(ans, "ABCDSahlow 0159");
	}

	@Test
	public void test2() {
		String str = "Zhow09allBC 19592DefED";
		String ans = sortArray(str);
		System.out.println(ans);
		Assert.assertEquals(ans, "BCDEZaefhlow 01259");
	}
	private String sortArray(String str) {
		String res="";
		String cap="";
		String small="";
		String num="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				if (!cap.contains(String.valueOf(str.charAt(i))))
				cap=cap+str.charAt(i);
			}else if(Character.isLowerCase(str.charAt(i))) {
				if (!small.contains(String.valueOf(str.charAt(i))))
				small=small+str.charAt(i);
			}else if(Character.isDigit(str.charAt(i))) {
				if (!num.contains(String.valueOf(str.charAt(i))))
				num=num+str.charAt(i);
			}
		}
		String[] cap1 = cap.split("");
		String[] small1 = small.split("");
		String[] num1 = num.split("");
		Arrays.sort(cap1);
		Arrays.sort(small1);
		Arrays.sort(num1);
		res = String.join("", cap1) + String.join("", small1) + " " + String.join("", num1);
		return res;
	}

}
