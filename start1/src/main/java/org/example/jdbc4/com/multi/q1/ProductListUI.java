package org.example.jdbc4.com.multi.q1;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductListUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDAO dao = new ProductDAO();
        ArrayList<ProductVO> list = dao.list();
        if (list != null) {
            for (ProductVO bag : list) {
                System.out.println(bag.getProductID());
                System.out.println(bag.getProductName());
                System.out.println(bag.getPrice());
                System.out.println(bag.getQuantity());
                System.out.println("---------------");
            }
        }
        else {
            System.out.println("검색결과가 없음..!");
        }
    }
}
