package com.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeApp {

	public static void main(String[] args) {
		
		int task = 1000;
		AtomicInteger safeCount = new AtomicInteger(0);
		ConcurrentMap<String, Integer> safeMap = new ConcurrentHashMap<>();
		
		ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
		
		for(int i=0;i<1000;i++) {
			executorService.submit(() ->  {
				safeCount.incrementAndGet();
				safeMap.merge("total_hits", 1, Integer::sum);
			});
		}
		executorService.close();
		System.out.println("FInal count : " + safeCount.get());
		System.out.println("map value : " + safeMap.get("total_hits"));
	}
}
