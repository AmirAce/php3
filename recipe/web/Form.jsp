
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/views/header.jsp" />


    <form action="recipies" method="get">
        <label>multiply by:</label>
<select id="recipe" name="selection" >
  <option value="1/4">1/4</option>
  <option value="1/2">1/2</option>
  <option value="1"  selected = "true">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
</select>
        <input type="hidden" name="action" value="Form"/>
         
        <input type="submit" value="Go"/>
       
    </form>

