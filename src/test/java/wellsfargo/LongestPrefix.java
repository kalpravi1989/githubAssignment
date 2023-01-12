package wellsfargo;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LongestPrefix {
	@Test
	public void test1() {
		String[] s = { "flower", "flow", "flour" };
		String ans = findLongestPrefix(s);
		System.out.println(ans);
	}

	@Test
	public void test2() {
		String[] s = {};
		String ans = findLongestPrefix(s);
		System.out.println(ans);
	}

	@Test
	public void test3() {
		String[] s = { "flower" };
		String ans = findLongestPrefix(s);
		System.out.println(ans);
	}

	@Test
	public void test4() {
		String[] s = { "zlower", "ylow", "blour" };
		String ans = findLongestPrefix(s);
		System.out.println(ans);
	}

	private String findLongestPrefix(String[] s) {
		String res = "";
		if (s.length == 0) {
			res = "";
		}
		if (s.length == 1) {
			res = s[0];
		}
		Arrays.sort(s);
		int i = 0;
		int minLength = Math.min(s[0].length(), s[s.length - 1].length());
		while (i < minLength && s[0].charAt(i) == s[s.length - 1].charAt(i))
			i++;

		res = s[0].substring(0, i);
		return res;
	}

}
