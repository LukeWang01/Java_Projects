import java.sql.*;

public class JDBCTest {

    public static void main(String[] args){

//        System.out.println("hello");
        String url = "jdbc:mysql://localhost:3306/employees_database";
        try {
            // Creat connection obj
            Connection conn = DriverManager.getConnection(url, "root", "lukelab");

            // creat a statement obj to send to the database
            Statement statement = conn.createStatement();

            // run the statement
            String sql_str = "SELECT * FROM employees_tbl";
            ResultSet resultSet = statement.executeQuery(sql_str);

            // process the result
            int salaryTotal = 0;
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("dept"));
                System.out.println(resultSet.getInt("salary"));

                salaryTotal += resultSet.getInt("salary");

            }
            System.out.println("------------------------");
            System.out.println("Total Salary: " + salaryTotal);


            // insert row
            String insert_sql = "INSERT into employees_tbl (id, name, dept, salary) values(900, \"Luke\", \"Tech2\", 8000);";
            int rowsCounted = statement.executeUpdate(insert_sql);
//          rowsCounted = statement.executeUpdate("DELETE FROM employees_tbl");

//          rowsCounted = statement.executeUpdate("UPDATE employees_tbl SET salary = 5500 where id = 600;");

            System.out.println("Rows affected: " + rowsCounted);

            // new a statement
//            salaryTotal = 0;
//            while (resultSet.next()){
//                salaryTotal += resultSet.getInt("salary");
//
//            }
//            System.out.println("------------------------");
//            System.out.println("Total Salary: " + salaryTotal);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
