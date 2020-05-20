package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup

object Slide {
    const val SLIDE = "SLIDE"
    const val SLIDE_IN_DOWN = "SLIDE_IN_DOWN"
    const val SLIDE_IN_UP = "SLIDE_IN_UP"
    const val SLIDE_IN_LEFT = "SLIDE_IN_LEFT"
    const val SLIDE_IN_RIGHT = "SLIDE_IN_RIGHT"
    const val SLIDE_OUT_DOWN = "SLIDE_OUT_DOWN"
    const val SLIDE_OUT_UP = "SLIDE_OUT_UP"
    const val SLIDE_OUT_LEFT = "SLIDE_OUT_LEFT"
    const val SLIDE_OUT_RIGHT = "SLIDE_OUT_RIGHT"

    fun inDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val distance = (view.top + view.height).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", -distance, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", -distance, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", distance, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", distance, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, distance)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val right = view.right.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, -right)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, distance)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val bottom = -view.bottom.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, bottom)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}