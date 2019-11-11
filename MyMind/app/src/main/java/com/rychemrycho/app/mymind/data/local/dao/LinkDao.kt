package com.rychemrycho.app.mymind.data.local.dao

import androidx.room.*
import com.rychemrycho.app.mymind.data.local.entity.Link
import io.reactivex.Flowable

@Dao
interface LinkDao {
    @Query("SELECT * FROM table_links WHERE linkId LIKE :id")
    fun find(id: Long): Flowable<Link>

    @Query("SELECT * FROM table_links")
    fun findAll(): Flowable<List<Link>>

    @Query("SELECT * FROM table_links WHERE linkLabel LIKE :label")
    fun findAllByLabel(label: String): Flowable<List<Link>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(link: Link): Long

    @Update
    fun update(link: Link)

    @Delete
    fun delete(link: Link)

    @Query("DELETE FROM table_links")
    fun deleteAll()
}