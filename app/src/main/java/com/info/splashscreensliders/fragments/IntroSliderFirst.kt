package com.info.splashscreensliders.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.info.splashscreensliders.view.IntroSlider
import com.info.splashscreensliders.R

class IntroSliderFirst : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var introSlider = activity as IntroSlider

        val inflate = inflater.inflate(R.layout.listen_to_your_messages, null)
        inflate.findViewById<Button>(R.id.btnToNext).setOnClickListener { view -> introSlider.onClick(view) }
        return inflate
    }
}