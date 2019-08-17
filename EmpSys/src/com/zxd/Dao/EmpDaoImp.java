package com.zxd.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.zxd.Beans.Emp;
import com.zxd.Utils.DataSourceUtils;

public class EmpDaoImp implements EmpDao{
	QueryRunner qr = new QueryRunner();
	@Override
	public void insertEmp(Emp e) {
		try {
			String sql = "INSERT INTO emp (empno,name,age,salary,hiredate) values(?,?,?,?,?)";
			qr.update(DataSourceUtils.getConnection(), sql,
					e.getEmpno(),e.getName(),e.getAge(),e.getSalary(),e.getHiredate());
			System.out.println("添加了一位员工");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteEmpByNo(String no) {
		String sql ;
		try {
			sql = "DELETE FROM emp WHERE empno = ?";
			qr.update(DataSourceUtils.getConnection(), sql, no);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

	@Override
	public List<Emp> findAllEmp() {
		List<Emp> emplist = new ArrayList<Emp>();
		try {
			String sql = "SELECT * FROM emp";
			emplist = qr.query(DataSourceUtils.getConnection(), sql, new BeanListHandler<>(Emp.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emplist;
	}

	@Override
	public void updateEmp(Emp emp) {
		String sql ;
		try {
			DataSourceUtils.startTransaction();
			sql = "UPDATE emp set name = ? ,age= ? ,salary= ? ,hiredate= ? where empno = ?";
			qr.update(DataSourceUtils.getConnection(), sql, emp.getName(), emp.getAge(), emp.getSalary(), emp.getHiredate(),emp.getEmpno());
			DataSourceUtils.commitAndRelease();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

	@Override
	public Emp getEmpByNo(String no) {
		String sql = null;
		Emp emp = null;
		try {
			sql = "SELECT * FROM emp WHERE empno = ?";
			emp = qr.query(DataSourceUtils.getConnection(), sql, 
					new BeanHandler<>(Emp.class),no);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public int countAllEmp() {
		String sql = "select count(1) from emp";
		long empCnt = 0L;
		try {
			 empCnt = (Long)qr.query(DataSourceUtils.getConnection(), sql,new ScalarHandler());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (int)empCnt;
	}
	
}
