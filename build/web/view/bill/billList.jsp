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
        
        
        <title>Table</title>
        <jsp:useBean id= "bill" class="dal.BillDBContext" scope="request"></jsp:useBean>
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
                                    <h4>List of bills</h4>
                                    <button type="button" onclick="location.href = 'bill-add?kRole=${kRole}'" class="btn btn-primary btn-add">Add Bill</button>
                                </div>
                                <form action="bill-list" method="POST">
                                    <div class="form-group row">
                                        <div class="inputSearch col-xs-3">
                                            
                                            <input  class="form-control" id="myInput" type="text" name="keyWord" value="${keyWord}">
                                        <input  type="hidden" value="${kRole}" name="kRole"/>
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
                                    <th>STT</th>
                                        <c:if test="${kRole == 4}">
                                        <th>Tên Khách Hàng</th>
                                        <th>Người Lập</th>
                                        </c:if>
                                        <c:if test="${kRole == 3}">
                                        <th>Nhà Cung Cấp</th>
                                        <th>Người Nhập</th>
                                        </c:if>
                                    
                                    <th>Ngày Lập</th>
                                    <th>Mã Hóa Đơn</th>
                                    <th>Edit</th>

                                    <th>Delete</th>
                                    </thead>
                                    <tbody id="myTable">

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
                                                            data-target="#edit"  
                                                            onclick="location.href = 'bill-edit?bId=${b.bId}&kRole=${kRole}'"
                                                            ><span
                                                                class="glyphicon glyphicon-pencil"></span></button></p>
                                                </td>
                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Delete"><button
                                                            class="btn btn-danger btn-xs" data-title="Delete"
                                                            data-toggle="modal" data-target="#delete"
                                                            onclick="deleteBill(${b.bId})"
                                                            ><span
                                                                class="glyphicon glyphicon-trash"></span></button></p>
                                                </td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>

                                </table>
                                <div class="clearfix"></div>
                                <ul  class="pagination pull-right">
                                    <c:if test="${pageindex - 2 > 1}">
                                        <li><a href="bill-list?kRole=${kRole}&page=1&keyWord=${keyWord}">First</a></li>          
                                        </c:if>


                                    <c:if test="${pageindex - 2 >= 0}">
                                        <c:forEach begin="${pageindex - 2}" end="${pageindex - 1}" var="i">
                                            <c:if test="${i >= 1}"> 
                                                <li><a href="bill-list?kRole=${kRole}&page=${i}&keyWord=${keyWord}">${i}</a></li>
                                                </c:if>

                                        </c:forEach>
                                    </c:if>

                                    <li><span 
                                            style="background-color: rgb(48 113 169);color: white;"
                                            href="bill-list?kRole=${kRole}&page=${pageindex}&keyWord=${keyWord}">${pageindex}</span></li>


                                    <c:forEach begin="${pageindex +1}" end="${pageindex + 2}" var="i">
                                        <c:if test="${i <= totalpage}">
                                            <li><a href="bill-list?kRole=${kRole}&page=${i}&keyWord=${keyWord}">${i}</a></li>
                                            </c:if>
                                        </c:forEach>



                                    <c:if test="${pageindex + 2 < totalpage}">
                                        <li><a href="bill-list?kRole=${kRole}&page=${totalpage}&keyWord=${keyWord}">Last</a></li> 
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

            function deleteBill(id)
            {
                var result = confirm("Are you sure?");
                if (result)
                {
                    window.location.href = "bill-delete?bId=" + id;
                }
            }

        </script>
    </body>

</html>
