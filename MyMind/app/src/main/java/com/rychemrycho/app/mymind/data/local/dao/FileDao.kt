package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.File
import io.reactivex.Flowable

@Dao
interface FileDao {
    @Query("SELECT * FROM table_files WHERE fileId LIKE :id")
    fun find(id: Long): Flowable<File>

    @Query("SELECT * FROM table_files")
    fun findAll(): Flowable<List<File>>

    @Query("SELECT * FROM table_files WHERE fileName LIKE :name")
    fun findAllByName(name: String): Flowable<List<File>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(file: File): Long

    @Update
    fun update(file: File)

    @Delete
    fun delete(file: File)

    @Query("DELETE FROM table_files")
    fun deleteAll()
}