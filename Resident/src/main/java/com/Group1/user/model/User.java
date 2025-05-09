package com.Group1.user.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class User {
    @Id
    private String userId;
    private String email;
    private String phoneNumber;
    private String image;
    private String status;

}
