package com.example.amphibiansapp.data

import com.example.amphibiansapp.model.Amphibian
import com.example.amphibiansapp.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibiansRepository(private val apiService: AmphibiansApiService) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = apiService.getAmphibians()
}