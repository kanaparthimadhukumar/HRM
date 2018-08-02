package com.mad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.mad.bo.EmloyeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_QUERY="INSERT INTO EMP VALUES(?,?,?)";
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmloyeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		//create connection
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_QUERY);
		
		return 0;
	}

}
