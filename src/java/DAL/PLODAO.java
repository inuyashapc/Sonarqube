/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PLODAO extends DBContext {

    public void add(String name, String description, boolean isActive) {
        try {

            String sql = "INSERT INTO `swp391_se1632_g2`.`plo` (`ploName`,`ploDescription`,`isActive`)\n"
                    + "VALUES (?, ?, ?);";

            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, description);
            st.setBoolean(3, isActive);

            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("PLODAO -> add(): " + e);
        }
    }

    public void update(String name, String description, boolean isActive, int ploid) {
        try {

            String sql = "UPDATE `swp391_se1632_g2`.`plo` SET\n"
                    + "`ploName` = ?,\n"
                    + "`ploDescription` = ?,\n"
                    + "`isActive` = ?\n"
                    + "WHERE `ploid` = ?;";

            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, description);
            st.setBoolean(3, isActive);
            st.setInt(4, ploid);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("PLODAO -> update(): " + e);
        }
    }
}
