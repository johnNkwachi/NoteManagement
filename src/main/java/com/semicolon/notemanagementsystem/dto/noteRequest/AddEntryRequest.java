package com.semicolon.notemanagementsystem.dto.noteRequest;

import lombok.*;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddEntryRequest {
    private String title;
    private String body;
//    private LocalDateTime createdOn = LocalDateTime.now();
//    private DateTime updatedOn = DateTime.now();

}
