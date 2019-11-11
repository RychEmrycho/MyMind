package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_categories")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var categoryId: Long,
    var categoryName: String
)