package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.ColorDao
import com.rychemrycho.app.mymind.data.local.entity.Color
import io.reactivex.Flowable

class ColorRepository constructor(private val colorDao: ColorDao) {
    fun findAll(): Flowable<List<Color>> {
        return colorDao.findAll()
    }

    fun findAllByCode(code: String): Flowable<List<Color>> {
        return colorDao.findAllByCode(code)
    }

    fun store(color: Color): Long {
        return colorDao.insert(color)
    }

    fun update(color: Color) {
        colorDao.update(color)
    }

    fun delete(color: Color) {
        colorDao.delete(color)
    }

    fun deleteAll() {
        colorDao.deleteAll()
    }
}