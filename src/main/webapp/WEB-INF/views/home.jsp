<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IdeaQuest</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>		
	<spring:url value="#" var="formUrl"/>	

	<div class="container">
	
	<div class="span9 centred">
	<h2 >Enter your Idea here !</h2>

	
   <form:form action="${formUrl}" method="POST" modelAttribute="idea">
   
   <div class="form-group">
					<label for="notes"></label> 
					<form:textarea id="notes" path="notes" class="form-control" style="max-width: 100%" rows="5"/>
				</div>
				
				<button type="submit" class="btn btn-default">Submit</button>
				
	</form:form>
</div>
	</div>
</body>
</html>