<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FORM</h1>
  <form:form method="POST" action="/RState/saveRecord.html" commandName="saveRecord">
      <table>
      <tr>
        	<td>
         		<form:label path="user.id">User Name:</form:label>
       		</td>
       		<td>
         		<form:select path="user.id">    
       			<option value="-1">Select user</option>
       			<c:forEach items="${users}" var="user">
       				 <option value="${user.id}">${user.name}</option>
      			 </c:forEach>
     			 </form:select>
     		</td>
       </tr>
        
       <tr>
         	 <td><form:label path="telephone">Telephone:</form:label>	</td>
          	<td> <form:input path="telephone" value="${user.telephone}"/> </td>
       </tr>
        
       <tr>
         	 <td><form:label path="date">Date:</form:label>	</td>
         	 <td><form:input path="date" value="${record.date}"/>  </td>
       </tr>
       <tr>
        	<td>
       			  <form:label path="realState.id">User Name:</form:label>
        	</td>
      		 <td>
         		<form:select path="realState.id">    
       			<option value="-1">Select object</option>
      			 <c:forEach items="${realStates}" var="realState">
       				 <option value="${realState.id}">${realState.realStateName}</option>
      			 </c:forEach>
      			</form:select>
     		</td>
       </tr>
        <tr>
        	  <td><form:label path="realStateName">Object Name:</form:label>	</td>
        	  <td> <form:input path="realStateName" value="${realState.realStateName}"/> </td>
        </tr>
       	<tr>
        	<td></td>
         	<td><input type="submit" value="Add"/></td>
        </tr>
   </table> 
  </form:form>
  <br/>
</body>
</html>