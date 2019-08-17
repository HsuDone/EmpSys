package com.zxd.Service;

import java.util.List;

import com.zxd.Beans.Emp;
import com.zxd.Beans.PageBean;
import com.zxd.Dao.EmpDao;
import com.zxd.Dao.EmpDaoImp;
import com.zxd.Dao.PageDao;
import com.zxd.Dao.PageDapImp;

public class PageServiceImp implements PageService {
	PageDao pd = new PageDapImp();
	EmpDao ed = new EmpDaoImp();
	@Override
	public PageBean getPageBean(String pageSizeStr, String curPageStr) {
		int pageSize = (pageSizeStr == null || pageSizeStr.equals("") )? 2 : Integer.parseInt(pageSizeStr) ;
		int curPage = (curPageStr == null || curPageStr.equals("")) ? 1 : Integer.parseInt(curPageStr);
		if(curPage <= 0)
			curPage = 1;
		 List<Emp> pageList = pd.QueryPage(pageSize,curPage);
		 int empCnt = ed.countAllEmp();
		 PageBean pb = new PageBean();
		 pb.setList(pageList);
		 pb.setCurPage(curPage);
		 pb.setPageSize(pageSize);
		 pb.setTotalCnt(empCnt);
		 pb.setTotalPage((empCnt + pageSize - 1)/pageSize);
		return pb;
	}
	

}
