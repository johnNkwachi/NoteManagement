package com.semicolon.notemanagementsystem.controller;

import com.semicolon.notemanagementsystem.dto.noteRequest.AddEntryRequest;
import com.semicolon.notemanagementsystem.dto.noteRequest.UpdateNoteRequest;
import com.semicolon.notemanagementsystem.dto.noteResponse.AddEntryResponse;
import com.semicolon.notemanagementsystem.dto.noteResponse.UpdateNoteResponse;
import com.semicolon.notemanagementsystem.services.noteService.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class NoteController {
    @Autowired
    NoteService noteService;

    @PostMapping("/note")
    public AddEntryResponse addEntryToDiary(@RequestBody AddEntryRequest addEntryRequest){
        return noteService.addEntryToDiary(addEntryRequest);
    }

    @PutMapping(path = "/update/{id}")
    public UpdateNoteResponse updateNoteResponse(@PathVariable String id, @RequestBody UpdateNoteRequest updateNoteRequest){
        return noteService.updateNoteResponse(updateNoteRequest);
    }
    @DeleteMapping(path = "/delete/{title}")
    public void deleteNote(@PathVariable String title){
        noteService.deleteNote(title);
    }
}
