package com.leandro.artbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Art::class], version = 1, exportSchema = true)
abstract class ArtDatabase: RoomDatabase() {
    abstract fun artDao(): ArtDao
}