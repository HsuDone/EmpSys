package com.zxd.Dao;

import com.zxd.Beans.User;

public interface UserDao {

	public User loginByUname_Psw(String uname, String psw);
	
}
