package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.Category
import io.reactivex.Flowable

@Dao
interface CategoryDao {
    @Query("SELECT * FROM table_categories WHERE categoryId LIKE :id")
    fun find(id: Long): Flowable<Category>

    @Query("SELECT * FROM table_categories")
    fun findAll(): Flowable<List<Category>>

    @Query("SELECT * FROM table_categories WHERE categoryName LIKE :name")
    fun findAllByName(name: String): Flowable<List<Category>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(category: Category): Long

    @Update
    fun update(category: Category)

    @Delete
    fun delete(category: Category)

    @Query("DELETE FROM table_categories")
    fun deleteAll()
}