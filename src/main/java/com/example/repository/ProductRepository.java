package com.example.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperTableModel;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Product save(Product product) {
        dynamoDBMapper.save(product);
        return product;
    }

    public List<Product> findAll() {
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        return dynamoDBMapper.scan(Product.class, scanExpression);
    }

    public Product findById(String id) {
        return dynamoDBMapper.load(Product.class, id);
    }

    public void deleteProduct(Product product) {
        dynamoDBMapper.delete(product);
    }
}
