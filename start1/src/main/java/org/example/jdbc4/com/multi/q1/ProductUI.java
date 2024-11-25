package org.example.jdbc4.com.multi.q1;

import java.sql.SQLException;

public class ProductUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDAO dao = new ProductDAO();
        ProductVO bag = dao.one(2);
        if (bag != null) {
            System.out.println("검색한 ID>> " + bag.getProductID());
            System.out.println("검색한 name>> " + bag.getProductName());
            System.out.println("검색한 price>> " + bag.getPrice());
            System.out.println("검색한 quantity>> " + bag.getQuantity());
        } else {
            System.out.println("검색결과가 없음..!");
        }

    }
}
