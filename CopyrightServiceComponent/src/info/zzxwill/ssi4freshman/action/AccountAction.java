/**
 * 账户管理
 */
package info.zzxwill.ssi4freshman.action;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;
import info.zzxwill.ssi4freshman.bean.Account;
import info.zzxwill.ssi4freshman.service.AccountService;

public class AccountAction extends ActionSupport implements ServletRequestAware {
	/**
	 *@Name:周正喜
	 *@Date:Jun 1, 2012 9:59:18 AM
	 *@Function:
	 */
	private static final long serialVersionUID = -844790386890003811L;
	/**
	 *@Name:周正喜
	 *@Date:Jun 1, 2012 9:59:01 AM
	 *@Function:
	 */

	AccountService accountSerivce;
	Account account;
	ArrayList<Account> arrayList;
	
	protected HttpServletRequest request=null;

	/**
	 * @Name:周正喜
	 * @Date:Nov 1, 2010 10:27:35 AM
	 * @TODO:显示账户
	 */
	public String showAccount() {
		arrayList = accountSerivce.showAccount();
		if (arrayList != null) {
			System.out.println(arrayList.get(0).getFirstName());
			return "success";
		} else {
			return "error";
		}
	}

	public String deleteAccount() {
		int id = Integer.parseInt(request.getParameter("id").toString());
		if (accountSerivce.deleteAccount(id)) {
			return "success";
		} else {
			return "error";
		}
	}
	
	
	/**
	 *@Name:周正喜
	 *@Date:Aug 24, 2012 8:43:06 AM
	 *@Function:添加账号
	 *@Parameter:
	 */
	public String addAccount(){
		String firstname = account.getFirstName();
		accountSerivce.addAccount(firstname);
			return "success";
		
	}

	public AccountService getAccountSerivce() {
		return accountSerivce;
	}

	public void setAccountSerivce(AccountService accountSerivce) {
		this.accountSerivce = accountSerivce;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ArrayList<Account> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Account> arrayList) {
		this.arrayList = arrayList;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		
	}

}
