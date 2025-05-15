### 常用工具类


- 官方文档 readme [README.md](README.md)

- 日期工具类 [DateUtil.java](hutool-core%2Fsrc%2Fmain%2Fjava%2Fcn%2Fhutool%2Fcore%2Fdate%2FDateUtil.java)


TimeInterval 程序执行计时器
[Main.java](hutool-my-test%2Fsrc%2Fmain%2Fjava%2Fcn%2Fhutool%2FMain.java)
```
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

```


