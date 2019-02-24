package cn.ljlin233.spittr.web;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ljlin233.spittr.config.RootConfig;
import cn.ljlin233.spittr.data.*;

/**
 * SpittleRepositoryTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class)
public class SpittleRepositoryTest {

    @Autowired
    SpittleController sc;

    @Test
    public void scShouldNotBeNull() {
        assertNotNull(sc);
    }
    
}