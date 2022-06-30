package com.okihita.jun30codinginflowtraining.api

import com.okihita.jun30codinginflowtraining.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)