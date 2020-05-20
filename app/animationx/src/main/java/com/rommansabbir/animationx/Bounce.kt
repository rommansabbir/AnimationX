package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Bounce {
    const val BOUNCE = "BOUNCE"
    const val BOUNCE_IN_DOWN = "BOUNCE_IN_DOWN"
    const val BOUNCE_IN_UP = "BOUNCE_IN_UP"
    const val BOUNCE_IN_LEFT = "BOUNCE_IN_LEFT"
    const val BOUNCE_IN_RIGHT = "BOUNCE_IN_RIGHT"
    const val BOUNCE_IN = "BOUNCE_IN"

    fun `in`(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.05f, 0.9f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.05f, 0.9f, 1f)
        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun inLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = -view.width.toFloat()
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "translationX", width, 30f, -10f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = -view.width.toFloat()
        val measuredWidth = -view.measuredWidth.toFloat()
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "translationX", measuredWidth + width, -30f, 10f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val measuredHeight = view.measuredHeight.toFloat()
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "translationY", measuredHeight, -30f, 10f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val height = -view.height.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "translationY", height, 30f, -10f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}