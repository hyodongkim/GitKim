<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>1:1 갱신</title>
</head>
<body>
	<form action="<c:url value="/updateQnA"/>" method="get">
		
		<table width="500">
		
		<tr>
			<td>공지사항 번호</td>
			<td><input type="text" rows="16" cols="95" name="qna_Index" value="${qna_Index}"></td>
		</tr>
		<tr>
			<td>번호</td>
			<td><input rows="16" cols="95" name="hp_Index" value="${hp_Index}"> </td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input rows="16" cols="95" name="hp_ID" value="${hp_ID}"> </td>
		</tr>
	    <tr>
			<td>제목</td>
			<td><input type="text" rows="16" cols="95" name="qna_Title" value="${qna_Title}"> </td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="16" cols="95" name="qna_Content" value="${qna_Content}"></textarea> </td>
		</tr>
		<tr>
			<td>답변확인</td>
			<td><input type="text" rows="16" cols="95" name="answer_Check" value="${answer_Check}"> </td>
		</tr>
		<tr>
			<td>날짜</td>
			<td><input type="text" rows="16" cols="95" name="qna_Date" value="${qna_Date}"> </td>
		</tr>
		
		
		<tr>
			<td colspan="2"> 

				<a href="/admin/views/admin_qna"><input type="submit" value="갱신"></a> 
			</td>
		</tr>
		
		</table>
	
	
	</form>
	
	
</body>
</html>