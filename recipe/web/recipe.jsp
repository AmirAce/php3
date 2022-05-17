<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="recipe.*" %> 
<c:import url="/views/header.jsp" />

    <%
    Ingredients FoodAttribute = (Ingredients) request.getAttribute("Ingredients");
    if (FoodAttribute == null) {
        FoodAttribute = new Ingredients();
    }
    %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recipe</title>
        
        <table>
            <h1>Ingredients</h1>
            <tr>
            <th>
            Name
            </th>
            <th>
            Measure
            </th>
            <th>
            Quantity
            </th>
            </tr>
            <tr>
        <td><%= FoodAttribute.getName()%></td>
        <td><%= FoodAttribute.getMeasure()%></td>
        <td><%= FoodAttribute.getQuantity()%></td>
        
            </tr>
            <tr>
                <c:forEach var="ingredientInList" items="${Recipe1.ingredient}">
                     
        <tr>
            <td>${ingredientInList.name}</td>
            <td>${ingredientInList.measure}</td>
            <td>${ingredientInList.quantity}</td>
        </tr>
    </c:forEach>
            
        </table>
        <c:import url="/views/footer.jsp" />
  

