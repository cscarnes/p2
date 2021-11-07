package com.revature.p2.service;

import com.revature.p2.model.Goal;
import com.revature.p2.repo.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalServiceImpl implements GoalService{

    @Autowired
    GoalRepository goalRepository;

    @Override
    public List<Goal> findAll() {
        return goalRepository.findAll();
    }

    @Override
    public List<Goal> findByName(String name) {
        return goalRepository.findByName(name);
    }

    @Override
    public Goal findByGid(int gid) {
        return goalRepository.findByGid(gid);
    }

    @Override
    public Goal findByUid(int uid) {
        return goalRepository.findByUid(uid);
    }

    @Override
    public void save(Goal goal) {
        goalRepository.save(goal);
    }

    @Override
    public void update(int id, Goal goal) {
        goalRepository.save(goal);
    }

    @Override
    public void delete(int id) {
        goalRepository.deleteById(id);
    }
}
