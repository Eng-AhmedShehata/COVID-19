package com.ashehata.covid_19.showSummary

import com.ashehata.covid_19.models.SummaryResponse
import kotlinx.coroutines.Deferred

interface SummaryRepository {

    suspend fun getSummary(): SummaryResponse
}