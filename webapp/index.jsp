<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI</title>

</head>
<body>

<h1>BMI WebService</h1>
<p>This is a Web Service to calculate the BMI - Body Mass Index</p>

<h2>REST Servies</h2>
<p>Go to <a href="<%=request.getRequestURL() %>api/bmi/weight/76/height/1.71"><%=request.getRequestURL() %>api/bmi/weight/76/height/1.71</a></p>

<h2>SOAP Servies</h2>
<p>Go to <a href="<%=request.getRequestURL() %>services/BMIService?wsdl"><%=request.getRequestURL() %>services/BMIService?wsdl</a></p>

</body>
</html>