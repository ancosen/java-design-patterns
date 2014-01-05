package com.github.ancosen.strategy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.ancosen.strategy.IMachine.MachineClass;

public class StrategyTest{
	
	@Test
	public void testStrategyLowMaxSpeed(){
		Machine m = new Machine(100, 200, "Impreza", true, MachineClass.RACING);
		Machine m1 = new Machine(102, 230, "Terrano", true, MachineClass.SUV);
		Machine m2 = new Machine(167, 120, "Clio", true, MachineClass.NORMAL);	
		
		List p = new ArrayList();
		
		p.add(m);
		p.add(m1);
		p.add(m2);
		
		new LowMaxSpeedStrategy(p).order();
		
		System.err.println(p.toString());
	}
	
	@Test
	public void testStrategyMaxLowHorses(){
		Machine m = new Machine(100, 200, "Impreza", true, MachineClass.RACING);
		Machine m1 = new Machine(102, 230, "Terrano", true, MachineClass.SUV);
		Machine m2 = new Machine(101, 120, "Clio", true, MachineClass.NORMAL);	
		
		List p = new ArrayList();
		
		p.add(m);
		p.add(m1);
		p.add(m2);
		
		new MaxLowHorsesStrategy(p).order();
		
		System.err.println(p.toString());
	}
	
	@Test
	public void testStrategyName(){
		Machine m = new Machine(100, 200, "Impreza", true, MachineClass.RACING);
		Machine m1 = new Machine(102, 230, "Terrano", true, MachineClass.SUV);
		Machine m2 = new Machine(101, 120, "Clio", true, MachineClass.NORMAL);	
		
		List p = new ArrayList();
		
		p.add(m);
		p.add(m1);
		p.add(m2);
		
		new NameStrategy(p).order();
		
		System.err.println(p.toString());
	}

}
