package lab2;
import java.util.*;

public class Post {
	private Date date;
	private String content;
	private User user; // the author

	
	
	
	
public Post(Date date, String content){
	//construstor
	
	
}
	
public Post(Date _date, String _content, User _user){
	//constructor with user
	date = _date;
	content = _content;
	user = _user;
	
}
	
public Date getDate(){
	return date;
}
public void setDate(Date _date){
	date = _date;
	
}

public void setUser(User _user){
	user = _user;
	
}
public User getUser(){
	return user;
	
}
	
public String getContent(){
	
	return content;
}
	
	
public void setContent(String _content){
	content = _content;
	//_content is what user typed
}
	
	@Override
public String toString(){
	String print = "";
	print += content;
	System.out.println(print);
	
	return print;
}


public boolean equals(Object a,Object b){
		if(b == null){return false;} // object being compared is null
		if(a.getClass() != b.getClass()){return false;} // class comparison

		Post postA = (Post) a;
		Post postB = (Post) b;
		if(postA.getUser() != postB.getUser()){return false;}
		if(postA.getContent() != postB.getContent()){return false;}
		if(postA.getDate() != postB.getDate()){return false;}
		
		return true;
	}
	
	
@Override
public int hashCode(){
	int hashCode = 0;
	date.hashCode();
	content.hashCode();
	user.hashCode();
	
	
	return hashCode;
}
	
public boolean contains(String keyword){
	if(content.contains(keyword)){return true;}
	
	
	return false;
}


	
}


