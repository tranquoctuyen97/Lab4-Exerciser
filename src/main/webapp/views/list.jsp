<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>list users in db</h1>
	<h2>Users</h2>
	<s:form action="search">
		<s:textfield name="name"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	<table class="table">
		<tr>
			<th>username</th>
			<th>password</th>
			<th>name</th>
			<th>edit</th>
			<th>delete</th>
		
		</tr>
		<s:iterator value="listUSER">
			<tr>
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="name" /></td>
				
				<td>
				 <s:url action="delete" id="deleteUrl">
		           <s:param name="username" value="%{username}"/>
		        </s:url>
        
		        <s:url action="update" id="updateUrl">
		        	<s:param name="username" value="%{username}"/>
		        </s:url>
		        
				</td>
				
				<td>
				<a href="<s:property value="#updateUrl"/>">Edit</a> &nbsp;&nbsp; 
	            <a href="<s:property value="#deleteUrl"/>">Delete</a>
				</td>
							
				
			</tr>
		</s:iterator>
	</table>
</body>
</html>