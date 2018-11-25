package com.bellinfo.advanced.springmvc.service;

import com.bellinfo.advanced.springmvc.model.Team;

import java.util.List;

public interface TeamService {

    void addTeam(Team team);

    void updateTeam(Team team);

    List<Team> getTeams();

    Team getTeam(int id);

    void deleteTeam(int id);


}
