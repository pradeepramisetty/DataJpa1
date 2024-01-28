package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.jpa.acpk.AccountPk;
import com.spring.jpa.acrepo.AccountRepos;
import com.spring.jpa.entity.Account;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		AccountRepos acr = context.getBean(AccountRepos.class);
		AccountPk  pk = new AccountPk();
		pk.setAccId(101);
		pk.setAccNum(9482984l);
		pk.setAccType("savings");
		
		Account ac1 = new Account();
		ac1.setAccHldName("prasad");
		ac1.setBranch("Nellore");
		ac1.setAdrs("Mahimaluru");
		ac1.setAccpk(pk);
		 
		acr.save(ac1);
		
	}

}
