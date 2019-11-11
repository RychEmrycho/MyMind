package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.Item
import io.reactivex.Flowable

@Dao
interface ItemDao {
    @Query("SELECT * FROM table_items WHERE itemId LIKE :id")
    fun find(id: Long): Flowable<Item>

    @Query("SELECT * FROM table_items")
    fun findAll(): Flowable<List<Item>>

    @Query("SELECT * FROM table_items WHERE title LIKE :title")
    fun findAllByName(title: String): Flowable<List<Item>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: Item): Long

    @Update
    fun update(item: Item)

    @Delete
    fun delete(item: Item)

    @Query("DELETE FROM table_items")
    fun deleteAll()
}