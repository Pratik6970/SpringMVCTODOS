<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>




<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" is
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Our To Do App</title>
</head>
<body>
	<div class="container mt-3">

		<h1 class="text-center">Welcome To Do Manager</h1>
		
		<c:if test="${not empty msg}">
	<div class="alert alert-success">
	<b><c:out value="${msg}"></c:out></b>
	
	</div>
	</c:if>

		<div class="row mt-5">

			<div class="col-md-2">
				<h3 class="text-center">Option</h3>
				<div class="list-group">

					<button type="button"
						class="list-group-item list-group-item-action">Menu</button>
					<a href='<c:url value='add'></c:url>'
						class='list-group-item list-group-item-action active'>ADD
						TODOS</a> <a href='<c:url value='home'></c:url>'
						class='list-group-item list-group-item-action active'>View
						TODOS</a>

				</div>
			</div>

			<div class="col-md-10">
				<h3 class="text-center">Content</h3>
				<c:if test="${page=='home'}">
					<h1 class="text-center">All TODOS</h1>
					
				<c:forEach items="${todos}" var="t">
    <!-- Content to be repeated for each item -->

				
					
					<div class="card">
					
					<div class="card-body">
					
					<h3><c:out value="${t.todoTitle}"></c:out></h3>
					
					
					<p><c:out value="${t.todoContent}"></c:out></p>
					
					<h3><c:out value="${t.todoprice}"></c:out></h3>
					</div>
					
					</div>
					
					
					</c:forEach>
					
				</c:if>

				<c:if test="${page=='add'}">
					<h1 class="text-center">Add TODOS</h1>

					<form:form action="saveTodos" method="post" modelAttribute="todos">

						<div class="form-group">

							<form:input path="todoTitle" cssClass="form-control"
								placeholder="Enter your todoTitle" />

						</div>

						<div class="form-group>">

							<form:input path="todoContent" cssClass="form-control"
								placeholder="Enter content here" cssStyle="height:200px" />
							<br>

						</div>

						<div class="form-group">
							<form:input path="todoprice" cssClass="form-control"
								placeholder="Enter price here" />
						</div>


						<div class="container text-center ">
							<button class="btn btn-outline-success">Add Todo</button>

						</div>

					</form:form>

				</c:if>



			</div>

		</div>

	</div>

</body>
</html>