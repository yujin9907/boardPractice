<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
    <h1>${board.title}</h1>
    <p>${board.date}</p>
    <p>${board.user.username}</p>
    <p>${board.content}</p>
</div>
<%@ include file="../layout/footer.jsp"%>