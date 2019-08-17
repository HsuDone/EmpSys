package com.zxd.Service;

import com.zxd.Beans.PageBean;

public interface PageService {

	PageBean getPageBean(String pageSizeStr,String curPageStr);

}
