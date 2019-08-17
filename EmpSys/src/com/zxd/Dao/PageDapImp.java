package com.zxd.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zxd.Beans.Emp;
import com.zxd.Beans.PageBean;
import com.zxd.Utils.DataSourceUtils;

public class PageDapImp implements PageDao {
	QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
	@Override
	public List<Emp> QueryPage(int pageSize, int curPage) {
		String sql = "select * from emp limit ? , ?";
		int begin = (pageSize-1)*curPage;
		List<Emp> emplist = new ArrayList<Emp>();
		try {
		    emplist = qr.query(sql, new BeanListHandler<Emp>(Emp.class),begin,pageSize);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emplist;
	}

}
