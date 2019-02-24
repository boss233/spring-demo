package cn.ljlin233.spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * HomeController
 */
@Controller
//@RequestMapping(value="/")
public class HomeController {

    @RequestMapping(value={"", "/"},method=RequestMethod.GET)
    public String home() {
        return "home";
    }
    
}

