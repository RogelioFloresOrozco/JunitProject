<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>proyecto de junit</h2>
    <form action="SumaServlet" method="POST">

        <P>
            <label for="txtNumero1">Introduce un numero: </label>
            <input type="text" id="txtNumero1" name="txtNumero1" required>
        </P>
        
        <P>
                <label for="txtNumero2">Introduce un numero: </label>
                <input type="text" id="txtNumero2" name="txtNumero2" required>
        </P>

        <p>
            <input type="submit" value="suma">
        </p>
    </form>

</body>
</html>