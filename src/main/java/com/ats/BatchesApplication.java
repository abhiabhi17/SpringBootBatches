package com.ats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ats.batches.LowBalanceReminder;

@SpringBootApplication
public class BatchesApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext ctx=SpringApplication.run(BatchesApplication.class, args);
LowBalanceReminder bean=ctx.getBean(LowBalanceReminder.class);
bean.test();

	}

}
