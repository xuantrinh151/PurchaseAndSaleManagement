<%-- 
    Document   : bill
    Created on : Feb 10, 2022, 9:41:30 PM
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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="./assets/fonts/fontawesome-free-5.15.4-web/css/all.min.css">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
              crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>Bill</title>

    </head>
    <body>
        <div class="container mt-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-8">
                    <div class="p-3 bg-white rounded">
                        <div class="row">
                            <div class="col-md-6">
                                <h1 class="text-uppercase">Invoice</h1>
                                <div class="billed"><span class="font-weight-bold text-uppercase">Billed:</span><span class="ml-1">${bill.getUser().getuName()}</span></div>
                                <div class="billed"><span class="font-weight-bold text-uppercase">Customer:</span><span class="ml-1">${bill.getCustomer().getcName()}</span></div>
                                <div class="billed"><span class="font-weight-bold text-uppercase">Date:</span><span class="ml-1">${bill.getTime()}</span></div>
                                <div class="billed"><span class="font-weight-bold text-uppercase">Order ID:</span><span class="ml-1">${bill.getbId()}</span></div>
                            </div>
                            <div class="col-md-6 text-right mt-3">
                                <button style="    margin-top: 84px;
                                        margin-right: 34px;" type="button" onclick="location.href = 'billDetail-add?bId=${bill.getbId()}'" class="btn btn-primary btn-add">Add Bill Detail</button>
                            </div>
                        </div>
                        <div class="mt-3">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Product</th>
                                            <th>Price</th>
                                            <th>Unit</th>
                                            <th>Total</th>
                                            <th>Edit</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <c:forEach items="${billDetail}" var="b">
                                            <tr>
                                                <td>${b.getProduct().getpName()}</td>
                                                <td>${b.getProduct().getpPrice()}</td>
                                                <td>${b.getQuantity()}</td>
                                                <td>${b.getProduct().getpPrice() * b.getQuantity()}</td>
                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Edit"><button
                                                            class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal"
                                                            data-target="#edit"
                                                            onclick="location.href ='billDetail-edit?pId=${b.getProduct().getpId()}&bId=${b.getBill().getbId()}'"
                                                            ><span
                                                                class="glyphicon glyphicon-pencil"></span></button></p>
                                                </td>
                                                <td>
                                                    <p data-placement="top" data-toggle="tooltip" title="Delete"><button
                                                            class="btn btn-danger btn-xs" data-title="Delete"
                                                            data-toggle="modal" data-target="#delete"
                                                            onclick="deleteBillDetail(${b.getBdId()})"
                                                            ><span
                                                                class="glyphicon glyphicon-trash"></span></button></p>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td>Total</td>
                                            <td>${total}</td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="text-right mb-3"><button class="btn btn-danger btn-sm mr-5" onclick="document.location = 'bill-list?kRole=${customer.getRole().getrId()}'" >Return</button></div>
                    </div>
                </div>
            </div>
        </div>
                     <script>
            function deleteBillDetail(id)
            {
                var result = confirm("Are you sure?");
                if(result)
                {
                    window.location.href = "billDetail-delete?bdId=" + id + "&bId=${bill.getbId()}";
                }
            }
        </script>
    </body>
</html>




