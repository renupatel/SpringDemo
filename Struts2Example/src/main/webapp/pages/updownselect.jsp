<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<s:head />
</head>

<body>
<h1>Struts 2 updownselect example</h1>

<s:form action="resultAction" namespace="/" method="POST" >

<s:updownselect
list="#{'KFC':'KFC', 'McDonald':'McDonald', 'Burger King':'Burger King',
'Pizza Hut':'Pizza Hut', 'Fat Boy King':'Fat Boy King'}"
name="favFastFood"
headerKey="-1"
headerValue="--- Please Order ---" 
size="7"
/>

<s:updownselect
list="moviesList"
name="favMovie"
headerKey="-1"
headerValue="--- Please Order ---"
size="10"
moveUpLabel="Move Up"
moveDownLabel="Move Down"
selectAllLabel="Select All" />

<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>