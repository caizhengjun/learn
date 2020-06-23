package com.shanghai.springbootcacheredis.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 5:26 下午
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Integer age;
}
