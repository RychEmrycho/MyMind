package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.FileDao
import com.rychemrycho.app.mymind.data.local.entity.File
import io.reactivex.Flowable

class FileRepository constructor(private val fileDao: FileDao) {
    fun findAll(): Flowable<List<File>> {
        return fileDao.findAll()
    }

    fun findAllByName(name: String): Flowable<List<File>> {
        return fileDao.findAllByName(name)
    }

    fun store(file: File): Long {
        return fileDao.insert(file)
    }

    fun update(file: File) {
        fileDao.update(file)
    }

    fun delete(file: File) {
        fileDao.delete(file)
    }

    fun deleteAll() {
        fileDao.deleteAll()
    }
}