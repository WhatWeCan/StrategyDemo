package com.tjstudy.observer.chart;

import java.util.Observable;
import java.util.Observer;

public class Listener1Observer implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("listerner1�����յ�����-" + arg);
	}
}
