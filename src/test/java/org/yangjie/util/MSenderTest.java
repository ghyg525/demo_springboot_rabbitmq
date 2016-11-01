package org.yangjie.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MSenderTest {

	@Autowired
	private MSenderUtil mSenderUtil;
	

	@Test
	public void testGet() {
		mSenderUtil.send("test", "I am a message");
	}

}
