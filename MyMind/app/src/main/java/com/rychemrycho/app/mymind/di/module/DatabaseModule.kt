package com.rychemrycho.app.mymind.di.module

import androidx.room.Room
import com.rychemrycho.app.mymind.base.BaseApplication
import com.rychemrycho.app.mymind.data.local.ApplicationDatabase
import com.rychemrycho.app.mymind.data.local.dao.NoteDao
import com.rychemrycho.app.mymind.data.repository.NoteRepository
import com.rychemrycho.app.mymind.util.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DatabaseModule {
    @Provides
    @Singleton
    fun provideApplicationDatabase(baseApplication: BaseApplication): ApplicationDatabase {
        return Room.databaseBuilder(baseApplication, ApplicationDatabase::class.java, Constants.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNoteDao(applicationDatabase: ApplicationDatabase): NoteDao {
        return applicationDatabase.noteDao()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(noteDao: NoteDao): NoteRepository {
        return NoteRepository(noteDao)
    }
}