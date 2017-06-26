package com.tjstudy.observer;

import com.tjstudy.observer.chart.Listener1Observer;
import com.tjstudy.observer.chart.Listener2Observer;
import com.tjstudy.observer.chart.ListenerObserver;
import com.tjstudy.observer.chart.TalkObservable;
import com.tjstudy.observer.study.LisiObserver;
import com.tjstudy.observer.study.NewspaperObserable;
import com.tjstudy.observer.study.XiaomingObserver;
import com.tjstudy.observer.study.ZhansanObserver;

public class ObserverMain {
	public static void main(String[] args) {
		// 1�����屻�۲���
		NewspaperObserable obserable = new NewspaperObserable();

		// 2���۲���ע�ᵽ���۲���
		obserable.addObserver(new ZhansanObserver());
		obserable.addObserver(new LisiObserver());
		obserable.addObserver(new XiaomingObserver());

		// 3������һ�ݱ�ֽ
		obserable.doSend();

		// һ����˵���������˽���
		TalkObservable talkObservable = new TalkObservable();
		ListenerObserver listenerObserver = new ListenerObserver();
		Listener1Observer listener1Observer = new Listener1Observer();
		Listener2Observer listener2Observer = new Listener2Observer();
		talkObservable.addObserver(listenerObserver);
		talkObservable.addObserver(listener1Observer);
		talkObservable.addObserver(listener2Observer);

		// ��Ҫ��ʼ˵���� ��������
		talkObservable.doTalk("��Ǹ  �Ҳ���֪��Ҫ˵ʲô");
	}
}