package com.learn.samplemicroservice.dto;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "vendor_name")
    private String vendorName;


    @OneToMany(fetch=FetchType.LAZY, targetEntity=Product.class, cascade=CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName="id")
    private Collection<Product> products;

    public Vendor(Long id, String vendorName, Collection<Product> products) {
        this.id = id;
        this.vendorName = vendorName;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public Vendor() {
    }
}
