package com.okihita.jun30codinginflowtraining.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.okihita.jun30codinginflowtraining.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    private val galleryVM by viewModels<GalleryViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        galleryVM.photos.observe(viewLifecycleOwner) {
            Log.d("Xena", "onViewCreated: Hello")
        }
    }
}