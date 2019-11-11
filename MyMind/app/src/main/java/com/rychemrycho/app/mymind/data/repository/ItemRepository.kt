package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.ItemDao
import com.rychemrycho.app.mymind.data.local.entity.Item
import io.reactivex.Flowable

class ItemRepository constructor(private var itemDao: ItemDao) {
    fun findAll(): Flowable<List<Item>> {
        return itemDao.findAll()
    }

    fun findAllByName(title: String): Flowable<List<Item>> {
        return itemDao.findAllByName(title)
    }

    fun store(item: Item): Long {
        return itemDao.insert(item)
    }

    fun update(item: Item) {
        itemDao.update(item)
    }

    fun delete(item: Item) {
        itemDao.delete(item)
    }
}