package com.tjstudy.observer.study;

import java.util.Observable;

/**
 * ������ֽ ÿ������±�ֽ
 * 
 * @author Administrator
 * 
 */
public class NewspaperObserable extends Observable {

	public void doSend() {
		System.out.println("����һ�ݱ�ֽ");
		// ���ʱ�ֽ�Ѿ����� ����������
		setChanged();
		notifyObservers();// ����������
	}
}
