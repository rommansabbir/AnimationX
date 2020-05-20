package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup

object Zoom {
    const val ZOOM = "ZOOM"
    const val ZOOM_IN_DOWN = "ZOOM_IN_DOWN"
    const val ZOOM_IN_UP = "ZOOM_IN_UP"
    const val ZOOM_IN_LEFT = "ZOOM_IN_LEFT"
    const val ZOOM_IN_RIGHT = "ZOOM_IN_RIGHT"
    const val ZOOM_OUT_LEFT = "ZOOM_OUT_LEFT"
    const val ZOOM_OUT_RIGHT = "ZOOM_OUT_RIGHT"
    const val ZOOM_OUT_UP = "ZOOM_OUT_UP"
    const val ZOOM_OUT_DOWN = "ZOOM_OUT_DOWN"
    const val ZOOM_IN = "ZOOM_IN"
    const val ZOOM_OUT = "ZOOM_OUT"

    fun `in`(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.45f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.45f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun inDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val bottom = -view.bottom.toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "translationY", bottom, 60f, 0f)
        val object4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun inLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val right = -view.right.toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "translationX", right, 48f, 0f)
        val object4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun inRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = -view.width.toFloat()
        val right = -view.paddingRight.toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "translationX", width + right, -48f, 0f)
        val object4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun inUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.475f, 1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 0.475f, 1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationY", distance, -60f, 0f)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun out(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.3f, 0f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.3f, 0f)
        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun outDown(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationY", 0f, -60f, distance)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }


    fun outLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val right = -view.right.toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationX", 0f, 42f, right)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun outRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - parent.left).toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationX", 0f, -42f, distance)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun outUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val bottom = -view.bottom.toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.475f, 0.1f)
        val object3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.475f, 0.1f)
        val object4 = ObjectAnimator.ofFloat(view, "translationY", 0f, 60f, bottom)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }
}