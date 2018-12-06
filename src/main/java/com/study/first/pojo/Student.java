package com.study.first.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@SuppressWarnings("serial")
@Accessors(chain= true)
@Entity
@Data
public class Student implements Serializable {

    @Id
    private  Integer id;
    private String name;
    private Integer age;
    private Integer sex;
}
