package com.zxd.Dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zxd.Beans.User;
import com.zxd.Utils.DataSourceUtils;

public class UserDaoImp implements UserDao{
	QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
	@Override
	public User loginByUname_Psw(String uname,String psw) {
		String sql = "SELECT password From user where username = ? and password = ?";
		User res = null;
		try {
			 res = qr.query(sql,new BeanHandler<>(User.class),uname,psw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
}
