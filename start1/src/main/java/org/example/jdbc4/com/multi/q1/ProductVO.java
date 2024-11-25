package org.example.jdbc4.com.multi.q1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class ProductVO {
    private int ProductID;
    private String ProductName;
    private String Price;
    private int Quantity;
}
