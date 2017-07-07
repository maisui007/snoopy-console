package com.snoopy.test;

import com.snoopy.console.SnoopyApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by V on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SnoopyApplication.class)
public class BaseTest {

    public Logger logger = LoggerFactory.getLogger(getClass());
    private String profiles;
    @Rule
    public OutputCapture outputCapture = new OutputCapture();
    @Before
    public void before() {
        this.profiles = System.getProperty("spring.profiles.active");
    }

    @After
    public void after() {
        if (this.profiles != null) {
            System.setProperty("spring.profiles.active", this.profiles);
        }
        else {
            System.clearProperty("spring.profiles.active");
        }
    }
}
