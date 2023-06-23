package com.example.showcaseview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.showcaseview.databinding.ActivityMainBinding
import smartdevelop.ir.eram.showcaseviewlib.GuideView
import smartdevelop.ir.eram.showcaseviewlib.config.DismissType
import smartdevelop.ir.eram.showcaseviewlib.config.Gravity
import smartdevelop.ir.eram.showcaseviewlib.config.PointerType

class MainActivity : AppCompatActivity() {

    //variables
    private lateinit var mGuideView: GuideView
    private var builder: GuideView.Builder? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //set showcase
        setShowCase(binding.view11)
        mGuideView = builder!!.build()
        mGuideView.show()
    }

    private fun setShowCase(view1: View) {
        builder = GuideView.Builder(this)
            .setTitle((R.string.guide_test_1.toString()))
            .setContentText(getString(R.string.guide_description_text_1))
            .setGravity(Gravity.center)
            .setDismissType(DismissType.anywhere)
            .setPointerType(PointerType.circle)
            .setTargetView(view1)
            .setGuideListener { view: View ->
                when (view.id) {
                    R.id.view11 -> {
                        builder!!.setTitle(R.string.guide_test_2.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_2))
                        builder!!.setTargetView(binding.view22).build()
                    }
                    R.id.view22 -> {
                        builder!!.setTitle(R.string.guide_test_3.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_3))
                        builder!!.setTargetView(binding.view33).build()
                    }
                    R.id.view33 -> {
                        builder!!.setTitle(R.string.guide_test_4.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_4))
                        builder!!.setTargetView(binding.view44).build()
                    }
                    R.id.view44 -> {
                        builder!!.setTitle(R.string.guide_test_5.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_5))
                        builder!!.setTargetView(binding.view55).build()
                    }
                    R.id.view55 -> {
                        builder!!.setTitle(R.string.guide_test_6.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_6))
                        builder!!.setTargetView(binding.view66).build()
                    }
                    R.id.view66 -> {
                        builder!!.setTitle(R.string.guide_test_7.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_7))
                        builder!!.setTargetView(binding.view77).build()
                    }
                    R.id.view77 -> {
                        builder!!.setTitle(R.string.guide_test_8.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_8))
                        builder!!.setTargetView(binding.view88).build()
                    }
                    R.id.view88 -> {
                        builder!!.setTitle(R.string.guide_test_9.toString())
                        builder!!.setContentText(getString(R.string.guide_description_text_9))
                        builder!!.setTargetView(binding.view99).build()
                    }
                    R.id.view99 -> {
                        return@setGuideListener
                    }
                    else -> {
                        return@setGuideListener
                    }
                }
                mGuideView = builder!!.build()
                mGuideView.show()
            }
    }
}