package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.BookListDto;

@Mapper
public interface IBookListDao {

	
	    // 도서 목록
		  public List<BookListDto> booklist(); 
		  
		  public BookListDto contentView(int book_Index);
		  
		  
		  
		// 도서 추가
		  public int addBook(String book_Title, String book_Writer, String book_Company, 
					String book_Image, String book_Content, String book_Introduce, 
					int book_Category );
		// 도서 편집  
		  public int updateBook( int book_Index, String book_Title, String book_Writer, String book_Company, 
				  					String book_Image, String book_Content, String book_Introduce, 
				  					int book_Category);
		// 도서 삭제
	  	  public int deleteBook( int book_Index );

	  	  
	  	  public int write(int book_Index, String book_Title, String book_Writer, String book_Company,
					String book_Image, String book_Content, String book_Introduce,
					int book_Category);
	  	  
}
	  	  
