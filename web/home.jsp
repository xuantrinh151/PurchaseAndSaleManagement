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
                                    Xin Chào ${sessionScope.user.getuName()}
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

                            <div class="topThree-header">
                                <p class="topThree-title">Top Product</p>
                                <form action="home" method="GET">
                                    <select onchange="this.form.submit()" name="timeProduct" style="width: 152px;margin-right: 24px" class="topThree-select form-control ">
                                        <option value="year">Year</option>
                                        <option 
                                            <c:if test="${timeProduct == 1}">
                                                selected="selected"
                                            </c:if>
                                            value="1">January</option>
                                        <option 
                                            <c:if test="${timeProduct == 2}">
                                                selected="selected"
                                            </c:if>
                                            value="2">February</option>
                                        <option 
                                            <c:if test="${timeProduct == 3}">
                                                selected="selected"
                                            </c:if>
                                            value="3">March</option>
                                        <option  
                                            <c:if test="${timeProduct == 4}">
                                                selected="selected"
                                            </c:if>
                                            value="4">April</option>
                                        <option  
                                            <c:if test="${timeProduct == 5}">
                                                selected="selected"
                                            </c:if>
                                            value="5">May</option>
                                        <option  
                                            <c:if test="${timeProduct == 6}">
                                                selected="selected"
                                            </c:if>
                                            value="6">June</option>
                                        <option  
                                            <c:if test="${timeProduct == 7}">
                                                selected="selected"
                                            </c:if>
                                            value="7">July</option>
                                        <option  
                                            <c:if test="${timeProduct == 8}">
                                                selected="selected"
                                            </c:if>
                                            value="8">August</option>
                                        <option  
                                            <c:if test="${timeProduct == 9}">
                                                selected="selected"
                                            </c:if>
                                            value="9">September</option>
                                        <option  
                                            <c:if test="${timeProduct == 10}">
                                                selected="selected"
                                            </c:if>
                                            value="10">October</option>
                                        <option  
                                            <c:if test="${timeProduct == 11}">
                                                selected="selected"
                                            </c:if>
                                            value="11">November</option>
                                        <option  
                                            <c:if test="${timeProduct == 12}">
                                                selected="selected"
                                            </c:if>
                                            value="12">December</option>
                                    </select>
                                </form>

                            </div>
                            <div class="topDetail">
                                <c:forEach items="${products}" var="i">
                                    <div class="topDetail-item">
                                        <div class="img-topDetail" 
                                             style="background-image: url(./assets/img/${i.pImage});">
                                        </div>
                                        <p class="topDetail-item-name" >${i.pName}</p>
                                        <p class="topDetail-item-quantitySell">Số Lượng: ${i.quantitySell} </p>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="topThree-item topCustomer">
                            <div class="topThree-header">
                                <p class="topThree-title">Top Customer</p>
                                <form action="home" method="GET">
                                    <select onchange="this.form.submit()" name="timeCustomer" style="width: 152px;margin-right: 24px" class="topThree-select form-control ">
                                        <option value="year">Year</option>
                                        <option 
                                            <c:if test="${timeCustomer == 1}">
                                                selected="selected"
                                            </c:if>
                                            value="1">January</option>
                                        <option 
                                            <c:if test="${timeCustomer == 2}">
                                                selected="selected"
                                            </c:if>
                                            value="2">February</option>
                                        <option 
                                            <c:if test="${timeCustomer == 3}">
                                                selected="selected"
                                            </c:if>
                                            value="3">March</option>
                                        <option  
                                            <c:if test="${timeCustomer == 4}">
                                                selected="selected"
                                            </c:if>
                                            value="4">April</option>
                                        <option  
                                            <c:if test="${timeCustomer == 5}">
                                                selected="selected"
                                            </c:if>
                                            value="5">May</option>
                                        <option  
                                            <c:if test="${timeCustomer == 6}">
                                                selected="selected"
                                            </c:if>
                                            value="6">June</option>
                                        <option  
                                            <c:if test="${timeCustomer == 7}">
                                                selected="selected"
                                            </c:if>
                                            value="7">July</option>
                                        <option  
                                            <c:if test="${timeCustomer == 8}">
                                                selected="selected"
                                            </c:if>
                                            value="8">August</option>
                                        <option  
                                            <c:if test="${timeCustomer == 9}">
                                                selected="selected"
                                            </c:if>
                                            value="9">September</option>
                                        <option  
                                            <c:if test="${timeCustomer == 10}">
                                                selected="selected"
                                            </c:if>
                                            value="10">October</option>
                                        <option  
                                            <c:if test="${timeCustomer == 11}">
                                                selected="selected"
                                            </c:if>
                                            value="11">November</option>
                                        <option  
                                            <c:if test="${timeCustomer == 12}">
                                                selected="selected"
                                            </c:if>
                                            value="12">December</option>
                                    </select>
                                </form>
                            </div>
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