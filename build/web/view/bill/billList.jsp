<%-- 
    Document   : tableSell
    Created on : Feb 10, 2022, 9:44:31 PM
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
        <link rel="stylesheet" href="./assets/css/styleTableSell.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./assets/fonts/fontawesome-free-5.15.4-web/css/all.min.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
              crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>Table</title>
        <jsp:useBean id= "bill" class="dal.BillDBContext" scope="request"></jsp:useBean>
        </head>
        <link href="./assets/css/pager.css" rel="stylesheet" type="text/css"/>
        <script src="./assets/js/pagger.js" type="text/javascript"></script>
        <body>
            <div id="main">
            <jsp:include page="../common/header.jsp"></jsp:include>
                <div id="body">
                <jsp:include page="../common/left.jsp"></jsp:include>
                    <div class="right">

                        <div class="row">
                            <div class="col-md-12">
                                <div class="right-header">
                                    <h4>List of products sold</h4>
                                    <button type="button" class="btn btn-primary btn-add">Add Bill</button>
                                </div>
                                <form>
                                    <div class="form-group row">
                                        <div class="inputSearch col-xs-3">
                                            <label for="ex1">Search:</label>
                                            <input class="form-control" id="ex1" type="text">
                                        </div>

                                    </div>
                                </form>

                                <div class="table-responsive">


                                    <table id="mytable" class="table table-bordred table-striped">

                                        <thead>
                                        <th>STT</th>
                                        <th>Tên Khách Hàng</th>
                                        <th>Người Lập</th>
                                        <th>Ngày Lập</th>
                                        <th>Mã Hóa Đơn</th>
                                        <th>Edit</th>

                                        <th>Delete</th>
                                        </thead>
                                        <tbody>

                                        <c:forEach items="${bills}" var="b" varStatus="status">
                                            <tr>
                                                <td>${status.count}</td>
                                                <td>${b.customer.cName}</td>
                                                <td>${b.user.uName}</td>
                                                <td>${b.time}</td>
                                                <td><a href="bill-detail?bid=${b.bId}">${b.bId}</a></td>
                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Edit"><button
                                                            class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal"
                                                            data-target="#edit"><span
                                                                class="glyphicon glyphicon-pencil"></span></button></p>
                                                </td>
                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Delete"><button
                                                            class="btn btn-danger btn-xs" data-title="Delete"
                                                            data-toggle="modal" data-target="#delete"><span
                                                                class="glyphicon glyphicon-trash"></span></button></p>
                                                </td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>

                                </table>




                            </div>
                            <div id="paggerClick" class="paging"> </div>    
                        </div>
                    </div>
                </div>







            </div>
            <jsp:include page="../common/footer.jsp"></jsp:include>
            </div>
            <script>
    paggerClick('paggerClick',${pageindex},${totalpage}, 'bill-list?kRole=${kRole}&', 2)
    function deleteProduct(id)
    {
        var result = confirm("Are you sure?");
        if (result)
        {
            window.location.href = "product-delete?pId=" + id;
        }
    }
        </script>
    </body>

</html>
