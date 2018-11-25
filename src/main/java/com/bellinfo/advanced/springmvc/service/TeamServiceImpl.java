package com.bellinfo.advanced.springmvc.service;

import com.bellinfo.advanced.springmvc.model.Team;
import com.bellinfo.advanced.springmvc.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void addTeam(Team team) {
        //Add your business logic
        //if team is not in 12 of your teams then retrun back..saying not able to add
        teamRepository.addTeam(team);

        //Add businees logic

    }

    @Override
    public void updateTeam(Team team) {
        teamRepository.updateTeam(team);

    }

    @Override
    public List<Team> getTeams() {
        List<Team> list = teamRepository.getTeams();

        return list;
    }

    @Override
    public Team getTeam(int id) {
        Team team = teamRepository.getTeam(id);
        return team;
    }

    @Override
    public void deleteTeam(int id) {
       teamRepository.deleteTeam(id);
    }
}
