package com.semicolon.notemanagementsystem.dto.noteRequest;

import lombok.Data;

@Data
public class UpdateNoteRequest {
    private String title;
    private String body;
}
