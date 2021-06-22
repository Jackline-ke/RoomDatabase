package com.example.roomdatabasedemo

import androidx.room.*

@Dao

interface NotesDao {
    @Insert
    fun insertNote(notes:Notes)

    @Delete
    fun deleteNote(notes: Notes)

    @Query ("SELECT * FROM notes_table ORDER BY id ASC")
    fun getAllNotes(): List<Notes>

    @Update
    fun updateNote(notes: Notes)

}