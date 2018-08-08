package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;



public class ListEmpDAO {
    public static final String GET_ALL_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
   private JdbcTemplate jt;
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
   
}
