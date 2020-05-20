package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Flip {
    const val FLIP = "FLIP"
    const val FLIP_IN_X = "FLIP_IN_X"
    const val FLIP_IN_Y = "FLIP_IN_Y"
    const val FLIP_OUT_X = "FLIP_OUT_X"
    const val FLIP_OUT_Y = "FLIP_OUT_Y"

    fun inX(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotationX", 90f, -15f, 15f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inY(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotationY", 90f, -15f, 15f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outX(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotationX", 0f, 90f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outY(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotationY", 0f, 90f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

}