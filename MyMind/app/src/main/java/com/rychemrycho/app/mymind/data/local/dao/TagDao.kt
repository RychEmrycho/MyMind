package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.Tag
import io.reactivex.Flowable

@Dao
interface TagDao {
    @Query("SELECT * FROM table_tags WHERE tagId LIKE :id")
    fun find(id: Long): Flowable<Tag>

    @Query("SELECT * FROM table_tags")
    fun findAll(): Flowable<List<Tag>>

    @Query("SELECT * FROM table_tags WHERE tagLabel LIKE :label")
    fun findAllByLabel(label: String): Flowable<List<Tag>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(tag: Tag): Long

    @Update
    fun update(tag: Tag)

    @Delete
    fun delete(tag: Tag)

    @Query("DELETE FROM table_tags")
    fun deleteAll()
}