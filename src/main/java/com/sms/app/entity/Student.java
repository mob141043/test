package com.sms.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @Column
    private Long id;
}
