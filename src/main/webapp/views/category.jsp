<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Category List</title>
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
            <h1>Category List</h1>
            <table clasName="table">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="category" items="${categories}">
                    <tr>
                        <td>${category.getCategoryID()}</td>
                        <td>${category.getCategoryName()}</td>
                        <td>${category.getDescription()}</td>
                        <td>
                            <a href="products/${category.getCategoryID()}">Show Product</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>

    </html>