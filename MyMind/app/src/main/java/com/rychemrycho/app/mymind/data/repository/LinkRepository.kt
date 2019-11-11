package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.LinkDao
import com.rychemrycho.app.mymind.data.local.entity.Link
import io.reactivex.Flowable

class LinkRepository constructor(private val linkDao: LinkDao) {
    fun findAll(): Flowable<List<Link>> {
        return linkDao.findAll()
    }

    fun findAllByLabel(name: String): Flowable<List<Link>> {
        return linkDao.findAllByLabel(name)
    }

    fun store(link: Link): Long {
        return linkDao.insert(link)
    }

    fun update(link: Link) {
        linkDao.update(link)
    }

    fun delete(link: Link) {
        linkDao.delete(link)
    }

    fun deleteAll() {
        linkDao.deleteAll()
    }
}