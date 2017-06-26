package com.tjstudy.observer.study;

import java.util.Observable;

/**
 * 生产报纸 每天的最新报纸
 * 
 * @author Administrator
 * 
 */
public class NewspaperObserable extends Observable {

	public void doSend() {
		System.out.println("生产一份报纸");
		// 新鲜报纸已经备好 送往订阅者
		setChanged();
		notifyObservers();// 送往订阅者
	}
}
