<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- JSTL 라이브러리를 현재 JSP에서 사용하겠다라는 JSP 지시자 작성 --%>

<%-- c == core (if, for문 등) --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- fn == functions (길이, 자르기, 나누기) --%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%--
	<%@ %> : 지시자 태그
	
	taglib : 태그 라이브러리 추가
	
	prefix : 접두사, 태그명 앞에 작성되는 단어 <c:set> <c:remove> <c:if> <c:forEach>

	uri(Uniform Resource Identifier , 통합 자원 식별자)
	-> 자원을 식별하는 고유 문자열
	
	(참고) url (Uniform Resource Locator)
		-> 자원의 위치를 나타내는 문자열(경로)
	
 --%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<meta charset="UTF-8">
	<title>JSTL(Jsp Standard Tag Library, JSP 표준 태그 라이브러리)</title>
	
	<pre>
		JSP에서 자주 사용되거나 공통적으로 사용되는
		Java코드 (if, for, 변수 선언, 형변환)를
		스크립틀릿대신 html 태그 형식을 태그화하여
		표준으로 제공하는 라이브러리
		(if, for문 간단히 쓰고싶으면 이거 써라!)
	</pre>
	
	<h3>JSTL 라이브러리 사용 방법</h3>
	
	<ol>
		<li>
			/webapp/WEB-INF/lib 폴더에 jstl 라이브러리 파일(.jar) 추가
		</li>
		
		<li>
			JSTL 라이브러리를 사용하고자 하는 JSP 파일 상단에
			taglib JSP 지시자 태그를 추가
		</li>
	</ol>
	
	
	<hr>
	
	
	<h1>1. 변수 선언 (c:set 태그)</h1>
	
	<pre>
		- 변수 선언 위한 태그
		
		- c:set 에 작성 가능한 속성
		1) var : 변수명(속성 key)
		2) value : 대입할 값
		3) scope : page, request, session, application 중 하나 지정 (기본 page)
	</pre>
	
	<%
		// 스크립틀릿으로 page scope에 속성 세팅하는 법
		pageContext.setAttribute("num1", 10);
	%>
	
	<%-- JSTL로 page scope에 속성 세팅하는 법 --%>
	<c:set var="num2" value="20" scope="page"/>
	
	num1 : ${num1}
	<br>
	num2 : ${num2}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>