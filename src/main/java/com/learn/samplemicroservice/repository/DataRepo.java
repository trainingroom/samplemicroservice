package com.learn.samplemicroservice.repository;

import com.learn.samplemicroservice.dto.Product;
import com.learn.samplemicroservice.dto.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface DataRepo extends JpaRepository<Vendor, Long>{
    public List<Product> findByvendorName(final String vendorName);

    public List<String> getVendorNames();

    public Map<Integer, Vendor> getVendors(final String vendorCategory);
}
