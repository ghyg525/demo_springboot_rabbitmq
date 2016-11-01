package org.yangjie.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 * @author YangJie [2016年10月31日 下午5:38:20]
 */
@Component
public class MSenderUtil {
	
	private Logger logger = LoggerFactory.getLogger(MSenderUtil.class);
	
	@Autowired // 有springboot自动配置
	private RabbitTemplate rabbitTemplate;

	
	/**
	 * 发送消息
	 * @author YangJie [2016年11月1日 上午11:31:34]
	 * @param exchange
	 * @param message
	 */
	public void send(String queue, String message){
		logger.info("发送消息, queue={}, message={}", queue, message);
		rabbitTemplate.convertAndSend(queue, message);
	}

}
