package com.tjstudy.observer.chart;

import java.util.Observable;

/**
 * 只允许一个发言，发言之后，其他订阅者都能够接收到发言的信息
 * 
 * @author Administrator
 * 
 */
public class TalkObservable extends Observable {
	public void doTalk(String mess) {
		setChanged();
		notifyObservers(mess);
	}
}
