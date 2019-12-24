package com.example.web.person;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSON")
public class Person {
     @Id
     @GeneratedValue
     @Column(name = "Id", nullable=false) private Long  id;
     @Column(name = "UId", length = 64, nullable=false)  private String userid;
     @Column(name = "PASSWD", length = 64,  nullable=false) private String passwd;
     @Column(name = "NAME", length = 64, nullable=false)  private String name;
     @Temporal(TemporalType.DATE)
     @Column(name = "BIRTHDAY", nullable=false) private  Date birthday;
}
