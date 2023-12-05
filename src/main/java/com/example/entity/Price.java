package com.example.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBDocument
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    @DynamoDBAttribute
    private long discount;
    @DynamoDBAttribute
    private long actualPrice;
    @DynamoDBAttribute
    private long offeredPrice;
    @DynamoDBAttribute
    private long sellingPrice;
}
