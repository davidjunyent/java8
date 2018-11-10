package com.dj.exception;

import java.sql.SQLException;

/**
 * implements java.lang.Autocloseable &
 * Closing before catch
 **/
public class Exception04 {

	public static void main(String[] args) {
		try (ItemsDAO2 itemsDAO = new ItemsDAO2()) {

			System.out.println("In try");
			itemsDAO.saveItem();
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
	}
}

class ItemsDAO2 implements AutoCloseable {

	public ItemsDAO2() {
		System.out.println("Creating ItemsDAO2");
	}

	@Override
	public void close() {
		System.out.println("Closing ItemsDAO2");
	}

	public void saveItem() throws SQLException {
		System.out.println("Save item2");
		throw new SQLException("SQL Exception!!!");
	}

}