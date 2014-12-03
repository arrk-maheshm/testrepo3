package com.arrk.test;

public class person {
	int pid;
	String name;
	address adr;
	public person(int pid, String name, address adr) {
		super();
		this.pid = pid;
		this.name = name;
		this.adr = adr;
	}
	
	

	public person() {
		
	}
	
	
	public void show()
	{
	System.out.println("employee details are ");
	System.out.println(pid +"-"+name+"-"+adr.toString());
				
	}
	

	
	
}
