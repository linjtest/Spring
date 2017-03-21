package com.lin.springServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.lin.spring.DAO.AccountDAO;
import com.lin.spring.Service.AccountService;

public class AccountServiceImpl implements AccountService {
	//SETע��ת��DAO
	private AccountDAO accountDao;
	public void setAccountDao(AccountDAO accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * 
	 * @param in	ת���˺�
	 * @param out	ת���˺�
	 * @param account	ת��Ǯ��
	 */
	public void transfer(String in,String out, Double account){
		accountDao.outMoney(out, account);
		accountDao.inMoney(in, account);
	}
}