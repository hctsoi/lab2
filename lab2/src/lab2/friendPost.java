package lab2;

import java.util.Date;

public class friendPost extends Post{
	private User friend;
	
	public friendPost(Date date, String content, User friend) {
		super(date, content);
		super.setContent(content);
		super.setDate(date);
		super.setUser(friend);
	}

	
	
}
