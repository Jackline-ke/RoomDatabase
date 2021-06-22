package com.example.roomdatabasedemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")

class Notes (

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val notesTitle: String? = null,
    val notesDescription: String? = null
)
