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

                                        <c:forEach items="${bill.getAllBill(kRole)}" var="b" varStatus="status">
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

                                <div class="clearfix"></div>
                                <ul class="pagination pull-right">
                                    <li class="disabled"><a href="#"><span
                                                class="glyphicon glyphicon-chevron-left"></span></a></li>
                                    <li class="active"><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
                                </ul>

                            </div>

                        </div>
                    </div>
                </div>


                <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span
                                        class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                                <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4>
                            </div>
                            <div class="modal-body">
                                <div class="form-group">
                                    <input class="form-control " type="text" placeholder="Mohsin">
                                </div>
                                <div class="form-group">

                                    <input class="form-control " type="text" placeholder="Irshad">
                                </div>
                                <div class="form-group">
                                    <textarea rows="2" class="form-control"
                                              placeholder="CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan"></textarea>


                                </div>
                            </div>
                            <div class="modal-footer ">
                                <button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span
                                        class="glyphicon glyphicon-ok-sign"></span> Update</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>



                <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span
                                        class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                                <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
                            </div>
                            <div class="modal-body">

                                <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are
                                    you sure you want to delete this Record?</div>

                            </div>
                            <div class="modal-footer ">
                                <button type="button" class="btn btn-success"><span
                                        class="glyphicon glyphicon-ok-sign"></span> Yes</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal"><span
                                        class="glyphicon glyphicon-remove"></span> No</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
            </div>
            <jsp:include page="../common/footer.jsp"></jsp:include>
        </div>

    </body>

</html>
