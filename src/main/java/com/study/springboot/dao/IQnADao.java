package com.study.springboot.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.QnADto;

@Mapper
public interface IQnADao {

	// 1:1 문의 목록
	  public ArrayList<QnADto> QnAlist();
	  
	// 1:1 문의 추가하기
		  public int addQnA(int hp_Index, String hp_ID, String qna_Title, String qna_Content, int answer_Check);
		// 1:1 문의 편집하기
		  public int updateQnA(int qna_Index, int hp_Index, String hp_ID, String qna_Title, String qna_Content, int answer_Check);
		// 1:1 문의 삭제하기
		  public int deleteQnA(int qna_Index);	
	
}
