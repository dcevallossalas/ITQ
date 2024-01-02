package bdd;

import java.sql.*;

public class Persistencia {
    private String cadenaConexion;
    private String usuario;
    private String password;
    
    public Persistencia(String preambulo, String server, int puerto, String bdd, String usuario, String password) {
        cadenaConexion = preambulo + "://" + server + ":" + puerto + "/" + bdd;
        this.usuario = usuario;
        this.password = password;
    }
    
    public int crearRegistro(String statement) throws SQLException, ClassNotFoundException {
        Connection conexion = null;
        try {
            conexion = getConexion();
            PreparedStatement ps = conexion.prepareStatement(statement);
            return ps.executeUpdate();
        } finally {
            if(conexion != null)
                conexion.close();
        }
    }
    
    public int actualizarRegistro(String statement) throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        try {
            conexion = getConexion();
            PreparedStatement ps = conexion.prepareStatement(statement);
            return ps.executeUpdate();
        } finally {
            if (conexion != null)
                conexion.close();
        }  
    }
    
    public int eliminarRegistro(String statement) throws ClassNotFoundException, SQLException {
        Connection conexion = null;
        try {
            conexion = getConexion();
            PreparedStatement ps = conexion.prepareStatement(statement);
            return ps.executeUpdate();
        } finally {
            if (conexion != null)
                conexion.close();
        }
    }
    
    public Vehiculo LeerRegistro(String statement) throws ClassNotFoundException, SQLException {
      Connection conexion = null;
        try {
            conexion = getConexion();
            PreparedStatement ps = conexion.prepareStatement(statement);
            ResultSet resultado = ps.executeQuery();
            //ResultSetMetaData rsmd = resultado.getMetaData();
            //String name = rsmd.getColumnName(1);
            
            if (resultado.next()) {
                int id = resultado.getInt("ID");
                String placa = resultado.getString("PLACA");
                String cpn = resultado.getString("CPN");
                String chasis = resultado.getString("CHASIS");
                String nombre = resultado.getString("NOMBRE_DUENO");
                String apellido = resultado.getString("APELLIDO_DUENO");
                return new Vehiculo(id, placa, cpn, chasis, nombre, apellido, 1);
            }
        } finally {
            if(conexion != null)
                conexion.close();
        }
        
        return new Vehiculo(0);
    }
    
    public Connection getConexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(cadenaConexion, usuario, password);
    }
}
