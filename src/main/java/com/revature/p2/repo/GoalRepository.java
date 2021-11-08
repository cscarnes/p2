package com.revature.p2.repo;

import com.revature.p2.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Integer> {

    public List<Goal> findByName(String name);

    public Goal findByGid(int gid);

    public List<Goal> findByUid(int uid);
}
