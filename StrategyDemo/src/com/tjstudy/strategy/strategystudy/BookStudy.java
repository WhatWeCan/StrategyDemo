package com.tjstudy.strategy.strategystudy;


public class BookStudy implements IStudyStrategy {

	@Override
	public void doStudy() {
		System.out.println("--Book学习--听说Head First设计模式还不错");
	}
}
