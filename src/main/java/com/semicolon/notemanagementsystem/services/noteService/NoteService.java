package com.semicolon.notemanagementsystem.services.noteService;

import com.semicolon.notemanagementsystem.dto.noteRequest.AddEntryRequest;
import com.semicolon.notemanagementsystem.dto.noteRequest.UpdateNoteRequest;
import com.semicolon.notemanagementsystem.dto.noteResponse.AddEntryResponse;
import com.semicolon.notemanagementsystem.dto.noteResponse.UpdateNoteResponse;
import com.semicolon.notemanagementsystem.models.Note;

import java.util.List;
import java.util.Map;

public interface NoteService {
    AddEntryResponse addEntryToDiary(AddEntryRequest addEntryRequest);

    void deleteAllEntriesInNote();

    UpdateNoteResponse updateNoteResponse(UpdateNoteRequest updateNoteRequest);
    void deleteNote(String title);

    List<Note> viewAllEntries();
}


