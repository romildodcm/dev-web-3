<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page import = "models.Product, java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Produtos</title>
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
    
    if (products != null) {
      
    for(Product p: products) {%>   
    <tr>
      <td><%= p.getId() %></td>
      <td><%= p.getName() %></td>
      <td><%= p.getPrice() %></td>
      <td><%= p.getDescription() %></td>
      <td><%= p.getImageUri() %></td>
    </tr>
    <% }
    } else {  %>
    <tr>
        <td> --- </td>
        <td> --- </td>
        <td> --- </td>
        <td> --- </td>
        <td> --- </td>
     </tr>
    <% }
    
    %>
    
  </table>

</body>
</html>