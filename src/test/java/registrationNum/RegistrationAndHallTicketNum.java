package registrationNum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationAndHallTicketNum {

	public static void main(String[] args) {
		String str1 = "Your application has been accepted and your registration number is 093467 and your hall ticket number is BNG32016";
		Pattern regstno = Pattern.compile("\\d+");
		Pattern halltkt = Pattern.compile("[A-Z0-9]{8}");

		System.out.println("Registration Number" + "       " + "Hall Ticket");
		System.out.println("------------------------------------------------");
		Matcher m1 = regstno.matcher(str1);
		if (m1.find()) {
			System.out.print(m1.group() + "                      ");
		}
		Matcher m2 = halltkt.matcher(str1);
		if (m2.find()) {
			System.out.println(m2.group());
		}
		String str2 = "Application number 9823019348 has been accepted. 0955693 is your hall ticket number";
		Pattern pt2 = Pattern.compile("\\d+");
		Matcher m3 = pt2.matcher(str2);
		while (m3.find()) {
			System.out.print(m3.group() + "                  ");
		}
		System.out.println("");

		String str3 = "Hall ticket is generated with number 39458 for the application AB123XZ";
		Pattern pt3 = Pattern.compile("[A-Z0-9]{7}");
		Matcher m4 = pt3.matcher(str3);
		if (m4.find()) {
			System.out.print(m4.group() + "                      ");
		}
		Pattern pt4 = Pattern.compile("\\d+");
		Matcher m5 = pt4.matcher(str3);
		if (m5.find()) {
			System.out.println(m5.group());
		}
	}
}
