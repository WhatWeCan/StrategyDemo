package com.tjstudy.strategy;

import com.tjstudy.strategy.strategystudy.BigGodStudy;
import com.tjstudy.strategy.strategystudy.BlogStudy;
import com.tjstudy.strategy.strategystudy.BookStudy;
import com.tjstudy.strategy.strategystudy.DesignPattern;

public class MainStudy {
	public static void main(String[] args) {
		System.out.println("学习策略模式");
		DesignPattern pattern = new DesignPattern();
		pattern.setStrategyMethod(new BookStudy());// 看书学习吧
		pattern.study();
		
		pattern.setStrategyMethod(new BlogStudy());// 切换模式 我要去看博客更近一步学习一下
		pattern.study();
		
		pattern.setStrategyMethod(new BigGodStudy());// 切换模式 请教大神去
		pattern.study();
	}
}
