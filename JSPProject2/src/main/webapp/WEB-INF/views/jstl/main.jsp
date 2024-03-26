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
	
	
	<hr>
	
	<h1>2. 변수 제거 (c:remove)</h1>
	<pre>
		- 변수 제거 : 내장 객체에 세팅된 속성을 제거
		(jsp 방법 : removeAttribute("num1") )
		
		- c:remove 속성
		1) var : 삭제할 변수명
		2) scope : 내장 객체 범위
	</pre>
	
	<%
		pageContext.removeAttribute("num1");
	%>
	
	num1 제거 확인 : ${num1}
	
	<br>
	
	<c:remove var="num2"/>
	
	num2 제거 확인 : ${num2}
	
	<hr>
	
	
	<h1> 3. 변수 출력 (c:out 태그)</h1>
	
	<pre>
		\${key} EL 구문 비슷함
		
		- 단, escapeXml="true" (기본값) 설정 시
			html 태그가 해석 X
			
		- escapeXml="false" : html 태그 해석 O
	</pre>
	
	<c:set var="temp" value="<h1>배부르네요</h1>"/>
	
	html 태그 해석 X : <c:out value="${temp}"/>
	
	<br>
	
	html 태그 해석 O : <c:out value="${temp}" escapeXml = "false" />
	
	
	<hr><hr><hr>
	
	<!-- 상대경로 : 현재 위치(경로)가 중요함
		현재 경로 : http://localhost:8080/jstl/main
		이동 경로 : http://localhost:8080/jstl/condition
	 -->
	<a href="condition">JSTL을 이용한 조건문(if / choose, when, otherwise)</a>
	<!-- /jstl/condition 이라는 요청 주소를 처리할 Controller 가 필요함 : JSTLConditionController -->
	
	
	<br>
	
	<!-- 상대경로
	
		현재 경로 : http://localhost:8080/jstl/main
		목표 경로 : http://localhost:8080/jstl/loop 
	 -->
	
	<a href="loop">JSTL을 이용한 반복문</a>
	<%--/jstl/loop 라는 요청을 처리할 Controller가 필요함 : JSTLLoopController --%>
	
	
	
	<hr><hr><hr>
	
	<%-- 현재 경로 : localhost8080/jstl/main
		목표 경로 : localhost8080/jstl/student/selectAll
	 --%>
	<a href="student/selectAll">workbook에서 학생 전체 조회하기</a>
	<%-- student/selectAll 라는 요청을 처리할 Controller : SelectAllController --%>
	
	
	<%-- 현재 경로 : localhost8080/jstl/main
		목표 경로 : localhost8080/jstl/student/selectArch
	 --%>
	<a href="student/selectArch">workbook에서 건축공학과인 학생만 찾기</a>
	<%-- SelectArchController --%>
	
	
	
	<%-- 현재 경로 : localhost8080/jstl/main
		목표 경로 : localhost8080/jstl/student/selectOne
	 --%>
	<form action="student/selectOne" method="post">
		<input type="text" name="deptName">
		<button>찾기</button>
	</form>
	<%-- 작성한 학과의 학생만 조회 SelectOneController --%>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>