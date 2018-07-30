<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css"/>
<%-- <script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/datatable.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<link rel="stylesheet" type="text/css" href="css/table.css"/> --%>
<script type="text/javascript">
$(document).ready(function() {
    $('#example').DataTable();
} );
</script>
</head>
<body>

<s:form action="saveUSER">
<s:push value="user">
<s:textfield name="username" label="UserName"></s:textfield>
<s:textfield name="password" label="Password"></s:textfield>
<s:textfield name="name" label="Name"></s:textfield>
<s:submit></s:submit>
</s:push>

</s:form>
<div style="width: 80%;height: auto;">
	<table id="example" class="table table-striped table-bordered" >
	<thead>
		<tr>
			<th>username</th>
			<th>password</th>
			<th>name</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="userList">
			<tr>
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="name" /></td>
				<td>
				 <s:url action="deleteUSER" id="deleteUSER">
		           <s:param name="username" value="%{username}"/>
		        </s:url>
		        <s:a href="%{deleteUSER}">Delete</s:a> 
              
		       
	         
				</td>
				<td>
				 <s:url action="editUSER" id="editUSER">
		        	<s:param name="username" value="%{username}"/>
		        </s:url>
		          <s:a href="%{editUSER}">Update</s:a> 
				</td>
			</tr>
		</s:iterator>
		<tbody>
		 <tfoot>	
		 <tr>
			<th>username</th>
			<th>password</th>
			<th>name</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		</tfoot>
	</table>
	</div>

</body>

</html>