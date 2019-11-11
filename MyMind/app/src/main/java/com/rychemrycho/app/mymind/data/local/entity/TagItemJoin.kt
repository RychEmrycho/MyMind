package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "table_tag_item_join",
    primaryKeys = ["tagId", "itemId"],
    foreignKeys = [
        ForeignKey(
            entity = Tag::class,
            parentColumns = ["tagId"],
            childColumns = ["tagId"]
        ),
        ForeignKey(
            entity = Item::class,
            parentColumns = ["itemId"],
            childColumns = ["itemId"]
        )
    ]
)
data class TagItemJoin (
    var tagId: Long,
    var itemId: Long
)