package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Attention  {
    const val ATTENTION = "ATTENTION"
    const val ATTENTION_BOUNCE = "ATTENTION_BOUNCE"
    const val ATTENTION_FLASH = "ATTENTION_FLASH"
    const val ATTENTION_PULSE = "ATTENTION_PULSE"
    const val ATTENTION_RUBERBAND = "ATTENTION_RUBERBAND"
    const val ATTENTION_SHAKE = "ATTENTION_SHAKE"
    const val ATTENTION_STAND_UP = "ATTENTION_STAND_UP"
    const val ATTENTION_SWING = "ATTENTION_SWING"
    const val ATTENTION_TA_DA = "ATTENTION_TA_DA"
    const val ATTENTION_WAVE = "ATTENTION_WAVE"
    const val ATTENTION_WOBBLE = "ATTENTION_WOBBLE"

    fun bounce(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "translationY", 0f, 0f, -30f, 0f, -15f, 0f, 0f)
        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun flash(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 1f, 0f, 1f)
        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun pulse(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.1f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.1f, 1f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun ruberBand(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.25f, 0.75f, 1.15f, 1f)
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.75f, 1.25f, 0.85f, 1f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun shake(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.25f, 0.75f, 1.15f, 1f)
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.75f, 1.25f, 0.85f, 1f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun standUp(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x =
            ((view.width - view.paddingLeft - view.paddingRight) / 2 + view.paddingLeft).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x, x, x, x)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y, y, y, y)
        val object3: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "rotationX", 55f, -30f, 15f, -15f, 0f)
        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun swing(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "rotation", 0f, 10f, -10f, 6f, -6f, 3f, -3f, 0f)
        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun taDa(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(
            view,
            "scaleX",
            1f,
            0.9f,
            0.9f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1f
        )
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(
            view,
            "scaleY",
            1f,
            0.9f,
            0.9f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1f
        )
        val object3: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "rotation", 0f, -3f, -3f, 3f, -3f, 3f, -3f, 3f, -3f, 0f)
        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun wave(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x =
            ((view.width - view.paddingLeft - view.paddingRight) / 2 + view.paddingLeft).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "rotation", 12f, -12f, 3f, -3f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x, x, x, x)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y, y, y, y)
        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun wobble(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val width = (view.width).toFloat()
        val one = (width / 100.0).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(
            view,
            "translationX",
            0f * one,
            -25f * one,
            20f * one,
            -15f * one,
            10f * one,
            -5f * one,
            0f * one,
            0f
        )
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(view, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}
