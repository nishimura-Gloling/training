package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
// JpaRepository<操作対象のEntity, 操作対象Entityの主キーの型>
public interface ProductRepository extends JpaRepository<Product, Integer> {
}