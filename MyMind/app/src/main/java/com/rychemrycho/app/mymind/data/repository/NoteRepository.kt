package com.rychemrycho.app.mymind.data.repository

import com.rychemrycho.app.mymind.data.local.dao.NoteDao
import com.rychemrycho.app.mymind.data.local.entity.Note
import io.reactivex.Flowable

class NoteRepository constructor(private var noteDao: NoteDao) {
    fun findAllNotes(): Flowable<List<Note>> {
        return noteDao.findAll()
    }

    fun findAllNotesByName(title: String): Flowable<List<Note>> {
        return noteDao.findAllByName(title)
    }

    fun insert(note: Note): Long {
        return noteDao.insert(note)
    }

    fun update(note: Note) {
        noteDao.update(note)
    }

    fun delete(note: Note) {
        noteDao.delete(note)
    }
}