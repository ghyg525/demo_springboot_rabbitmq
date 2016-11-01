package org.yangjie;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.yangjie.util.MSenderUtil;

/**
 * 程序入口, 启动器
 * 此注解等同与以下三个注解:
 * @Configuration 此类为配置类
 * @ComponentScan 扫描当前目录下所有包
 * @EnableAutoConfiguration 开启根据依赖包进行自动配置
 */
@SpringBootApplication
@EnableScheduling // 启动定时任务, 用于测试
public class Application {
	
	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("server is running...");
	}
	
	
	@Autowired
	private MSenderUtil mSenderUtil;
	
	@Scheduled(initialDelay=3000, fixedDelay=3000)
	public void test(){
		mSenderUtil.send("test", UUID.randomUUID().toString());
	}
 
}
