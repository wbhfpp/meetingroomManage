package service;

public interface LoginService {
	
	/**
	 * 判断登陆是否成功
	 * @param staffNum
	 * @param password
	 * @return 登陆成功返回true，失败返回false
	 */
	public boolean login(String staffNumber,String password);
}
