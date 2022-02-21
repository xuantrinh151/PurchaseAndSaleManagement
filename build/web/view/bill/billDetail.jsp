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
                                            </tr>
                                        </thead>
                                        <tbody>

                                        <c:forEach items="${billDetail}" var="b">
                                            <tr>
                                                <td>${b.getProduct().getpName()}</td>
                                                <td>${b.getProduct().getpPrice()}</td>
                                                <td>${b.getQuantity()}</td>
                                                <td>${b.getProduct().getpPrice() * b.getQuantity()}</td>
                                            </tr>
                                        </c:forEach>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td>Total</td>
                                            <td>${total}</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                                        <div class="text-right mb-3"><button class="btn btn-danger btn-sm mr-5" onclick="document.location='bill-list?kRole=${customer.getRole().getrId()}'" >Return</button></div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>




