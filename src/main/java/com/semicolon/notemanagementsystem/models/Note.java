package com.semicolon.notemanagementsystem.models;

import lombok.*;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Note {
    @Id
    private String title;
    private String body;

//    private LocalDateTime createdOn = LocalDateTime.now();

//    private DateTime updatedOn;


}
