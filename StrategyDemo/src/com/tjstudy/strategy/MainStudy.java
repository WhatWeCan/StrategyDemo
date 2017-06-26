package com.tjstudy.strategy;

import com.tjstudy.strategy.strategystudy.BigGodStudy;
import com.tjstudy.strategy.strategystudy.BlogStudy;
import com.tjstudy.strategy.strategystudy.BookStudy;
import com.tjstudy.strategy.strategystudy.DesignPattern;

public class MainStudy {
	public static void main(String[] args) {
		System.out.println("ѧϰ����ģʽ");
		DesignPattern pattern = new DesignPattern();
		pattern.setStrategyMethod(new BookStudy());// ����ѧϰ��
		pattern.study();
		
		pattern.setStrategyMethod(new BlogStudy());// �л�ģʽ ��Ҫȥ�����͸���һ��ѧϰһ��
		pattern.study();
		
		pattern.setStrategyMethod(new BigGodStudy());// �л�ģʽ ��̴���ȥ
		pattern.study();
	}
}
