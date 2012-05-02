package org.koushik.javabrains.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.koushik.javabrains.model.Circle;

public class JdbcDaoImpl {

    public Circle getCircle(int circleId) {
        Connection conn = null;
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM circle WHERE id=1");
            Circle circle = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                circle = new Circle(1, rs.getString("name"));
            }
            rs.close();
            ps.close();
            return circle;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(JdbcDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
