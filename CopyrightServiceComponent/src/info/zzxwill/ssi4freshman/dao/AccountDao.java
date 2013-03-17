/**
 * 账户管理
 */
package info.zzxwill.ssi4freshman.dao;

import java.util.ArrayList;

import info.zzxwill.ssi4freshman.bean.Account;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 *@Name:周正喜
 *@Date:Aug 23, 2012 8:42:58 PM
 *@Function:
 */
public class AccountDao extends SqlMapClientDaoSupport {
	private SqlMapClientTemplate sqlMapper = this.getSqlMapClientTemplate();

	/**
	 * 
	 * @Name:周正喜
	 * @Date:Nov 1, 2010 10:27:35 AM
	 * @TODO:显示账户
	 */
	public ArrayList<Account> showAccount() {
		return (ArrayList<Account>) sqlMapper.queryForList("selectAllAccounts");
	}

	public boolean deleteAccount(int Id) {
		if (sqlMapper.delete("deleteAccountSen", Id) == 1)
			return true;
		else
			return false;

	}

	
	/**
	 *@Name:周正喜
	 *@Date:Aug 23, 2012 8:43:09 PM
	 *@Function:添加账户
	 *@Parameter:
	 */
	@SuppressWarnings("unchecked")
	public Account addAccount(String firstname) {
		return (Account)sqlMapper.insert("addAccount",firstname);
	}

}
