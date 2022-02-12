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
                <div id="header">
                    <div class="header-logo">
                        <img class="img-responsive" src="./assets/img/logoheader.png" alt="">
                    </div>
                    <div class="header-info">
                        <h1 class="shopName">Nhà Vườn Phương Viên</h1>
                        <h2 class="address">Địa chỉ : Xuân Quan ,Văn Giang ,Hưng Yên</h2>
                        <h2 class="phoneNumber">SDT: 0327051618</h2>
                    </div>
                    <div class="account">
                        <img class="img-responsive" src="./assets/img/account.png" alt="">
                    </div>
                </div>
                <div id="body">
                    <div class="left">
                        <div class="management management-overview">
                            <a class="changePage" href="index.jsp"> <i class="fas fa-street-view"></i></a>

                            <p>Tổng quan</p>

                        </div>
                        <div class="management management-sell">
                            <a class="changePage" href="tableSell.jsp"><i class="fab fa-sellsy"></i></a>

                            <p>Quản lý bán hàng</p>
                        </div>
                        <div class="management management-import"><i class="fas fa-file-import"></i>
                            <p>Quản lý nhập hàng</p>
                        </div>
                        <div class="management management-listProduct"><i class="fab fa-product-hunt"></i>
                            <p>Danh sách mặt hàng</p>
                        </div>
                        <div class="management management-listCustomer"><i class="fas fa-user-tie"></i>
                            <p>Danh sách khách hàng</p>
                        </div>
                    </div>
                    <div class="right">
                        <div class="overview">
                            <div class="hello-admin">
                                <p>
                                    Hello Nhà Vườn Phương Viên
                                </p>
                                <p>
                                    Chúc bạn một ngày tốt lành,bán được thật nhiều hàng nhé
                                </p>

                            </div>
                            <div class="overview-item totalSales">
                                <div class="totalSales-img overview-item-img">
                                    <img class="img-responsive"  src="./assets/img/totalNumber.png" alt="">
                                </div>
                                <div class="totalSales-detail overview-item-detail">
                                    <p class="totalSales-title" style="font-weight: 700;">Total Sales</p>
                                    <p class="totalSales-quantily">Number</p>
                                </div>

                            </div>
                            <div class="overview-item totalCost">
                                <div class="totalCost-img overview-item-img">
                                    <img class="img-responsive"  src="./assets/img/totalCost3.png" alt="">
                                </div>
                                <div class="totalCost-detail overview-item-detail">
                                    <p class="totalCost-title" style="font-weight: 700;">Total Cost</p>
                                    <p class="totalCost-quantily">Number</p>
                                </div>

                            </div>
                            <div class="overview-item productSold">
                                <div class="productSold-img overview-item-img">
                                    <img class="img-responsive" src="./assets/img/productSold.png" alt="">
                                </div>
                                <div class="productSold-detail overview-item-detail">
                                    <p class="productSold-title" style="font-weight: 700;">Product Sold</p>
                                    <p class="productSold-quantily">Number</p>
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
                                        <p class="topDetail-item-quantitySell">Số Lượng: ${i.quantitySell}</p>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="topThree-item topCustomer">
                            <p class="topThree-title">Top Customer</p>
                            <div class="topDetail">
                                <div class="topDetail-item">
                                    <div class="img-topDetail">
                                        <img class="img-responsive" src="./assets/img/account.png" alt="">
                                    </div>
                                    <p>Name</p>
                                    <p>Số lượng</p>

                                </div>
                                <div class="topDetail-item">
                                    <div class="img-topDetail">
                                        <img class="img-responsive" src="./assets/img/account.png" alt="">
                                    </div>
                                    <p>Name</p>
                                    <p>Số lượng</p>
                                </div>
                                <div class="topDetail-item">
                                    <div class="img-topDetail">
                                        <img class="img-responsive" src="./assets/img/account.png" alt="">
                                    </div>
                                    <p>Name</p>
                                    <p>Số lượng</p>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>

            </div>
            <div id="footer">
                <hr>
                <div class="text-center center-block">
                    <br />
                    <a href="https://www.facebook.com/bootsnipp"><i id="social-fb"
                                                                    class="fa fa-facebook-square fa-3x social"></i></a>
                    <a href="https://twitter.com/bootsnipp"><i id="social-tw"
                                                               class="fa fa-twitter-square fa-3x social"></i></a>
                    <a href="https://plus.google.com/+Bootsnipp-page"><i id="social-gp"
                                                                         class="fa fa-google-plus-square fa-3x social"></i></a>
                    <a href="mailto:bootsnipp@gmail.com"><i id="social-em"
                                                            class="fa fa-envelope-square fa-3x social"></i></a>
                </div>
                <hr>
            </div>
        </div>
    </body>

</html>