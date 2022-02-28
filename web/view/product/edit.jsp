<%-- 
    Document   : productList
    Created on : Feb 19, 2022, 6:34:07 PM
    Author     : xuant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <title>Table</title>

    </head>

    <body>
        <div id="main">
            <jsp:include page="../common/header.jsp"></jsp:include>
                <div id="body">
                <jsp:include page="../common/left.jsp"></jsp:include>
                    <div class="right">

                        <form class="form-horizontal" style="    margin-top: 160px;
                              margin-left: 70px;" action="product-edit" method="POST" enctype="multipart/form-data">
                            <fieldset>





                                <div class="form-group">
                                    <label class="col-md-4 control-label"></label>  
                                    <div class="col-md-2">
                                    <c:if test="${not empty message}">
                                        <div class="alert alert-${alert}"> 
                                            ${message}
                                        </div>
                                    </c:if>  
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-4 control-label" for=""></label>  
                                <div class="col-md-4">
                                    <input id="" name="product_id"  class=" input-md" value="${product.getpId()}" type="hidden">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="product_name">PRODUCT NAME</label>  
                                <div class="col-md-4">
                                    <input id="product_name" name="product_name"  class="form-control  input-md" value="${product.getpName()}" type="text">

                                </div>
                            </div>





                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="stock_alert">PRICE</label>  
                                <div class="col-md-4">
                                    <input id="stock_alert" name="product_price" value="${product.getpPrice()}" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Select Basic -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="">PRODUCT CATEGORY</label>
                                <div class="col-md-4">
                                    <label class="radio-inline">
                                        <input type="radio"  
                                               <c:if test="${product.getpType() == 'Xuất'}" >
                                                   checked="checked"
                                               </c:if>
                                               name="product_categorie" value="Xuất" >Xuất</label>

                                    <label class="radio-inline">
                                        <input
                                            <c:if test="${product.getpType() == 'Nhập'}" >
                                                checked="checked"
                                            </c:if>
                                            type="radio" name="product_categorie" value="Nhập">Nhập</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">IMAGE</label>
                                <div class="col-md-4">
                                    <img style="height: 100px;width: 100px"  class="img-responsive"  src="./assets/img/${product.getpImage()}" alt="">
                                </div>
                            </div>
                            <!-- File Button --> 
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton"></label>
                                <div class="col-md-4">
                                    <input id="filebutton" name="image" class="input-file" type="file" >
                                </div>
                            </div>

                            <!-- Button -->
                            <div class="form-group">
                                <label  class="col-md-4 control-label" for="singlebutton"></label>
                                <div class="col-md-4">
                                    <button id="singlebutton" name="singlebutton" class="btn btn-primary">EditProduct</button>
                                </div>
                            </div>

                        </fieldset>
                    </form>
                </div>



            </div>
            <jsp:include page="../common/footer.jsp"></jsp:include>
        </div>

    </body>

</html>

