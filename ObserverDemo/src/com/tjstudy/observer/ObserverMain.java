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
		// 1、定义被观察者
		NewspaperObserable obserable = new NewspaperObserable();

		// 2、观察者注册到被观察者
		obserable.addObserver(new ZhansanObserver());
		obserable.addObserver(new LisiObserver());
		obserable.addObserver(new XiaomingObserver());

		// 3、生产一份报纸
		obserable.doSend();

		// 一个人说话，其他人接收
		TalkObservable talkObservable = new TalkObservable();
		ListenerObserver listenerObserver = new ListenerObserver();
		Listener1Observer listener1Observer = new Listener1Observer();
		Listener2Observer listener2Observer = new Listener2Observer();
		talkObservable.addObserver(listenerObserver);
		talkObservable.addObserver(listener1Observer);
		talkObservable.addObserver(listener2Observer);

		// 我要开始说话了 你们听着
		talkObservable.doTalk("抱歉  我并不知道要说什么");
	}
}