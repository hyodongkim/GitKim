package com.study.springboot.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.QnADto;

@Mapper
public interface IQnADao {

	// 1:1 문의 목록
	  public ArrayList<QnADto> QnAlist();
}
