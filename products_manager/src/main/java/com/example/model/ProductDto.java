package com.example.model;

public class ProductDto {
    private String codeProduct;
    private String nameProduct;
    private String manufacturer;
    private String date;

    public ProductDto(String codeProduct, String nameProduct, String manufacturer, String date) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.date = date;
    }

    public ProductDto() {
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
