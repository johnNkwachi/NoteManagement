package com.semicolon.notemanagementsystem.services.noteService;

import com.semicolon.notemanagementsystem.dto.noteRequest.AddEntryRequest;
import com.semicolon.notemanagementsystem.dto.noteRequest.UpdateNoteRequest;
import com.semicolon.notemanagementsystem.dto.noteResponse.AddEntryResponse;
import com.semicolon.notemanagementsystem.dto.noteResponse.UpdateNoteResponse;
import com.semicolon.notemanagementsystem.exceptions.NotDoesNotExitException;
import com.semicolon.notemanagementsystem.exceptions.NoteNotNullException;
import com.semicolon.notemanagementsystem.models.Note;
import com.semicolon.notemanagementsystem.repositories.NoteRepository;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@Builder
@Slf4j
public class NoteServiceImpl implements NoteService {
    @Autowired
    NoteRepository noteRepository;
    @Override
    public AddEntryResponse addEntryToDiary(AddEntryRequest addEntryRequest) {
        Note note = new Note();
        Note findNote = noteRepository.findByTitle(addEntryRequest.getTitle());
        if (findNote != null)throw new NoteNotNullException("Create New title or note");
        ModelMapper mapper = new ModelMapper();
        mapper.map(addEntryRequest, note);
        Note saved = noteRepository.save(note);
        mapper.map(saved, AddEntryResponse.class);
        return AddEntryResponse.builder().message("Successfully created a note")
                .localDateTime(LocalDateTime.now()).build();
    }

    @Override
    public void deleteAllEntriesInNote() {

    }

    @Override
    public UpdateNoteResponse updateNoteResponse(UpdateNoteRequest updateNoteRequest) {
        Note note = new Note();
        Note findNote = noteRepository.findByTitle(updateNoteRequest.getTitle());
        if (findNote == null)throw new NotDoesNotExitException("the title or body does not exist");
        note.setBody(updateNoteRequest.getBody());
        note.setTitle(updateNoteRequest.getTitle());
        Note updatedNoted = noteRepository.save(note);
        ModelMapper mapper = new ModelMapper();
        mapper.map(updatedNoted, UpdateNoteRequest.class);
        return UpdateNoteResponse.builder().message("Note updated successfully")
                .localDateTime(LocalDateTime.now()).build();

    }

    @Override
    public void deleteNote(String title) {
        noteRepository.deleteById(title);
    }

    @Override
    public List<Note> viewAllEntries() {
        return null;
    }

}
