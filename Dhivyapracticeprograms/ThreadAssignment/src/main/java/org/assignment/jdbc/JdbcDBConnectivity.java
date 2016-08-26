package org.assignment.jdbc;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDBConnectivity {



		public static void main(String[] args)
				throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
			java.sql.Connection conn = null;
			ResultSet rs = null;
			java.sql.Statement st = null;

			try {
				Class.forName("com.mysql.jdbc.Driver");

				String connectionUrl = "jdbc:mysql://10.242.133.153:3306/test";
				String connectionUser = "root";
				String connectionPwd = "root";

				conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPwd);
				st = conn.createStatement();

				// INSERTING THE VALUES
				String sql1 = "INSERT INTO products " + "VALUES(16,'PEN','Pen yyy',59,3.00)";
				st.execute(sql1);
				System.out.println("Inserted the record");

				// UPDATING THE VALUES
				String sql2 = "UPDATE products SET quantity=60 WHERE productID=7";
				st.executeUpdate(sql2);
				System.out.println("Records updated");

				// DELETING THE RECORDS
				String sql3 = "delete from products where productID IN(4,6,7,8)";
				st.executeUpdate(sql3);
				System.out.println("Records DELETED");

				// RETREIVING THE RECORDS
				String sql = "SELECT productID, name,quantity FROM products";
				rs = st.executeQuery(sql);

				while (rs.next()) {
					int id = rs.getInt("productID");
					String name = rs.getString("name");
					int quantity = rs.getInt("quantity");

					System.out.print("product ID: " + id);
					System.out.print(", product name: " + name);
					System.out.println(", quantity: " + quantity);
				}
				rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				try {
					if (st != null)
						conn.close();
				} catch (SQLException se) {
				}
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			System.out.println("Goodbye!");
		}

	}

