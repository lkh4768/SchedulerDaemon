package xyz.swwarehouse.sample;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Cron {
	/* print current second per second */
	@Scheduled(fixedDelay = 1000)
	public void printDay() {
		System.out.println(new Date().getSeconds());
	}
}
