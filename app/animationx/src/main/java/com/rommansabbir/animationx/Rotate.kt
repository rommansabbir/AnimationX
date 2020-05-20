package com.rommansabbir.animationx

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Rotate {
    const val ROTATE = "ROTATE"
    const val ROTATE_IN_DOWN_LEFT = "ROTATE_IN_DOWN_LEFT"
    const val ROTATE_IN_DOWN_RIGHT = "ROTATE_IN_DOWN_RIGHT"
    const val ROTATE_IN_UP_LEFT = "ROTATE_IN_UP_LEFT"
    const val ROTATE_IN_UP_RIGHT = "ROTATE_IN_UP_RIGHT"
    const val ROTATE_OUT_DOWN_LEFT = "ROTATE_OUT_DOWN_LEFT"
    const val ROTATE_OUT_DOWN_RIGHT = "ROTATE_OUT_DOWN_RIGHT"
    const val ROTATE_OUT_UP_LEFT = "ROTATE_OUT_UP_LEFT"
    const val ROTATE_OUT_UP_RIGHT = "ROTATE_OUT_UP_RIGHT"
    const val ROTATE_IN = "ROTATE_IN"
    const val ROTATE_OUT = "ROTATE_OUT"

    fun `in`(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -200f, 0f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun inDownLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun inDownRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 90f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun inUpLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = view.height - view.paddingBottom.toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 90f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun inUpRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun out(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 200f)
        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun outDownLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }


    fun outDownRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun outUpLeft(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = (view.paddingLeft).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

    fun outUpRight(view: View, animatorSet: AnimatorSet): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()
        val object1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val object2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val object3 = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4 = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        animatorSet.playTogether(object1, object2, object3, object4)
        return animatorSet
    }

}