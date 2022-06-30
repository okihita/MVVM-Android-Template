package com.okihita.jun30codinginflowtraining.ui.gallery

import androidx.lifecycle.ViewModel
import com.okihita.jun30codinginflowtraining.data.UnsplashRepository
import javax.inject.Inject

class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {
}