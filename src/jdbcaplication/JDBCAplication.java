package jdbcaplication;

import java.sql.*;

public class JDBCAplication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("*****Carga exitosa *****");
            // String url = "jdbc:mysql://localhost/bd_proyecto?user=root";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_proyecto", "root", "");
            // Connection con = DriverManager.getConnection(url);
            System.out.println("Conexion Establecida");
            Statement st = con.createStatement();
            st.execute("insert into " 
                    +"usuarios(nombre, apellido,correo,usuario,clave,telefono)"
                    +"values ('arturo','suarez','suareza@hotmail.com','Arturo','patito',938127278)");
            con.close();
        } catch (ClassNotFoundException ex)
        {
            System.out.println("Error: imposible cargar el controlador");
            System.exit(1);
        } catch (SQLException ex) 
        {
            System.out.println("Error de conexion");
            ex.printStackTrace();
        }
    }

}
