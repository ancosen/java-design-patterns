package com.github.oscerd.strategy;

import java.awt.Color;

public interface IMachine {

	 public enum MachineClass {
		 SUV,
		 RACING,
		 NORMAL;
		 private MachineClass(){}
		 }
	 
	 	Boolean is4WD();
}
