package org.assignment.jdbc;

import java.sql.DriverManager;

import java.sql.SQLException;

public class TransacMgmtJdbc {


	/**
	 * class TransMgmt for transaction management using JDBC
	 * 
	 * @author 542320
	 *
	 */
	public class TransMgmt {

		private TransMgmt() {

		}

		/**
		 * 
		 * @param args
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 * @throws InstantiationException
		 * @throws IllegalAccessException
		 */
		public void main(String[] args)throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
			java.sql.Connection conn = null;

			java.sql.Statement st = null;

			try {
				Class.forName("com.mysql.jdbc.Driver");

				String connectionUrl = "jdbc:mysql://10.242.133.153:3306/test";
				String connectionUser = "root";
				String connectionPwd = "root";

				conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPwd);
				st = conn.createStatement();
				conn.setAutoCommit(false);

				// INSERTING THE VALUES
				String sql1 = "INSERT INTO products " + "VALUES(12,'PEN','Pen yyy',59,3.00)";
				st.execute(sql1);
				String sql2 = "INSERT INTO products " + "VALUES(10,'PEN','Pen yyy',59,3.00)";
				st.execute(sql2);

				conn.commit();
				{
					throw new Exception();
				}

			} catch (Exception e) {
				conn.rollback();
				System.out.println("Exception occured");
			}

		}

	}

}
