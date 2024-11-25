package org.example.jdbc4.com.multi.q1;

import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {
    Connection con;

    public ProductDAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url,id,pw);
    }

    public ProductVO one(int productid) throws SQLException {
        String sql = "select * from product where productid=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,productid);
        ProductVO bag = null;


        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            bag = new ProductVO();
            bag.setProductID(rs.getInt("productid"));
            bag.setProductName(rs.getString("ProductName"));
            bag.setPrice(rs.getString("Price"));
            bag.setQuantity(rs.getInt("Quantity"));
        }
        return bag;
    }

    public ArrayList<ProductVO> list() throws SQLException {
        ArrayList<ProductVO> list = null;
        String sql = "select * from product";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            if (list == null) {
                list = new ArrayList<>();
            }
            ProductVO bag = new ProductVO();
            bag.setProductID(rs.getInt("productid"));
            bag.setProductName(rs.getString("ProductName"));
            bag.setPrice(rs.getString("Price"));
            bag.setQuantity(rs.getInt("Quantity"));
            list.add(bag);
        }

        return list;
    }
}
