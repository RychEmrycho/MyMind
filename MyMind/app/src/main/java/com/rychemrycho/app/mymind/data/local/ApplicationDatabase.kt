package com.rychemrycho.app.mymind.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rychemrycho.app.mymind.data.local.dao.NoteDao
import com.rychemrycho.app.mymind.data.local.entity.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class ApplicationDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}