package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "table_links",
    foreignKeys = [
        ForeignKey(
            entity = Item::class,
            parentColumns = ["itemId"],
            childColumns = ["itemId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Link (
    @PrimaryKey(autoGenerate = true)
    var linkId: Long,
    var linkLabel: String,
    var linkURL: String,
    var itemId: Long
)