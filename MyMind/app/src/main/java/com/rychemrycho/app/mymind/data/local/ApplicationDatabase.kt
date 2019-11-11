package com.rychemrycho.app.mymind.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.rychemrycho.app.mymind.data.local.dao.*
import com.rychemrycho.app.mymind.data.local.entity.*
import com.rychemrycho.app.mymind.data.local.util.DateConverter

@Database(
    entities = [
        Category::class,
        Color::class,
        ColorItemJoin::class,
        File::class,
        Item::class,
        Link::class,
        Tag::class,
        TagItemJoin::class
    ],
    version = 1,
    exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class ApplicationDatabase: RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun colorDao(): ColorDao
    abstract fun fileDao(): FileDao
    abstract fun linkDao(): LinkDao
    abstract fun itemDao(): ItemDao
    abstract fun tagDao(): TagDao
}