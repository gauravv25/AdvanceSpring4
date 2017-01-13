package aniket.demo;

import javax.jws.WebService;

@WebService
public class Calc {
	public int add(int no1, int no2)
	{
		System.out.println("in add method : "+no1+" "+no2);
		
		return no1 + no2;
	}
}
