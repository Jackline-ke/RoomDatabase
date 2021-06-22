package com.example.roomdatabasedemo

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase

@Database(entities = [Notes:: class])
class NotesDatabase: RoomDatabase() {

}