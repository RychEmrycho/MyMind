package com.rychemrycho.app.mymind.di.module

import androidx.room.Room
import com.rychemrycho.app.mymind.base.BaseApplication
import com.rychemrycho.app.mymind.data.local.ApplicationDatabase
import com.rychemrycho.app.mymind.data.local.dao.*
import com.rychemrycho.app.mymind.data.repository.*
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
    fun provideItemDao(applicationDatabase: ApplicationDatabase): ItemDao {
        return applicationDatabase.itemDao()
    }

    @Provides
    @Singleton
    fun provideItemRepository(itemDao: ItemDao): ItemRepository {
        return ItemRepository(itemDao)
    }

    @Provides
    @Singleton
    fun provideCategoryDao(applicationDatabase: ApplicationDatabase): CategoryDao {
        return applicationDatabase.categoryDao()
    }

    @Provides
    @Singleton
    fun provideCategoryRepository(categoryDao: CategoryDao): CategoryRepository {
        return CategoryRepository(categoryDao)
    }

    @Provides
    @Singleton
    fun provideColorDao(applicationDatabase: ApplicationDatabase): ColorDao {
        return applicationDatabase.colorDao()
    }

    @Provides
    @Singleton
    fun provideColorRepository(colorDao: ColorDao): ColorRepository {
        return ColorRepository(colorDao)
    }

    @Provides
    @Singleton
    fun provideFileDao(applicationDatabase: ApplicationDatabase): FileDao {
        return applicationDatabase.fileDao()
    }

    @Provides
    @Singleton
    fun provideFileRepository(fileDao: FileDao): FileRepository {
        return FileRepository(fileDao)
    }

    @Provides
    @Singleton
    fun provideLinkDao(applicationDatabase: ApplicationDatabase): LinkDao {
        return applicationDatabase.linkDao()
    }

    @Provides
    @Singleton
    fun provideLinkRepository(linkDao: LinkDao): LinkRepository {
        return LinkRepository(linkDao)
    }

    @Provides
    @Singleton
    fun provideTagDao(applicationDatabase: ApplicationDatabase): TagDao {
        return applicationDatabase.tagDao()
    }

    @Provides
    @Singleton
    fun provideTagRepository(tagDao: TagDao): TagRepository {
        return TagRepository(tagDao)
    }
}