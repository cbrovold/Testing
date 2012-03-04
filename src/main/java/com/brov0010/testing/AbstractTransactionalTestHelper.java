package com.brov0010.testing;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:com/**/*applicationContext.xml" })
@TestExecutionListeners({
	DependencyInjectionTestExecutionListener.class
})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public abstract class AbstractTransactionalTestHelper extends AbstractTransactionalJUnit4SpringContextTests {

}
