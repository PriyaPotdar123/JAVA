package com.NewHibernate.Junit_testing;

import org.springframework.beans.factory.annotation.Autowired;

public class Data_record 
{
	@Autowired
	savein_network net;
	
	@Autowired
	Savein_database data;
	
	
	public boolean addingData(String datastring)
	{
	  net.save(datastring);	 
	  data.save(datastring);
	  return true;
	}
}
