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
        <link href="./assets/css/pager.css" rel="stylesheet" type="text/css"/>
        <script src="./assets/js/pagger.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    </head>

    <body>
        <div id="main">
            <jsp:include page="../common/header.jsp"></jsp:include>
                <div id="body">
                <jsp:include page="../common/left.jsp"></jsp:include>
                    <div class="right">

                        <div class="row">
                            <div class="col-md-12">
                                <div class="right-header">
                                    <h4>List of products</h4>

                                    <button type="button" onclick="location.href = 'product-add'" class="btn btn-primary btn-add ">Add Product</button>


                                </div>
                                <form>
                                    <div class="form-group row">
                                        <div class="inputSearch col-xs-3">
                                            <label for="ex1">Search:</label>

                                            <input  class="form-control" id="myInput" type="text" name="keyWord" value="${keyWord}">
                                        </div>
                                        <input style="margin-top: 1px;
                                               padding: 4px;
                                               color: white;
                                               background-color: rgb(48 113 169);
                                               border-color: rgb(40 94 142);
                                               " type="submit" value="Search"/>
                                    </div>
                                </form>

                                <div class="table-responsive">


                                    <table id="mytable" class="table table-bordred table-striped">

                                        <thead>
                                        <th>Mã Sản Phẩm</th>
                                        <th>Tên Sản Phẩm</th>
                                        <th>Giá</th>
                                        <th>Loại</th>

                                        <th>Edit</th>

                                        <th>Delete</th>
                                        </thead>
                                        <tbody id="myTable">

                                        <c:forEach items="${products}" var="p">
                                            <tr>
                                                <td>${p.pId}</td>
                                                <td>${p.pName}</td>
                                                <td>${p.pPrice}</td>
                                                <td>${p.pType}</td>

                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Edit"><button
                                                            class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal"
                                                            data-target="#edit" onclick="location.href = 'product-edit?pId=${p.pId}'"><span
                                                                class="glyphicon glyphicon-pencil"></span></button></p>
                                                </td>
                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Delete"><button
                                                            class="btn btn-danger btn-xs" data-title="Delete"
                                                            data-toggle="modal" data-target="#delete" onclick="deleteProduct(${p.pId})"><span
                                                                class="glyphicon glyphicon-trash"></span></button></p>
                                                </td>
                                            </tr>
                                        </c:forEach>



                                    </tbody>

                                </table>

                                <div class="clearfix"></div>
                                <ul  class="pagination pull-right">
                                    <c:if test="${pageindex - 2 > 1}">
                                        <li><a href="product-list?page=1&keyWord=${keyWord}">First</a></li>          
                                        </c:if>


                                    <c:if test="${pageindex - 2 >= 0}">
                                        <c:forEach begin="${pageindex - 2}" end="${pageindex - 1}" var="i">
                                            <c:if test="${i >= 1}"> 
                                                <li><a href="product-list?page=${i}&keyWord=${keyWord}">${i}</a></li>
                                                </c:if>

                                        </c:forEach>
                                    </c:if>

                                    <li><span 
                                            style="background-color: rgb(48 113 169);color: white;"
                                            href="product-list?page=${pageindex}&keyWord=${keyWord}">${pageindex}</span></li>


                                    <c:forEach begin="${pageindex +1}" end="${pageindex + 2}" var="i">
                                        <c:if test="${i <= totalpage}">
                                            <li><a href="product-list?page=${i}&keyWord=${keyWord}">${i}</a></li>
                                            </c:if>
                                        </c:forEach>



                                    <c:if test="${pageindex + 2 < totalpage}">
                                        <li><a href="product-list?page=${totalpage}&keyWord=${keyWord}">Last</a></li> 
                                        </c:if>

                                </ul>

                            </div>

                        </div>
                    </div>
                </div>







            </div>
            <jsp:include page="../common/footer.jsp"></jsp:include>
        </div>
        <script>

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

