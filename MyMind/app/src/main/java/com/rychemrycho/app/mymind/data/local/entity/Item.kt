package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "table_items",
    foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = ["categoryId"],
            childColumns = ["categoryId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Item (
    @PrimaryKey(autoGenerate = true)
    var itemId: Long,
    var title: String,
    var message: String,
    var timeStart: Date,
    var timeEnd: Date,
    var categoryId: Long,
    var hasFile: Boolean,
    var hasLink: Boolean
)