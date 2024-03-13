package com.aryan.rapidretail.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Product {
    @Id // to specify that it is the primary key of the document
    private String id;
    private String name;
    private String description;
    private BigDecimal price;


}
