package lab2;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User("tom");
		Date date = new Date();
		String content = "new post";
		
		friendPost fp = new friendPost(date,content,user);
		System.out.println(fp.getUser().getName());
		System.out.println(fp.getContent());		
		
		
		System.out.println(fp.contains("post"));
		System.out.println(fp.contains("HKUST"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
