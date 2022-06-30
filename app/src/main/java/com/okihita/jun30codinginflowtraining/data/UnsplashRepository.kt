package com.okihita.jun30codinginflowtraining.data

import com.okihita.jun30codinginflowtraining.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(
    private val unsplashApi: UnsplashApi
) {
}