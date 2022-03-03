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
              crossorigin="anonymous
              <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
              <title>Table</title>

    </head>

    <body>
        <div id="main">
            <jsp:include page="../common/header.jsp"></jsp:include>
                <div id="body">
                <jsp:include page="../common/left.jsp"></jsp:include>
                    <div class="right">

                        <form class="form-horizontal" style="    margin-top: 160px;
                              margin-left: 70px;" action="billDetail-add" method="POST" >
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
                                    <input id="" name="bill_id"  class=" input-md" value="${bId}" type="hidden">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="stock_alert">TÊN SẢN PHẨM</label>  
                                <div class="col-md-2" >

                                    <select  class="form-select" size="4" aria-label="size 4 select example" name="products">
                                        <option disabled selected value> -- select an option -- </option>
                                        <c:forEach items="${products}" var="p">
                                            <option value="${p.getpId()}">${p.getpName()}</option>
                                        </c:forEach>
                                    </select>

                                </div>
                            </div>





                            
                            
                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="quantity">SỐ LƯỢNG</label>  
                                <div class="col-md-4">
                                    <input id="quantity" name="quantity" placeholder="SỐ LƯỢNG" class="form-control input-md" required="" type="text">

                                </div>
                            </div>
                            


                            <!-- Button -->
                            <div class="form-group">
                                <label  class="col-md-4 control-label" for="singlebutton"></label>
                                <div class="col-md-4">
                                    <button id="singlebutton" name="singlebutton" class="btn btn-primary">AddBillDetail</button>
                                    
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

