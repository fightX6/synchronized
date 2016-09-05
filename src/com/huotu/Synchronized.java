/**
 * 
 */
package com.huotu;

import java.util.ArrayList;

/**
 * Synchronized
 * @author xf
 * 2016年9月5日下午12:06:24
 */
public class Synchronized {
	private int x = 100;
	public int getX(){
		return x;
	}
	public synchronized int fix(int y){
		synchronized(this){
			x = x - y;
		}
		return x;
	}
}
