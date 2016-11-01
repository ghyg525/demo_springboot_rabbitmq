package org.yangjie.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接受者
 * @author YangJie [2016年10月31日 下午5:38:20]
 */
@Component
public class MReciverUtil {
	
	private Logger logger = LoggerFactory.getLogger(MSenderUtil.class);
	
	@RabbitListener(queues="test")
	public void recive(String message){
		logger.info("处理消息: {}", message);
	}

}
