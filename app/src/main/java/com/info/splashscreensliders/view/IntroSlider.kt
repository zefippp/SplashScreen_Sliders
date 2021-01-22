package com.info.splashscreensliders.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.info.splashscreensliders.R
import com.info.splashscreensliders.fragments.IntroSliderFirst
import com.info.splashscreensliders.fragments.IntroSliderSecond
import com.info.splashscreensliders.presenter.MainActivityPresenter
import com.info.splashscreensliders.presenter.MainPresenter

class IntroSlider : AppCompatActivity(),
    View.OnClickListener,
    IntroSliderView {
    private var presenter: MainPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_slider)
        presenter = MainPresenter(this)
        presenter!!.addFragment(IntroSliderFirst())
    }

    override fun setFragment(fragment: Fragment?) {
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flIntroSlider, fragment)
                .commit()
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnToNext -> presenter!!.addFragment(IntroSliderSecond())
        }
    }
}