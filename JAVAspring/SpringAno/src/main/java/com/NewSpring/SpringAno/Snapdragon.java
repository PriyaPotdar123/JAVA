package com.NewSpring.SpringAno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	public void setprocessor() {
		System.out.println("With SnapDragon 1st Processor");
	}

}
