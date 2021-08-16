package com.NewHibernate.Junit_testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(MockitoJUnitRunner.class)
public class Test_record 
{
	@InjectMocks
	Data_record rec;
	
	@Mock
	savein_network net;
	
	@Mock
	Savein_database det;
	
	@Test
	public void testing()
	{
		boolean ans = rec.addingData("imp.txt");
		assertEquals(ans, true);
	
		verify(det, times(1)).save("imp.txt");
        verify(net, times(1)).save("imp.txt");
	}
}
