package com.project.Facadepattern;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Circle implements ShapeCreator{

	public void shape() {
		System.out.println("circle is created");
	}

}
