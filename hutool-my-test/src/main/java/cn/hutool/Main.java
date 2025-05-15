package cn.hutool;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

/**
 * description：TODO
 * time：2025/5/15 10:30
 * auther：zhaopengfei
 */
public class Main {
	public static void main(String[] args) {
		TimeInterval timer = DateUtil.timer();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
//		重新计时并返回从开始到当前的持续时间
		System.out.println(timer.intervalRestart());
		System.out.println("Hello world!");
	}
}
