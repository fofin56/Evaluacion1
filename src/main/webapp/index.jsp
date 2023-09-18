<%-- 
    Document   : index
    Created on : 17-sep-2023, 21:26:11
    Author     : benjamin figueroa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculadora de intereses</title>
    </head>
    <body>
        <h1>calculadora de intereses</h1>
        
        <form action="Servletindex1" method="POST">
            ingrese por favor el monto del credito en pesos</br>
        <input type="text" name="dinero" rows="5" cols="10"></br>
            ingrese por favor la duracion en años del credito</br>
            <select name="select">
                <option value =3>3 años</option>
                <option value =5>5 años</option>
                <option value =10>10 años</option>
                <option value =30>30 años</option>
            </select></br>
            <button type="submit">enviar</button>
        </form>
    </body>
</html>
