<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<meta charset="utf-8">
<link
	href="http://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css"
	rel="stylesheet" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script
	src="http://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
<title>Spring boot</title>
<style type="text/css">
tr {
	text-align: center;
}
</style>
</head>
<h2 align="center">城市信息列表</h2>
<table id="myTable">
	<thead>
		<tr>
			<th>id</th>
			<th>provinceId</th>
			<th>cityName</th>
			<th>description</th>
			<th>do</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${cityList}" var="cityBean">
			<tr>
				<td>${cityBean.id}</td>
				<td>${cityBean.provinceId}</td>
				<td>${cityBean.cityName}</td>
				<td>${cityBean.description}</td>
				<td>
					<a href="cityDelete?id=${cityBean.id}">delete</a> || 
					<a href="cityUpdate?id=${cityBean.id}">update</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<h4 align="center"><a href="cityNew">addNewInfo</a></h4>
<script type="text/javascript">
	$(document).ready(function() {
		$('#myTable').DataTable();
	});
</script>
</html>