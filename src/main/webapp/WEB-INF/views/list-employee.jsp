<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaguides.net</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>CRM - Employee</h2>
			<hr />

			<input type="button" value="Add Employee"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Employee List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>Name</th>
							<th>Tel</th>
							<th>Address</th>
							<th>Sex</th>
							<th>BirthYear</th>
							<th>Update</th>
							<th>Delete</th> 
						</tr>

						<!-- loop over and print our company -->
						<c:forEach var="tempEmployee" items="${employee}">

							<!-- construct an "update" link with employee id -->
							<c:url var="updateLink" value="/employee/updateForm">
								<c:param name="employeeId" value="${tempEmployee.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/employee/delete">
								<c:param name="employeeId" value="${tempEmployee.id}" />
							</c:url>

							<tr>
								<td>${tempEmployee.name}</td>
								<td>${tempEmployee.tel}</td>
								<td>${tempEmployee.address}</td>
								<td>${tempEmployee.sex}</td>
								<td>${tempEmployee.birthYear}</td>

								<td>
									<a href="${updateLink}" type="button" class="btn btn-warning">Update</a>
								</td>
								<td> 
								<a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this employee?'))) return false" type="button" class="btn btn-danger">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>
</body>

</html>









