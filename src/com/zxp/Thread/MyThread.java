package com.zxp.Thread;

public class MyThread extends Thread {
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(name+"["+i+"]");
		}
		super.run();
	}
    
	
	
	
	

}
