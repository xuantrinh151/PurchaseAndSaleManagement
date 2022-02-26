<%-- 
    Document   : index
    Created on : Feb 10, 2022, 9:38:43 PM
    Author     : xuant
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./assets/css/style.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./assets/fonts/fontawesome-free-5.15.4-web/css/all.min.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
              crossorigin="anonymous">
        <title>Management</title>
        <jsp:useBean id= "a" class="dal.ProductDBContext" scope="request"></jsp:useBean>

        </head>

        <body>
            <div id="main">
            <jsp:include page="/view/common/header.jsp"></jsp:include>
                <div id="body">
                <jsp:include page="/view/common/left.jsp"></jsp:include>
                    <div class="right">
                        <div class="overview">
                            <div class="hello-admin">
                                <p>
                                    Xin Chào Nhà Vườn Phương Viên
                                </p>
                                <p >
                                    Chúc bạn một ngày tốt lành,bán được thật nhiều hàng nhé
                                </p>

                            </div>
                            <div class="overview-item totalSales">
                                <div class="totalSales-img overview-item-img">
                                    <img class="img-responsive"  src="./assets/img/totalNumber.png" alt="">
                                </div>
                                <div class="totalSales-detail overview-item-detail">
                                    <p class="totalSales-title" style="font-weight: 700; font-size: 18px; ">Total Sales</p>
                                    <p class="totalSales-quantily"  style="font-size: 15px; font-weight: 600">${totalSell}VND</p>
                            </div>

                        </div>
                        <div class="overview-item totalCost">
                            <div class="totalCost-img overview-item-img">
                                <img class="img-responsive"  src="./assets/img/totalCost3.png" alt="">
                            </div>
                            <div class="totalCost-detail overview-item-detail">
                                <p class="totalCost-title" style="font-weight: 700;font-size: 18px">Total Cost</p>
                                <p class="totalCost-quantily " style="font-size: 15px; font-weight: 600">${totalCost} VND</p>
                            </div>

                        </div>
                        <div class="overview-item productSold">
                            <div class="productSold-img overview-item-img">
                                <img class="img-responsive" src="./assets/img/productSold.png" alt="">
                            </div>
                            <div class="productSold-detail overview-item-detail">
                                <p class="productSold-title" style="font-weight: 700;font-size: 18px">Product Sold</p>
                                <p class="productSold-quantily"  style="font-size: 15px; font-weight: 600">${productSold} Cây</p>
                            </div>


                        </div>
                    </div>
                    <div class="topThree">
                        <div class="topThree-item topProduct">
                            <p class="topThree-title">Top Product</p>
                            <div class="topDetail">
                                <c:forEach items="${a.topThreeProduct}" var="i">
                                    <div class="topDetail-item">
                                        <div class="img-topDetail" 
                                             style="background-image: url(${i.pImage});">
                                        </div>
                                        <p class="topDetail-item-name" >${i.pName}</p>
                                        <p class="topDetail-item-quantitySell">Số Lượng: ${i.quantitySell} </p>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="topThree-item topCustomer">
                            <p class="topThree-title">Top Customer</p>
                            <div class="topDetail">
                                <c:forEach items="${customers}" var="i" >
                                    <div class="topDetail-item">
                                        <div class="img-topDetail"
                                             style="background-image: url(./assets/img/account.png);">
                                        </div>
                                        <p style="font-size: 16px;
                                           font-weight: 600;
                                           margin-bottom: 5px;">${i.cName}</p>
                                        <p style="font-size: 14px;
                                           font-weight: 500;">${i.amountBought} VND</p>
                                    </div>
                                </c:forEach>


                            </div>
                        </div>
                    </div>

                </div>

            </div>
            <jsp:include page="/view/common/footer.jsp"></jsp:include>
        </div>
    </body>

</html>