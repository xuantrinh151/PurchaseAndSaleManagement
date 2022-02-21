<%-- 
    Document   : left
    Created on : Feb 17, 2022, 11:50:26 PM
    Author     : xuant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="left">
    <div class="management management-overview">
        <a class="changePage" href="home"> <i class="fas fa-street-view"></i></a>

        <p>Tổng quan</p>

    </div>
    <div class="management management-sell">
        <a class="changePage" href="bill-list?kRole=4"><i class="fab fa-sellsy"></i></a>

        <p>Quản lý bán hàng</p>
    </div>
    <div class="management management-import">
        <a class="changePage" href="bill-list?kRole=3"><i class="fab fa-sellsy"></i></a>
        <p>Quản lý nhập hàng</p>
    </div>
    <div class="management management-listProduct">
         <a class="changePage" href="product-list"><i class="fab fa-product-hunt"></i></a>
        
        <p>Danh sách mặt hàng</p>
    </div>
    <div class="management management-listCustomer">
        <a class="changePage" href="customer-list"><i class="fas fa-user-tie"></i></a>
        
        <p>Danh sách khách hàng</p>
    </div>
</div>
