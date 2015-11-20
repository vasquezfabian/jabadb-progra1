
package javabdd01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class JavaBdd01 {

 
    public static void main(String[] args) {
        String usuario="root";
        String clave="";
        Scanner in=new Scanner(System.in);
       try{//Intentar
           Class.forName("org.gjt.mm.mysql.Driver");
           //Direcccion del driver jdbc
           String url="jdbc:mysql://localhost:3306/inacap";
           //Ruta de la base de datos
           Connection con=DriverManager.getConnection(url,usuario,clave);
           //Es el que establece la conexion(DriverManager)
           //System.out.println("CONEXION ESTABLECIDA!!");
           Statement stmt=con.createStatement();
           System.out.println("Ingrese id a eliminar");
           int id=Integer.parseInt(in.nextLine());
           stmt.executeUpdate("delete from alumnos where alumno_id='"+id+"'");
           //EJECUTAR
           System.out.println("USUARIO ELIMINADO!!");
           
           //Consultar de tipo insert etc
           //chupa el picoooo fabian jijijijiji
           
       }catch(Exception ex){
           System.out.println("ERROR:"+ex.getMessage());
           //Encargado de dar Mensaje de error
           
       }
    }
    
}
