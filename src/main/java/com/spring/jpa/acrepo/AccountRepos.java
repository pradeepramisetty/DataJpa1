package com.spring.jpa.acrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.acpk.AccountPk;
import com.spring.jpa.entity.Account;

public interface AccountRepos extends JpaRepository<Account, AccountPk> {

}
