package com.study.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAdminDao {
	// 관리자 로그인
	  public int adminLogin( String member_id, String member_pw);
	 

  	  
  
  	
  	  
	
}
