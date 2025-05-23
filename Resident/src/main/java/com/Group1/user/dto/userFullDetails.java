package com.Group1.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userFullDetails {
    private String userId;
    private String userName;
    private String role;
    private String email;
    private String phoneNumber;
    private String image;
    private String status;

}
