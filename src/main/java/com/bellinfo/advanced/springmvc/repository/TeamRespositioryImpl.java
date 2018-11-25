package com.bellinfo.advanced.springmvc.repository;

import com.bellinfo.advanced.springmvc.model.Team;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamRespositioryImpl implements TeamRepository{

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession(){
       return sessionFactory.getCurrentSession();
    }

    @Override
    public void addTeam(Team team) {

        getSession().save(team);

    }

    @Override
    public void updateTeam(Team team) {
        Team t1 = getSession().get(Team.class, team.getId());
        t1.setName(team.getName());
        t1.setRanking(team.getRanking());
        getSession().saveOrUpdate(t1);
    }

    @Override
    public List<Team> getTeams() {

      /*  String hql_select = "from Team";
        Query q = getSession().createQuery(hql_select);
        List<Team> tList = q.list();
*/
        Criteria c = getSession().createCriteria(Team.class);
        List<Team> tList = c.list();

        return tList;
    }

    @Override
    public Team getTeam(int id) {
       Team t = getSession().get(Team.class, id);

        return t;
    }

    @Override
    public void deleteTeam(int id) {
       Team t = getTeam(id);
       getSession().delete(t);

    }
}
