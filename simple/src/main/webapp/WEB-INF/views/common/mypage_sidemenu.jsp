<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<div class="col-lg-2" 
		style="float: left; margin-right: 50px; width: 230px; font-size: 15px;padding-left: 0px; ">
		<div style="font-size:25px; font-weight:bold; margin-left:18px;">마이페이지</div>
		<div class="list-group list-group-flush">
			<a href="#"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">마이
				쇼핑<span style="float:right;">〉</span></a> 
			<a href="${contextPath}/mypage_02.do"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; " >회원정보
				수정<span style="float:right;">〉</span></a> <a href="${contextPath}/mypage_04.do"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">주문/배송조회<span style="float:right;">〉</span></a>
			<a href="${contextPath}/mypage_07.do"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">취소/반품내역<span style="float:right;">〉</span></a>
			<a href="${contextPath}/myCartList.do"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">장바구니<span style="float:right;">〉</span></a>
			<a href="${contextPath}/mypage_08.do"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">관심상품<span style="float:right;">〉</span></a>
			<a href="#"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">1:1문의<span style="float:right;">〉</span></a>
			<a href="#"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">A/S접수<span style="float:right;">〉</span></a>
			<a href="${contextPath}/mypage_14.do"
				class="list-group-item list-group-item-action text-center font-weight-bold" style="text-align:left !important; ">상품
				리뷰<span style="float:right;">〉</span></a>
		</div>
	</div>
</body>
</html>