package cn.ljlin233.spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.Errors;

import cn.ljlin233.spittr.*;
import cn.ljlin233.spittr.data.*;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    public SpitterController () {}

    @Autowired
    public SpitterController (SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    // 对此页面的Get请求，以显示页面
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    // 对此页面的Post请求，以提交表单
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        
        if (errors.hasErrors()) {
            return "registerForm";
        } else {
            spitterRepository.save(spitter);
            return "redirect:/spitter/" + spitter.getUsername();
        }
    }

    // 重定向后显示个人信息页
    @RequestMapping(value="/{username}", method=RequestMethod.GET)
    public String showSpitterProfile( @PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

}

