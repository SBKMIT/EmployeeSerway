<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>SB Admin - Start Bootstrap Template</title>
<!-- Bootstrap core CSS-->
<link
	href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom fonts for this template-->
<link
	href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Custom styles for this template-->
<link
	href="${pageContext.request.contextPath}/resources/css/sb-admin.css"
	rel="stylesheet">
</head>
<body class="bg-dark">
	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Register an Employee</div>
			<div class="card-body">
				<form:form action="RegisterHR" modelAttribute="employee"
					method="post">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputName">First name</label>
							
								<form:input path="firstName" class="form-control"
									id="exampleInputName" aria-describedby="nameHelp"
									placeholder="Enter first name" />
									<form:errors path="firstName" cssClass="error" />
								
							</div>
							<div class="col-md-6">
								<label for="exampleInputLastName">Last name</label>
								<form:input path="lastName" class="form-control"
									id="exampleInputLastName" taria-describedby="nameHelp"
									placeholder="Enter last name" />
									<form:errors path="lastName" cssClass="error" />
								
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label>
						<form:input path="emailID" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Enter email" />
							<form:errors path="emailID" cssClass="error" />
								
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputLastName">Login ID</label>
								<form:input path="loginID" class="form-control"
									id="exampleInputLastName" taria-describedby="nameHelp"
									placeholder="Enter Login ID" />
									
									<form:errors path="loginID" cssClass="error" />
								
							</div>

							<div class="col-md-6">
								<label for="exampleInputPassword1">Password</label>
								<form:input path="password" class="form-control"
									id="exampleInputPassword1" type="password"
									placeholder="Password" />
									
									<form:errors path="password" cssClass="error" />
								
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="exampleInputPassword1">Designation</label>
								<form:select path="designation" class="form-control">
									<form:option value="">Select Designation</form:option>
									<form:option value="HR">HR</form:option>
								</form:select>
								<form:errors path="designation" cssClass="error" />
								
							</div>
							<div class="col-md-6">
								<label for="exampleInputPassword1">Department</label>
								<form:select path="department.departmentID" class="form-control">
								    <form:option value="0">Select Department</form:option>
									<form:option value="1">HR</form:option>
									
								</form:select>
								<form:errors path="department.departmentID" cssClass="error" />
								
							</div>

						</div>
					</div>


					<form:button type="submit" class="btn btn-primary btn-block">
						Register
					</form:button>
				</form:form>
				<div class="text-center">
					<a class="d-block small mt-3" href="login">Login Page</a> <a
						class="d-block small" href="forgot-password.html">Forgot
						Password?</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/popper/popper.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!-- Core plugin JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>
</html>