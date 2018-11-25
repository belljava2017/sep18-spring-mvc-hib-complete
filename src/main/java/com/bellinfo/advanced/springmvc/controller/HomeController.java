package com.bellinfo.advanced.springmvc.controller;

import com.bellinfo.advanced.springmvc.model.Student;
import com.bellinfo.advanced.springmvc.model.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
@Controller
public class HomeController {
    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        Team team = new Team();
        model.addAttribute("team", team);
        return "team-login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        Team team = new Team();
        model.addAttribute("team", team);
        return "team-login";
    }


}
