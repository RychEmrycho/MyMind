package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "table_color_item_join",
    primaryKeys = ["colorId", "itemId"],
    foreignKeys = [
        ForeignKey(
            entity = Color::class,
            parentColumns = ["colorId"],
            childColumns = ["colorId"]
        ),
        ForeignKey(
            entity = Item::class,
            parentColumns = ["itemId"],
            childColumns = ["itemId"]
        )
    ]
)
data class ColorItemJoin (
    var colorId: Long,
    var itemId: Long
)