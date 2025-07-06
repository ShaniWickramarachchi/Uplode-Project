package Juice2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {

    public static Connection getConnection() {
        Connection con = null;
        try {
            // MySQL JDBC driver එක load කිරීම. මේක අනිවාර්යයි driver එක හඳුනාගන්න.
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // Connection එක ස්ථාපිත කිරීම
            // Format: "jdbc:mysql://hostname:port/databaseName", "username", "password"
            // ඔයාගේ database name එක "db" කියලා phpMyAdmin එකේ පේනවා.
            // "root" සහ "" (හිස්) ඔයාගේ username එකයි password එකයි. මේවා නිවැරදිද කියලා බලන්න.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", ""); 
            
            System.out.println("Database connection established successfully!"); // Debugging සඳහා
            
        } catch (ClassNotFoundException e) {
            // MySQL JDBC driver එක හම්බුනේ නැතිනම් මේ error එක එනවා.
            System.err.println("MySQL JDBC Driver not found. Make sure it's added to your project libraries.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Database සම්බන්ධ error
            System.err.println("Database connection error: " + e.getMessage());
            e.printStackTrace(); 
        } catch (Exception e) {
            // වෙනත් අනපේක්ෂිත error
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    // මේ main method එක connection එක test කරන්න භාවිතා කරන්න පුළුවන්.
    public static void main(String[] args) {
        Connection testCon = getConnection();
        if (testCon != null) {
            System.out.println("Test connection successful!");
            try {
                testCon.close(); // Test එකෙන් පස්සේ connection එක වහන්න
                System.out.println("Test connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing test connection: " + e.getMessage());
            }
        } else {
            System.out.println("Test connection failed. Check console for errors.");
        }
    }
}