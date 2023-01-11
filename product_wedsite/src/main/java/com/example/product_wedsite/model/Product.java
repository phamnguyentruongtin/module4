package com.example.product_wedsite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "codeProduct")
    private String codeProduct;
    @Column(name = "nameProduct")
    private String nameProduct;
    private String manufacturer;
    private String date;

    public Product(String codeProduct, String nameProduct, String manufacturer, String date) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.date = date;
    }

    public Product() {
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
