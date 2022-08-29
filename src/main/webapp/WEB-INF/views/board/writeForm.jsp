<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
<form action="write" method="post" enctype="multipart/form-data">
    <input type="text" name="title">
    <input type="text" name="content">
    <input type="file" name="file">
    <button>작성하기</button>
</form>
</body>
</html>