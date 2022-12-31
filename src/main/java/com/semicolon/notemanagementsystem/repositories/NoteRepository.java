package com.semicolon.notemanagementsystem.repositories;

import com.semicolon.notemanagementsystem.models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {
    public Note findByTitle(String title);
    Note deleteByTitle(String title);
}
