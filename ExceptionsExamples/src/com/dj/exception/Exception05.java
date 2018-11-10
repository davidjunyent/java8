package com.dj.exception;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * implements 2 java.lang.Autocloseable &
 * Closing before catch with supressed exceptions
 **/
public class Exception05 {

	public static void main(String[] args) {
		try (   
				ItemsDAO3 itemsDAO = new ItemsDAO3();
				ItemsDAO1 itemsDAO1 = new ItemsDAO1()) {

			System.out.println("In try");
			itemsDAO.saveItem();
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		}
	}
}

class ItemsDAO3 implements AutoCloseable {

	public ItemsDAO3() {
		System.out.println("Creating ItemsDAO3");
	}

	@Override
	public void close() throws FileNotFoundException{
		System.out.println("Closing ItemsDAO3");
		throw new FileNotFoundException("File not found!!");
	}

	public void saveItem() throws SQLException {
		System.out.println("Save item3");
		throw new SQLException("SQL Exception!!!");
	}

}