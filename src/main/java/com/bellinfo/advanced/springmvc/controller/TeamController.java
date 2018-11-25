package com.bellinfo.advanced.springmvc.controller;


import com.bellinfo.advanced.springmvc.model.Student;
import com.bellinfo.advanced.springmvc.model.Team;
import com.bellinfo.advanced.springmvc.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

    Logger log = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getIndex(Model model){
        Team team = new Team();
        log.info("Team adding in / request", team);
        model.addAttribute("team", team);
        return "team-login";
    }

    @RequestMapping(value = "/index", method= RequestMethod.GET)
    public String getIndexPage(Model model){
        Team team = new Team();
        log.info("Team adding in / request", team);
        model.addAttribute("team", team);
        return "team-login";
    }


    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String addTeam(Model model){
        Team team = new Team();
        log.info("Team adding in /add get request", team);
        model.addAttribute("team", team);
        return "team-login";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String addTeam(@ModelAttribute Team team, Model model){
        log.info("Team adding in /add post request", team);
        teamService.addTeam(team);
        return "team-login";
    }

    @RequestMapping(value = "/list", method=RequestMethod.GET)
    public String getTeams(Model model){
        List<Team> list =teamService.getTeams();
        log.info("Team list in /list request", list);
        model.addAttribute("list", list);
        return "team-list";
    }

    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    public String editTeam(@PathVariable int id, Model model){
        Team team = teamService.getTeam(id);
        model.addAttribute("team", team);
        return "team-edit";
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editTeam(@ModelAttribute Team team, @PathVariable int id, Model model){
        teamService.updateTeam(team);
        List<Team> list =teamService.getTeams();
        model.addAttribute("list", list);
        return "team-list";
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deleteTeam(@PathVariable int id, Model model){
        teamService.deleteTeam(id);
        List<Team> list =teamService.getTeams();
        model.addAttribute("list", list);
        return "team-list";
    }









}
