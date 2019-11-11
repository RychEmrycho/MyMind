package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.CategoryDao
import com.rychemrycho.app.mymind.data.local.entity.Category
import io.reactivex.Flowable

class CategoryRepository constructor(private val categoryDao: CategoryDao){
    fun findAll(): Flowable<List<Category>> {
        return categoryDao.findAll()
    }

    fun findAllByName(name: String): Flowable<List<Category>> {
        return categoryDao.findAllByName(name)
    }

    fun store(category: Category): Long {
        return categoryDao.insert(category)
    }

    fun update(category: Category) {
        categoryDao.update(category)
    }

    fun delete(category: Category) {
        categoryDao.delete(category)
    }

    fun deleteAll() {
        categoryDao.deleteAll()
    }
}