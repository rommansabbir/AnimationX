package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Fade {
    const val FADE = "FADE"
    const val FADE_IN_DOWN = "FADE_IN_DOWN"
    const val FADE_IN_UP = "FADE_IN_UP"
    const val FADE_IN_LEFT = "FADE_IN_LEFT"
    const val FADE_IN_RIGHT = "FADE_IN_RIGHT"
    const val FADE_OUT_DOWN = "FADE_OUT_DOWN"
    const val FADE_OUT_UP = "FADE_OUT_UP"
    const val FADE_OUT_LEFT = "FADE_OUT_LEFT"
    const val FADE_OUT_RIGHT = "FADE_OUT_RIGHT"
    const val FADE_IN = "FADE_IN"
    const val FADE_OUT = "FADE_OUT"

    fun `in`(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun inLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = -view.width.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", width / 4f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = view.width.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", width / 4f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val height = view.height.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", height / 4f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val height = -view.height.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", height / 4f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun out(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun outLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = -view.width.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, width / 4f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = view.width.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", width / 4f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val height = view.height.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, height / 4f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val height = -view.height.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, height / 4f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}