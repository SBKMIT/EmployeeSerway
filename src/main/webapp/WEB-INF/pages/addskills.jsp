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
<title>HR Home | Automatic</title>
<!-- Bootstrap core CSS-->
<link
	href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom fonts for this template-->
<link
	href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Page level plugin CSS-->
<link
	href="${pageContext.request.contextPath}/resources/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
<!-- Custom styles for this template-->
<link
	href="${pageContext.request.contextPath}/resources/css/sb-admin.css"
	rel="stylesheet">
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		id="mainNav"> <a class="navbar-brand" href="#"><img
		alt="image"
		src="${pageContext.request.contextPath}/resources/images/logo.png"></a>
	<button class="navbar-toggler navbar-toggler-right" type="button"
		data-toggle="collapse" data-target="#navbarResponsive"
		aria-controls="navbarResponsive" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarResponsive">
		<ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
			<li class="nav-item" data-toggle="tooltip" data-placement="right"
				title="Dashboard"><a class="nav-link" href="index.html"> <i
					class="fa fa-fw fa-dashboard"></i> <span class="nav-link-text">Add
						Employee</span>
			</a></li>
			<li class="nav-item" data-toggle="tooltip" data-placement="right"
				title="Charts"><a class="nav-link" href="charts.html"> <i
					class="fa fa-fw fa-area-chart"></i> <span class="nav-link-text">Add
						Skills</span>
			</a></li>
			<li class="nav-item" data-toggle="tooltip" data-placement="right"
				title="Tables"><a class="nav-link" href="tables.html"> <i
					class="fa fa-fw fa-table"></i> <span class="nav-link-text">Start
						360 Serwary</span>
			</a></li>


		</ul>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link" data-toggle="modal"
				data-target="#exampleModal"> <i class="fa fa-fw fa-sign-out"></i><font
					style="color: blue;">Logout</font>
			</a></li>
		</ul>
	</div>
	</nav>
	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">

					<div class="card card-login mx-auto mt-5">
						
						<div class="card-header">Enter Skill</div>
						<div class="card-body">

							<form:form action="saveSkill" modelAttribute="skillMaster"
								method="post">

								<div class="form-group">
									<label for="exampleInputEmail1">Skill</label>
									<form:input path="skill" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										placeholder="Enter skill" />
									<form:errors path="skill" cssClass="error" />

								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Description</label>
								
									<form:textarea path="description" class="form-control"
										placeholder="Enter Description" />

									<form:errors path="description" cssClass="error" />

								</div>

								<form:button type="submit" class="btn btn-primary btn-block">
						SAVE
					</form:button>


							</form:form>
						</div>
					</div>


				</div>
			</div>


			

			<footer class="sticky-footer">
			<div class="container">
				<div class="text-center">
					<small>Copyright © Automatic Infotech PVT LTD 2017</small>
				</div>
			</div>
			</footer>
			<!-- Scroll to Top Button-->
			<a class="scroll-to-top rounded" href="#page-top"> <i
				class="fa fa-angle-up"></i>
			</a>
			<!-- Logout Modal-->
			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Ready to
								Leave?</h5>
							<button class="close" type="button" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">Select "Logout" below if you are
							ready to end your current session.</div>
						<div class="modal-footer">
							<button class="btn btn-secondary" type="button"
								data-dismiss="modal">Cancel</button>
							<a class="btn btn-primary" href="logout">Logout</a>
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
			<!-- Page level plugin JavaScript-->
			<script
				src="${pageContext.request.contextPath}/resources/vendor/chart.js/Chart.min.js"></script>
			<script
				src="${pageContext.request.contextPath}/resources/vendor/datatables/jquery.dataTables.js"></script>
			<script
				src="${pageContext.request.contextPath}/resources/vendor/datatables/dataTables.bootstrap4.js"></script>
			<!-- Custom scripts for all pages-->
			<script
				src="${pageContext.request.contextPath}/resources/js/sb-admin.min.js"></script>
			<!-- Custom scripts for this page-->
			<script
				src="${pageContext.request.contextPath}/resources/js/sb-admin-datatables.min.js"></script>
			<script
				src="${pageContext.request.contextPath}/resources/js/sb-admin-charts.min.js"></script>
		</div>
	</div>

</body>
</html>