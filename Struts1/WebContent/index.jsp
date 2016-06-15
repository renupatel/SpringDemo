<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="s" %>
    


<s:form id="HF" action="hello">
Name: <s:text property="name"></s:text>

<s:submit value="submit"></s:submit>


</s:form>
