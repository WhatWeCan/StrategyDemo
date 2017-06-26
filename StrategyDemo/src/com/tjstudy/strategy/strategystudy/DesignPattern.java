package com.tjstudy.strategy.strategystudy;


public class DesignPattern {
	private IStudyStrategy iStudyStrategy;

	public DesignPattern(IStudyStrategy strategy) {
		iStudyStrategy = strategy;
	}

	public DesignPattern() {
	}

	public void study() {
		if (checkStrategy()) {
			iStudyStrategy.doStudy();
		} else {
			System.out.println("δʵ����pattern");
		}
	}

	/**
	 * �����ṩ�޸Ĳ��Եķ���
	 * 
	 * @param strategy
	 */
	public void setStrategyMethod(IStudyStrategy strategy) {
		iStudyStrategy = strategy;
	}

	private boolean checkStrategy() {
		if (iStudyStrategy == null) {
			return false;
		}
		return true;
	}
}
