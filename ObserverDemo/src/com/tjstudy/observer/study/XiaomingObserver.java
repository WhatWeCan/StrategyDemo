package com.tjstudy.observer.study;

import java.util.Observable;
import java.util.Observer;

public class XiaomingObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("xiaoming:接收到新报纸");
	}
}
