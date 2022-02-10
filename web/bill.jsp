<%-- 
    Document   : bill
    Created on : Feb 10, 2022, 9:41:30 PM
    Author     : xuant
--%>

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
                            <div class="billed"><span class="font-weight-bold text-uppercase">Billed:</span><span class="ml-1">Jasper Kendrick</span></div>
                            <div class="billed"><span class="font-weight-bold text-uppercase">Date:</span><span class="ml-1">May 13, 2020</span></div>
                            <div class="billed"><span class="font-weight-bold text-uppercase">Order ID:</span><span class="ml-1">#1345345</span></div>
                        </div>
                        <div class="col-md-6 text-right mt-3">
                            <h4 class="text-danger mb-0">Rae jones</h4><span>bbbootstrap.com</span>
                        </div>
                    </div>
                    <div class="mt-3">
                        <div class="table-responsive">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Product</th>
                                        <th>Unit</th>
                                        <th>Price</th>
                                        <th>Total</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Custom oil painting (24 X 36 in.)</td>
                                        <td>10</td>
                                        <td>34</td>
                                        <td>340</td>
                                    </tr>
                                    <tr>
                                        <td>Digital illustraion paint(8.5 X 11 in.)</td>
                                        <td>12</td>
                                        <td>50</td>
                                        <td>600</td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td>Total</td>
                                        <td>940</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="text-right mb-3"><button class="btn btn-danger btn-sm mr-5" type="button">Pay Now</button></div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>




