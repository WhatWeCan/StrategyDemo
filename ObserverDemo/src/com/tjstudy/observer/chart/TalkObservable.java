package com.tjstudy.observer.chart;

import java.util.Observable;

/**
 * ֻ����һ�����ԣ�����֮�����������߶��ܹ����յ����Ե���Ϣ
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
