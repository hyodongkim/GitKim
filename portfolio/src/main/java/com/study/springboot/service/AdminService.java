package com.study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.study.springboot.dao.IBookListDao;
import com.study.springboot.dao.IBookReviewDao;
import com.study.springboot.dao.IMemberDao;
import com.study.springboot.dao.INoticeDao;
import com.study.springboot.dao.IQnADao;
import com.study.springboot.dto.BookListDto;
import com.study.springboot.dto.BookReviewDto;
import com.study.springboot.dto.MemberDto;
import com.study.springboot.dto.NoticeDto;
import com.study.springboot.dto.QnADto;
import com.study.springboot.dto.QnA_AnswerDto;

@Component
public class AdminService {

	@Autowired
	private IMemberDao MemberDao;
	@Autowired
	private IBookListDao BookListDao;
	@Autowired
	private IBookReviewDao BookReviewDao;
	@Autowired 
	private INoticeDao NoticeDao;
	@Autowired 
	private IQnADao QnADao; 
	
	// 관리자 로그인
	  public int adminLogin( String hp_ID, String hp_Password ) {
		  int result = 0;
		  
		  if ( hp_ID == "admin" && hp_Password == "password" ) {
			  int count = MemberDao.adminLogin( hp_ID, hp_Password );
			  if( count > 0 ) {
				  result = 1;
			  }
		  } else {
			  result = 0;
		  }

		return result;
	  }
	
	  
	// 회원 목록 
	  public List<MemberDto> memberlist() {
		  List<MemberDto> memberlist = MemberDao.memberlist();
		  return memberlist;
	  }
	
	  
	  
	// 도서 목록 
		  public List<BookListDto> booklist() {
			  List<BookListDto> booklist = BookListDao.booklist();
			  return booklist;
		  }

	// 책 리뷰 목록
	  public List<BookReviewDto> bookreviewlist(){
		  List<BookReviewDto> bookreviewlist = BookReviewDao.reviewlist();
		  System.out.println("service bookreviewlist:" + bookreviewlist);
		  return bookreviewlist;
	  }
	  
	// 공지 목록
	  public List<NoticeDto> noticelist(){
		  List<NoticeDto> noticelist = NoticeDao.noticelist();
		  
		  return noticelist;
		  
	  }
	  
	// 공지사항 조회수 올리기
	   public int countNotice(int count) throws Exception{
		  
		  return NoticeDao.countNotice(count);
	   }
	  
	// 1:1 문의 목록
	   public List<QnADto> QnAlist(){
		  List<QnADto> qnalist = QnADao.QnAlist();
		  
		  return qnalist;
		  
	   }

	    // 1:1 문의 답안
	    public List<QnA_AnswerDto> QnA_Answer( int qna_Index ) {
		List<QnA_AnswerDto> qna_Answer = QnADao.QnA_Answer( qna_Index );
		
		return qna_Answer;
	}
	  
	  // 1:1 문의 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
