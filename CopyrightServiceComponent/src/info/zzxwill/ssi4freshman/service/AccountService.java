/**
 * 账户管理
 */
package info.zzxwill.ssi4freshman.service;

import java.util.ArrayList;

import info.zzxwill.ssi4freshman.bean.Account;
import info.zzxwill.ssi4freshman.dao.AccountDao;


public class AccountService {
	AccountDao accountDao;
	/**
	 * 
	 *@Name:周正喜
	 *@Date:Nov 1, 2010 10:27:35 AM
	 *@TODO:显示账户
	 */
	public ArrayList<Account> showAccount(){
		return accountDao.showAccount();
	}
	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	public Account addAccount(String firstname){
		return accountDao.addAccount(firstname);
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public boolean deleteAccount(int Id)
	{
		return accountDao.deleteAccount(Id);
	}

}
