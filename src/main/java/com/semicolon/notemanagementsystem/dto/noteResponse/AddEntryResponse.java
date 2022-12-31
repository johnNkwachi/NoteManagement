package com.semicolon.notemanagementsystem.dto.noteResponse;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddEntryResponse {
    private LocalDateTime localDateTime = LocalDateTime.now();
    private String message;
}
