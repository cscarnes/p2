package com.revature.p2.controller;

import com.revature.p2.model.Goal;
import com.revature.p2.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoalController {
    @Autowired
    GoalService goalService;

    @GetMapping("/goal")
    public List<Goal> findAll() {
        return goalService.findAll();
    }

    @GetMapping("/goal/{name}")
    public List<Goal> findByName(@PathVariable String name) {
        return goalService.findByName(name);
    }

    @GetMapping("/goalG/{gid}")
    public Goal findByGid(@PathVariable int gid) {
        return goalService.findByGid(gid);
    }

    @GetMapping("/goalU/{uid}")
    public List<Goal> findByUid(@PathVariable int uid) {
        return goalService.findByUid(uid);
    }

    @PostMapping("/goal")
    public void save(@RequestBody Goal goal) {
        goalService.save(goal);
    }

    @PutMapping("/goal/{gid}")
    public void update(@PathVariable int id, @RequestBody Goal goal) {
        goalService.save(goal);
    }

    @DeleteMapping("/goal/{gid}")
    public void delete(@PathVariable int id) {
        goalService.delete(id);
    }
}
