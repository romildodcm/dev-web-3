<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page import = "models.Product, java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <table>
    <tr>
      <td>id</td>
      <td>name</td>
      <td>price</td>
      <td>description</td>
      <td>imageUri</td>
    </tr>
    <%
    List<Product> products = (List<Product>) request.getAttribute("products");
    
    for(Product p: products) {%>   
    <tr>
      <td><%= p.getId() %></td>
      <td><%= p.getName() %></td>
      <td><%= p.getPrice() %></td>
      <td><%= p.getDescription() %></td>
      <td><%= p.getImageUri() %></td>
    </tr>
    <% } %>
  </table>

</body>
</html>