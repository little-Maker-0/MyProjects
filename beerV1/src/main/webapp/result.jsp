<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<%
  List styles = (List) request.getAttribute("styles");
  Iterator iter = styles.iterator();
  while (iter.hasNext()) {
    out.print("<br>try :" + iter.next());
  }
%>
</body>
</html>