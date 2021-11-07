package com.revature.p2.service;

import com.revature.p2.model.Goal;
import com.revature.p2.model.User;

import java.util.List;

public interface GoalService {

    public List<Goal> findAll();

    public List<Goal> findByName(String name);

    public Goal findByGid(int gid);

    public Goal findByUid(int uid);

    public void save(Goal goal);

    public void update(int id, Goal goal);

    public void delete(int id);
}
