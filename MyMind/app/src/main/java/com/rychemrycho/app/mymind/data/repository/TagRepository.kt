package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.TagDao
import com.rychemrycho.app.mymind.data.local.entity.Tag
import io.reactivex.Flowable

class TagRepository constructor(private val tagDao: TagDao) {
    fun findAll(): Flowable<List<Tag>> {
        return tagDao.findAll()
    }

    fun findAllByLabel(name: String): Flowable<List<Tag>> {
        return tagDao.findAllByLabel(name)
    }

    fun store(tag: Tag): Long {
        return tagDao.insert(tag)
    }

    fun update(tag: Tag) {
        tagDao.update(tag)
    }

    fun delete(tag: Tag) {
        tagDao.delete(tag)
    }

    fun deleteAll() {
        tagDao.deleteAll()
    }
}