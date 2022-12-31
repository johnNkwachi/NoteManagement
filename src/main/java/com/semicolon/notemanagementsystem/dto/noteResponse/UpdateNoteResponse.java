package com.semicolon.notemanagementsystem.dto.noteResponse;

import lombok.Builder;
import lombok.Data;
import org.joda.time.DateTime;

import java.time.LocalDateTime;

@Data
@Builder
public class UpdateNoteResponse {
    private java.time.LocalDateTime localDateTime = LocalDateTime.now();
    private String message;
}
