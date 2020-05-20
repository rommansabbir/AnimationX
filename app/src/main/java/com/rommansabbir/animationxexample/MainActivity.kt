package com.rommansabbir.animationxexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rommansabbir.animationx.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Animation can be applied to all views which extends [View]
         * Just call the extension function's according to your requirement
         * To show animation according to your requirement, call the extension function & pass the animation key
         */

        attentionBtn.setOnClickListener {

            /**
             * To show attention animation, call [animationXAttention] & pass the animation key
             */
            imageView.animationXAttention(Attention.ATTENTION_BOUNCE)
        }

        bounceBtn.setOnClickListener {
            /**
             * To show bounce animation, call [animationXBounce] & pass the animation key
             */
            imageView.animationXBounce(Bounce.BOUNCE_IN)
        }

        fadeBtn.setOnClickListener {
            /**
             * To show fade animation, call [animationXFade] & pass the animation key
             */
            imageView.animationXFade(Fade.FADE_IN_DOWN)
        }

        flipBtn.setOnClickListener {
            /**
             * To show flip animation, call [animationXFlip] & pass the animation key
             */
            imageView.animationXFlip(Flip.FLIP_IN_X)
        }

        rotateBtn.setOnClickListener {
            /**
             * To show rotate animation, call [animationXRotate] & pass the animation key
             */
            imageView.animationXRotate(Rotate.ROTATE_IN)
        }

        slideBtn.setOnClickListener {
            /**
             * To show slide animation, call [animationXSlide] & pass the animation key
             */
            imageView.animationXSlide(Slide.SLIDE_IN_DOWN)
        }

        zoomBtn.setOnClickListener {
            /**
             * To show zoom animation, call [animationXZoom] & pass the animation key
             */
            imageView.animationXZoom(Zoom.ZOOM_IN_DOWN)
        }

        /**
         * On the other hand, if you want to show animation manually
         */
        AnimationX.setDuration(2000)
            .setAnimation(Attention.bounce(imageView, AnimationX.getNewAnimatorSet())).start()
    }
}
