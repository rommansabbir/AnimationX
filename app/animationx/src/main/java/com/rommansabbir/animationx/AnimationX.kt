package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.view.animation.AccelerateInterpolator

class AnimationX {
    private var animatorSetX = AnimatorSet()
    private var du: Long = 1000
    private lateinit var animatorSet: AnimatorSet

    fun setAnimation(animatorSet: AnimatorSet): AnimationX {
        this.animatorSet = animatorSet
        return this
    }

    fun setDuration(duration: Long): AnimationX {
        this.du = duration
        return this
    }

    fun start(): AnimationX {
        animatorSet.duration = du
        animatorSet.interpolator = AccelerateInterpolator()
        animatorSet.start()
        return this
    }

    fun getNewAnimatorSet() = animatorSetX
}