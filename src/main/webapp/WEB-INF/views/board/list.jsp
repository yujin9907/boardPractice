<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h1>list page</h1>

<c:forEach items="${list}" var="list">
    <tr>
        <td><c:out value="${list.id}"/></td>
        <td><c:out value="${list.title}"/></td>
        <td><c:out value="${list.content}"/></td>
        <td><c:out value="${list.date}"/></td>
        <td><c:out value="${list.image}"/></td>
    </tr>
</c:forEach>
<%@ include file="../layout/footer.jsp"%>
