package com.mindtree.entity;

import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AreaTester {
	@InjectMocks
	Area area = new Area();
	@Mock
	AreaInterface areainterface;
	static int count;
	public AreaTester(Area area, AreaInterface areainterface) {
		super();
		this.area = area;
		this.areainterface = areainterface;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		AreaTester.count = count;
	}
	@Test
	public void testAreaRectangle()
	{
		when(areainterface.areaRectangle(7, 7)).thenReturn(49);
		Assert.assertEquals(areainterface.areaRectangle(7, 7),49);
		
	}
	@Test
	public void testAreaCircle()
	{
		when(areainterface.areaCircle(7)).thenReturn(154);
		Assert.assertEquals(areainterface.areaCircle(7),154);
		
	}
	@Test
	public void testAreaSquare()
	{
		when(areainterface.areaSquare(7)).thenReturn(49);
		Assert.assertEquals(areainterface.areaSquare(7),49);
		
	}
	@Test
	public void testAreaTriangle()
	{
		when(areainterface.areaTriangle(7, 4)).thenReturn(14);
		Assert.assertEquals(areainterface.areaTriangle(7, 4),14);
		
	}
	@Before
	public void printBefore()
	{
		System.out.println("Testing function : " + count++);
	}
	@After
	public void printAfter()
	{
		System.out.println("Testing successfully completed for function : " + count);
	}
	@AfterClass
	public void printAfterClass()
	{
		System.out.println("Successfully completed all the tests .... ");
	}
	
}
