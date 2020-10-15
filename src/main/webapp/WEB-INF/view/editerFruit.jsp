<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un Fruit</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateFruit" method="post">
   <div class="form-group">
      <label class="control-label">ID Fruit :</label>
       <input type="text" name="idFruit" value="${fruit.idFruit}" readonly class="form-control"/>
    </div>	
   <div class="form-group">
      <label class="control-label">Nom Fruit :</label>
       <input type="text" name="nomFruit" value="${fruit.nomFruit}" class="form-control"/>
    </div>	
     <div class="form-group">
      <label class="control-label">Prix Fruit :</label>
       <input type="text" name="prixFruit" value="${fruit.prixFruit}" class="form-control"/>
    </div>
    <div class="form-group">
      <label class="control-label">Prix Fruit :</label>
       <input type="text" name="poidsFruit" value="${fruit.poidsFruit}" class="form-control"/>
    </div>	   
    <div class="form-group">
      <label class="control-label"> Date création :</label>
       <fmt:formatDate pattern="yyyy-MM-dd" value="${fruit.dateCreation}" var="formatDate" />
       <input type="date" name="date" value="${formatDate}" class="form-control"/>
    </div>	
    <div>
 		  <button type="submit" class="btn btn-primary">Modifier</button>
 	</div>
</form>
</div>
<br/>
<br/>
<a href="ListeFruits">Liste Fruits</a>
</div>
</body>
</html>