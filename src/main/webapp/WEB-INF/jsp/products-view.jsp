<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/css/product-styles.css">
        <title>Product List</title>
    </head>

    <body>
        <h1>Available Products</h1>
        <table border="1">
            <tr>
                <th>ID</th><th>Name</th><th>Description</th><th>Price</th>
            </tr>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td>${product.id}</td><td>${product.name}</td><td>${product.description}</td><td>${product.price}</td>
                </tr>
            </c:forEach>
        </table>
    </body>

</html>