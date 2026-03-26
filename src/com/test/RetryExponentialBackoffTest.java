package com.test;

import java.util.concurrent.Callable;

public class RetryExponentialBackoffTest {
	
	public <T> T retry(Callable<T> task, int maxRetry) throws Exception {
		int attempt = 0;
		long delay = 100;
		
		while(true) {
			try {
				task.call();
			} catch (Exception e) {
				if(++attempt > maxRetry) throw e;
				Thread.sleep(delay);
				delay = delay * 2;
			}
		}
	}

}
