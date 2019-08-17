package com.zxd.Dao;

import java.util.List;

import com.zxd.Beans.Emp;

public interface EmpDao {
	public void insertEmp(Emp e) ;
	
	public void deleteEmpByNo(String no) ;
	
	public List<Emp> findAllEmp();		 
	
	public void updateEmp(Emp e) ;
		
	public Emp getEmpByNo(String no); 
		
	public int countAllEmp() ;
		
}
