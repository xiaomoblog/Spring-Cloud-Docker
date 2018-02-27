package cn.jiayao.domain;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author admin
 * @Data 生成get、set、toString方法
 * @Entity 表明当前为实体类
 */
@Data
@Entity
public class User {
    /**
     * 表明当前属性为主键,自增类型
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Short age;
    @Column
    private BigDecimal balance;
}
