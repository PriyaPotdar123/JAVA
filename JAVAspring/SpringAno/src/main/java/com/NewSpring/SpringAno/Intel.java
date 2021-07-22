package com.NewSpring.SpringAno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Intel implements Processor {

	public void setprocessor() {
		System.out.println("With Intel 2nd Processor");
	}

}
