package com.dj.exception;

import java.sql.SQLException;

/**
 * implements java.lang.Autocloseable
 **/
public class Exception03 {

	public static void main(String[] args) {
		try (ItemsDAO1 itemsDAO = new ItemsDAO1()) {

			System.out.println("In try");
			try {
				itemsDAO.saveItem();
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
		}
	}
}

class ItemsDAO1 implements AutoCloseable {

	public ItemsDAO1() {
		System.out.println("Creating ItemsDAO1");
	}

	@Override
	public void close() {
		System.out.println("Closing ItemsDAO1");
	}

	public void saveItem() throws SQLException {
		System.out.println("Save item1");
	}

}