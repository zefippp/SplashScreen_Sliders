package com.info.splashscreensliders.presenter

import androidx.fragment.app.Fragment
import com.info.splashscreensliders.view.IntroSliderView

class MainPresenter(private val view: IntroSliderView?) : MainActivityPresenter {
    override fun addFragment(fragment: Fragment?) {
        view?.setFragment(fragment)
    }
}