<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product List</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
            integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
            table,
            th,
            td {
                border: 1px solid;
            }
        </style>
    </head>

    <body>
        <div class="container-fluid">
            <h1>Product List</h1>
            <table clasName="table">
                <tr>
                    <th>Product ID</th>
                    <th>Category ID</th>
                    <th>Product Name</th>
                    <th>Price</th>
                    <th>Description</th>
                </tr>
                <c:forEach var="product" items="${products}">
                    <tr>
                        <td>${product.getProductID()}</td>
                        <td>${product.getCategoryID()}</td>
                        <td>${product.getProductName()}</td>
                        <td>${product.getPrice()}</td>
                        <td>${product.getDescription()}</td>
                    </tr>
                </c:forEach>
                <a href="../categories">Go back to Category Page</a>
            </table>
        </div>
    </body>

    </html>