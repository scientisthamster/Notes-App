package com.scientisthamsterssofiandjohn.notesapp.listeners;

import com.scientisthamsterssofiandjohn.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
