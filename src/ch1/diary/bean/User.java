package ch1.diary.bean;
import java.util.*;
import java.io.*;
import ch1.diary.bean.Diary;
import ch1.diary.gui.DiaryWindow;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class User {

	public static void main(String[] args) {
	
		User user = new User("Java lover","male",20);
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DiaryWindow dW = new DiaryWindow(user);
		dW.setVisible(true);
		
		for(int i = 0; i < 3; ++i)
		{
			String authorname = user.getName();
			String title = "No." + i + " daires";
			String content = "No." + i + " pages";
			
			GregorianCalendar time = new GregorianCalendar();
			
			Diary diary = new Diary(title,content,time,authorname);
			
			diaries.add(diary);						
		}
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("title:"+diaries.get(i).getTitle());
			System.out.println("authoName:"+diaries.get(i).getAuthorName());
			System.out.println("Content:"+diaries.get(i).getContent());
			System.out.println("*************************************");
			
			
		}
		
	}
	public User() {
		super();
	}

	public User(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	private String name;
	private String gender;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
