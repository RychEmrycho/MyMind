package com.rychemrycho.app.mymind.data.local.util

import androidx.room.TypeConverter
import java.util.*

object DateConverter {
    @TypeConverter
    @JvmStatic
    fun timestampToDate(value: Long): Date ? {
        return Date(value)
    }

    @TypeConverter
    @JvmStatic
    fun dateToTimestamp(date: Date): Long ? {
        return date.time
    }
}