package com.zxp.Thread;

public class ThreadDemo {
	public static void main(String[] args){
		MyThread t=new MyThread("A");
		t.start();
		for(int i=0;i<100;i++){
			   if(i>50){
				       try{
					        t.join();
				           }catch(InterruptedException e){
					         e.printStackTrace();
			               }
			         }
			System.out.println("Ö÷Ïß³Ì"+"["+i+"]");
		}	
	}
}
