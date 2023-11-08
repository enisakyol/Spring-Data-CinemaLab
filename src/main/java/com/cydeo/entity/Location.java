package com.cydeo.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
public class Location extends BaseEntity{
private String name;
private BigDecimal latitude;
private BigDecimal longitude;
private String postalCode;
private String country;
private String state;
private String city;
private String address;
}
