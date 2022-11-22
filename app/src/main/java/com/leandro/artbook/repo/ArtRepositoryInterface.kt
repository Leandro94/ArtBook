package com.leandro.artbook.repo

import androidx.lifecycle.LiveData
import com.leandro.artbook.model.ImageResponse
import com.leandro.artbook.roomdb.Art
import com.leandro.artbook.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    suspend fun searchImage(imageString: String): Resource<ImageResponse>
}