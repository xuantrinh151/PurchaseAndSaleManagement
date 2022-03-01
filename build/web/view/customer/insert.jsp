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
                              margin-left: 70px;" action="customer-add" method="POST" enctype="multipart/form-data">
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

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="customer_name">CUSTOMER NAME</label>  
                                <div class="col-md-4">
                                    <input id="product_name" name="customer_name" placeholder="CUSTOMER NAME" class="form-control input-md" required="" type="text">

                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="customer_phone">CUSTOMER PHONE</label>  
                                <div class="col-md-4">
                                    <input id="product_name" name="customer_phone" placeholder="CUSTOMER PHONE" class="form-control input-md" required="" type="text">

                                </div>
                            </div>


                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="stock_alert">CUSTOMER ADDRESS</label>  
                                <div class="col-md-4">
                                    <input id="stock_alert" name="customer_address" placeholder="CUSTOMER ADDRESS" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Select Basic -->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="">CUSTOMER ROLE</label>
                                <div class="col-md-4">
                                    <label class="radio-inline"><input type="radio" name="customer_role" value="4" checked>BUYER</label>
                                    <label class="radio-inline"><input type="radio" name="customer_role" value="3">SELLER</label>
                                </div>
                            </div>

                            <!-- File Button --> 
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="filebutton">IMAGE</label>
                                <div class="col-md-4">
                                    <input id="filebutton" name="image" class="input-file" type="file" >
                                </div>
                            </div>

                            <!-- Button -->
                            <div class="form-group">
                                <label  class="col-md-4 control-label" for="singlebutton"></label>
                                <div class="col-md-4">
                                    <button id="singlebutton" name="singlebutton" class="btn btn-primary">AddCustomer</button>
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

