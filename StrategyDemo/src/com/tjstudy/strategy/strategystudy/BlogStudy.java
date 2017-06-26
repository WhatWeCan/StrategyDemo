package com.tjstudy.strategy.strategystudy;


public class BlogStudy implements IStudyStrategy {

	@Override
	public void doStudy() {
		System.out.println("--博客学习--baidu google 查找系列博客");
	}
}
