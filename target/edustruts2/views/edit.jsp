<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>cap nhat thong tin User.</h3>

<s:if test="user != null" >

     <s:form action="saveUSER" method="post">
  <s:push value="user">
     <s:hidden name="username" />
     	<s:textfield name="password" label="password" />
     	<s:textfield name="name" label="Name" />
     	<s:submit></s:submit>
     	</s:push>
     </s:form>


</s:if>

<s:else>

<p>No person was found.</p>
</s:else>
</body>
</html>