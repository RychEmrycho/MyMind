package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "table_files",
    foreignKeys = [
        ForeignKey(
            entity = Item::class,
            parentColumns = ["itemId"],
            childColumns = ["itemId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class File (
    @PrimaryKey(autoGenerate = true)
    var fileId: Long,
    var fileName: String,
    var fileExtension: String,
    var fileType: String,
    var filePath: String,
    var itemId: Long
)