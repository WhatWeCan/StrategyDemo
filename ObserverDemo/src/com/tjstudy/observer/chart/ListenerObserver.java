package com.tjstudy.observer.chart;

import java.util.Observable;
import java.util.Observer;

public class ListenerObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("listerner：接收到数据-" + arg);
	}
}
