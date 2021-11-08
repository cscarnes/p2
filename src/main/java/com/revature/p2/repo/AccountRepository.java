package com.revature.p2.repo;

import com.revature.p2.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    public List<Account> findByName(String name);

    public List<Account> findByUid(int uid);

    public Account findByAid(int aid);
}
