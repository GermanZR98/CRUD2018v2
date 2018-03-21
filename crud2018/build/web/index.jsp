<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="css/estilos.css">
        <title>Gimnasio Germán</title>
    </head>

    <body>
       <div class="todo">
        <div >
            <br><br>			
            <div>
                <div class="uno"><h2>Zambrana´s GYM</h2></div>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3", "root", "");
                    Statement s = conexion.createStatement();

                    ResultSet listado = s.executeQuery("SELECT * FROM estructura_gym");
                %>

                <table class="t1">
                    <tr><th>ID</th><th>Localidad</th><th>Nombre</th><th>Tipo Somático</th><th>Peso</th></tr>
                    <form method="get" action="grabaTarjeta.jsp">
                        <tr><td><input type="text" name="socio_id" onkeypress="return valida(event) "size="5"></td>
                            <td><input type="text" name="localidad" maxlength="15" size="15"></td>
                            <td><input type="text" name="nombre" maxlength="30" maxlength="30" size="30"></td>
                            <td><input type="text" name="tipo_somatico" maxlength="9" size="15"></td>
                            <td><input type="text" name="peso" onkeypress="return valida(event)" maxlength="6" size="5"></td>
                            <td><button type="submit" value="Añadir" class="boton"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>   
                        <script>
function valida(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla==8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[0-9-.]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}
</script>
                    </form>
                    <%
                        while (listado.next()) {
                            out.println("<tr><td>");
                            out.println(listado.getString("socio_id") + "</td>");
                            out.println("<td>" + listado.getString("localidad") + "</td>");
                            out.println("<td>" + listado.getString("nombre") + "</td>");
                            out.println("<td>" + listado.getString("tipo_somatico") + "</td>");
                            out.println("<td>" + listado.getString("peso") + "</td>");
                    %>
                    <td>
                        <form method="get" action="modificaTarjeta.jsp">
                            <input type="hidden" name="socio_id" value="<%=listado.getString("socio_id")%>">
                            <input type="hidden" name="localidad" value="<%=listado.getString("localidad")%>">
                            <input type="hidden" name="nombre" value="<%=listado.getString("nombre")%>">
                            <input type="hidden" name="tipo_somatico" value="<%=listado.getString("tipo_somatico")%>">
                            <input type="hidden" name="peso" value="<%=listado.getString("peso")%>">
                            <button type="submit"  class="boton"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
                        </form>
                    </td>
                    <td>
                        <form method="get" action="borraTarjeta.jsp">
                            <input type="hidden" name="socio_id" value="<%=listado.getString("socio_id")%>"/>
                            <button type="submit"class="boton">Eliminar</button>
                        </form>
                    </td></tr>
                    <%
                        } // while   

                        conexion.close();
                    %>

                </table>

            </div>

            <div class="names">German Zambrana Ruiz<br></br>
                            ✆ germangym@gmail.com</div>

        </div>
       </div>            
    </body>
</html>