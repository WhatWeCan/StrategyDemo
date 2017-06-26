package com.tjstudy.observer.chart;

import java.util.Observable;
import java.util.Observer;

public class Listener2Observer implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("listerner2：接收到数据-" + arg);
	}
}
