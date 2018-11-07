package modelo.conexion;

import java.sql.*;

//En esta clase tenemos la cadena de conexión con la que trabajará nuestra aplicación,
//en ella se define la base de datos, el usuario, password y driver de conexión, 
//si por ejemplo en un futuro se nos pide conectarnos a una base de datos diferente o establecer
//un sistema gestor distinto (pero con la misma estructura de tablas y campos), tan solo modificaremos 
//esta clase y dicho cambio sera transparente para el resto del sistema.
//(Tener en cuenta que los datos de login y password corresponden a los que yo dejé por 
//	defecto al instalar MySql, es decir login root y sin contraseña)

/**
 * Clase que permite conectar con la base de datos
 * @author Alex
 *
 */
public class Conexion {
   static String bd = "codejavu";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/"+bd;

   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conección a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}