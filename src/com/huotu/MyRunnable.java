/**
 * 
 */
package com.huotu;

/**
 * Thread1
 * @author xf
 * 2016年9月5日下午12:05:06
 */
public class MyRunnable implements Runnable{
	private Synchronized  s = new Synchronized();
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable(); 
        Thread ta = new Thread(r, "Thread-A"); 
        Thread tb = new Thread(r, "Thread-B"); 
        ta.start(); 
        tb.start(); 
	}
	private int i = 100;
	@Override
	public void run() {
		
		while(i>0) { 
            s.fix(10); 
            try { 
                Thread.sleep(50); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
            System.out.println(Thread.currentThread().getName() + " : 当前i值= " + i);
            System.out.println(Thread.currentThread().getName() + " : 当前foo对象的x值= " + s.getX());
        	i--;
        } 
	}
}
