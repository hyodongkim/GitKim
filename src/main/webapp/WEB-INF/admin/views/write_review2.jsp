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
<title>책리뷰 삭제</title>
</head>
<body>
	<form action="<c:url value="/deleteBookReview"/>" method="get">
		
		<table width="500">
		
		<tr>
			<td>리뷰 번호</td>
			<td><input type="text" rows="16" cols="95" name="review_Index" value="${review_Index}"></td>
		</tr>

		<tr>
			<td colspan="2"> 

				<a href="/admin/views/admin_review"><input type="submit" value="삭제"></a> 
			</td>
		</tr>
		
		</table>
	
	
	</form>
	
	
</body>
</html>