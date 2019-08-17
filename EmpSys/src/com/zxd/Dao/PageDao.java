package com.zxd.Dao;

import java.util.List;

import com.zxd.Beans.Emp;
import com.zxd.Beans.PageBean;

public interface PageDao {

	
	List<Emp> QueryPage(int pageSize, int curPage);
	
}
