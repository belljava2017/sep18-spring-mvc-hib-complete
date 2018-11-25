package com.bellinfo.advanced.springmvc.repository;

import com.bellinfo.advanced.springmvc.model.Team;

import java.util.ArrayList;
import java.util.List;

public interface TeamRepository {

    void addTeam(Team team);

    void updateTeam(Team team);

    List<Team> getTeams();

    Team getTeam(int id);

    void deleteTeam(int id);
}
