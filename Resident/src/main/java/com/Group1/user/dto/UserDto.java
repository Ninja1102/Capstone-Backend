package com.Group1.user.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String email;
    private String phoneNumber;
    private String image;
    @Pattern(regexp = "^(PENDING|APPROVED|REJECTED)$", message = "Status must be anyone of 'Pending', 'Approved' and 'Rejected'")
    private String status;
}
