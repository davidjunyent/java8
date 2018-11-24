package com.dj.frases.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.dj.frases.model.Frase;

public class JDBCFrasesPersistence implements FrasesPersistence {

	/**
	 * With Server connection
	 * private static String dbURL = "jdbc:derby://localhost:1527/FrasesAPP;user=dj;password=cursjava8";
	 */
	private static String dbURL = "jdbc:derby:DBFrasesAPP;user=dj;password=cursjava8";
	

	@Override
	public void saveFrase(Frase frase) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated2 catch block
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection(dbURL);
				PreparedStatement ps = con.prepareStatement("INSERT INTO FRASES VALUES(?,?)");) {

			ps.setString(1, frase.getFrase());
			ps.setTimestamp(2, Timestamp.valueOf(frase.getDataCreacio()));
			ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Frase> getAllFrases() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Frase> frases = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(dbURL);
				Statement st = con.createStatement();
				ResultSet rs=st.executeQuery("SELECT * FROM FRASES");) {
			while(rs.next()) {
				Frase frase = new Frase();
				frase.setFrase(rs.getString("FRASE"));
				frase.setDataCreacio(rs.getTimestamp("DATA_CREACIO").toLocalDateTime());
				frases.add(frase);
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return frases;
	}
}
