package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * Nesta classe estamos criando uma conexão com o BD através da classe Connection com o método getConnection
 * Pegamos os atributos da classe db.propeties no método loadProperties
 * Criamos o método responsável por fechar a conexão com o método closeConnection
 */
public class DB {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
			
		}
		return conn;
	}
	
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
	}
	
	private static Properties loadProperties(){
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DBException(e.getMessage());
		}
	}
}
