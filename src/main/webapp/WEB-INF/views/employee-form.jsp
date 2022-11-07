<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COMPANY - FORM</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">FORM EMPLOYEE</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Company</div>
				</div>
				<div class="panel-body">
					<form:form action="saveEmployee" cssClass="form-horizontal"
						method="post" modelAttribute="employee">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Name</label>
							<div class="col-md-9">
								<form:input path="name" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="tel" class="col-md-3 control-label">Tel</label>
							<div class="col-md-9">
								<form:input path="tel" cssClass="form-control" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="address" class="col-md-3 control-label">Address</label>
							<div class="col-md-9">
								<form:input path="address" cssClass="form-control" />
							</div>
						</div>
						
						
						<div class="form-group">
							<label for="sex" class="col-md-3 control-label">Sex</label>
							<div class="col-md-9">
								<form:input path="sex" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="birthYear" class="col-md-3 control-label">BirthYear</label>
							<div class="col-md-9">
								<form:input path="birthYear" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-success">Submit</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>