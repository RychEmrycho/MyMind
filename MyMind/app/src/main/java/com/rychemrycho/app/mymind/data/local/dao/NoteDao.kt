package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.Note
import io.reactivex.Flowable

@Dao
interface NoteDao {
    @Query("SELECT * FROM table_note")
    fun findAll(): Flowable<List<Note>>

    @Query("SELECT * FROM table_note WHERE title LIKE :title")
    fun findAllByName(title: String): Flowable<List<Note>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note): Long

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)
}