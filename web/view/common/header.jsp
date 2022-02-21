<%-- 
    Document   : header
    Created on : Feb 17, 2022, 11:41:32 PM
    Author     : xuant
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="header">
    <div class="header-logo">
        <img class="img-responsive" src="./assets/img/logoheader.png" alt="">
    </div>
    <div class="header-info">
        <h1 class="shopName">Nhà Vườn Phương Viên</h1>
        <h2 class="address">Địa chỉ : Xuân Quan ,Văn Giang ,Hưng Yên</h2>
        <h2 class="phoneNumber">SDT: 0327051618</h2>
    </div>
    <div class="account" style="text-align: center">

        <img style="margin-bottom: 10px;" class="img-responsive" src="./assets/img/account.png" alt="">
        <c:if test="${ empty user }">
            <a style="color: white;text-decoration: none" href="login?action=login">Login</a>
        </c:if>
        <c:if test="${not empty user}">
            <a style="color: white;text-decoration: none" href="logout?action=logout">Log Out</a>
        </c:if>
        
    </div>
    
</div>
