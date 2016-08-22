<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="#">Idea Quest</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    		
    			<li><a href="<spring:url value="/"/>">Home</a></li>
    			
    			<li><a href="<spring:url value="/idea/find"/>">My Ideas</a></li>
    			
    			<li><a href="<spring:url value="#"/>">Log Out</a></li>
    			
    			<li><a href="<spring:url value="#"/>">Help</a></li>
        		
    		</ul>
    		
		</div>
</nav>