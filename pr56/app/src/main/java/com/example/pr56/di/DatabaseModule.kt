package com.example.pr56.di

import android.content.Context
import androidx.room.Room
import com.example.pr56.data.local.AppDatabase
import com.example.pr56.data.local.MyDataDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, "my_database"
        ).build()
    }

    @Provides
    fun provideMyDataDao(db: AppDatabase): MyDataDao {
        return db.myDataDao()
    }
}