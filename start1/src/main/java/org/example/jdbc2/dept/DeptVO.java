package org.example.jdbc2.dept;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class DeptVO {
    // 가방에 들어갈 데이터 공간을 할당(member 테이블의 컬럼명과 동일)
    private int DEPTNO;
    private String DNAME;
    private String LOC;
}
