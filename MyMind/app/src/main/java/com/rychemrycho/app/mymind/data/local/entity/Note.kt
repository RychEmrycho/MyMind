package com.rychemrycho.app.mymind.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_note")
data class Note(@PrimaryKey(autoGenerate = true) var noteId: Long, var title: String, var message: String)