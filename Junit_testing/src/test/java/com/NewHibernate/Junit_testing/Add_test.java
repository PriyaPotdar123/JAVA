package com.NewHibernate.Junit_testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Add_test {
	
	Add add = null;
	
	@Before
	public void test()
	{
		add = new Add();
	}
	
	@Test
	public void add_test()
	{
		assertEquals(5,add.add(2, 3));
	}
}
