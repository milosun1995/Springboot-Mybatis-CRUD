<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
<h2 align="center">${bean.id==null?"新增城市信息":"编辑城市信息"}</h2>
<div align="center">
<form action="citySave" id="form" method="post">
	<table id="myTable">
		<tr>
			<td>省市编号</td>
			<td>
				<input type="hidden" name="id" value="${bean.id}" id="id">
				<input type="text" name="provinceId" value="${bean.provinceId}">
			</td>
		</tr>
		<tr>
			<td>城市名称</td>
			<td><input type="text" name="cityName" value="${bean.cityName}"></td>
		</tr>
		<tr>
			<td>描述</td>
			<td><input type="text" name="description" value="${bean.description}"></td>
		</tr>
		<tr>
		<td colspan="2"><button type="submit">submit</button>||<button type="reset">reset</button></td>
		</tr>
	</table>
</form>
</div>
</body>
</html>
