package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.Color
import io.reactivex.Flowable

@Dao
interface ColorDao {
    @Query("SELECT * FROM table_colors WHERE colorId LIKE :id")
    fun find(id: Long): Flowable<Color>

    @Query("SELECT * FROM table_colors")
    fun findAll(): Flowable<List<Color>>

    @Query("SELECT * FROM table_colors WHERE colorCode LIKE :code")
    fun findAllByCode(code: String): Flowable<List<Color>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(color: Color): Long

    @Update
    fun update(color: Color)

    @Delete
    fun delete(color: Color)

    @Query("DELETE FROM table_colors")
    fun deleteAll()
}