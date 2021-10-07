package com.study.springboot.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.QnADto;
import com.study.springboot.dto.QnA_AnswerDto;

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
		  
	// 1:1 문의 답변 가져오기
  	  public List<QnA_AnswerDto> QnA_Answer( int qna_Index );
	
}
