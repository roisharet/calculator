package strNum;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Tester {
	@Test
	public void calculat0() 
	{
		strNum s = new strNum();
		s.Add(" ");
	}
	
	
	@Test
	public void calculat1()
	{
		String str="3";
		strNum s = new strNum();
		System.out.println(s.Add(str));
		
	}
	
	@Test
	public void calculat2()
	{
		String str="556";
		strNum s = new strNum();
		System.out.println(s.Add(str));
	}
	
	@Test
	
	public void calculat3()
	{
		String str="1,2";
		strNum s = new strNum();
		System.out.println(s.Add(str));
	}
	
}


