package cn.ljlin233.spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import cn.ljlin233.spittr.web.HomeController;


/**
 * HomeControllerTest
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockmvc = standaloneSetup(controller).build();
        mockmvc.perform(get("/")).andExpect(view().name("home"));
    }

}

