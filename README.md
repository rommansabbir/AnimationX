[![Release](https://jitpack.io/v/jitpack/android-example.svg)](https://jitpack.io/#rommansabbir/AnimationX)
# AnimationX
An simple & awesome animation library written in Kotlin for Android

## Screenshots

![Success](https://i.imgur.com/LHDIqmU.gif)

## Documentation

### Installation
---
Step 1. Add the JitPack repository to your build file s

```gradle
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.rommansabbir:AnimationX:{Version}'
	}
```

---

### Version available

| Releases
| ------------- |
| 2.0           |

### Whats new in this version?
- Added Animation Listener
- Performance Improved


# Usages
        /**
         * Animation can be applied to all views which extends [View]
         * Just call the extension function's according to your requirement
         * To show animation according to your requirement, call the extension function & pass the animation key
         */
         

        /**
        * To show attention animation, call [animationXAttention] & pass the animation key
        */
            imageView.animationXAttention(Attention.ATTENTION_BOUNCE, duration = 500, listener = object : Animator.AnimatorListener{
                override fun onAnimationStart(p0: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationEnd(p0: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationCancel(p0: Animator?) {
                    TODO("Not yet implemented")
                }

                override fun onAnimationRepeat(p0: Animator?) {
                    TODO("Not yet implemented")
                }

            })


        /**
        * To show bounce animation, call [animationXBounce] & pass the animation key
        */
        imageView.animationXBounce(Bounce.BOUNCE_IN)
            

        /**
        * To show fade animation, call [animationXFade] & pass the animation key
        */
        imageView.animationXFade(Fade.FADE_IN_DOWN)
        

        /**
        * To show flip animation, call [animationXFlip] & pass the animation key
        */
        imageView.animationXFlip(Flip.FLIP_IN_X)
            

        /**
        * To show rotate animation, call [animationXRotate] & pass the animation key
        */
        imageView.animationXRotate(Rotate.ROTATE_IN)


        /**
        * To show slide animation, call [animationXSlide] & pass the animation key
        */
        imageView.animationXSlide(Slide.SLIDE_IN_DOWN)


        
        /**
        * To show zoom animation, call [animationXZoom] & pass the animation key
        */
        imageView.animationXZoom(Zoom.ZOOM_IN_DOWN)
        

        /**
         * On the other hand, if you want to show animation manually
         */
         AnimationX().setDuration(2000)
         .setAnimation(Attention.bounce(imageView, AnimationX().getNewAnimatorSet())).start()



## Animations

Default value for `duration` is `1000 Milliseconds`.

| Class Name  |             |             |             |             |             |		  |
| ----------- | ----------- | ----------- | ----------- | ----------- | ----------- | ----------- |
| `Attention` | `Bounce`    | `Fade`      | `Flip   `   | `Rotate`    | `Slide`     | `Zoom`      |

### Attention

| `Attention`       |                    |  		      |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `ATTENTION_BOUNCE`|<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/1-attention-bounce.c6335f3d.gif">| `ATTENTION_FLASH`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/2-attention-flash.27fb56e5.gif">|
| `ATTENTION_PULSE`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/3-attention-pulse.ee6d1fae.gif">| `ATTENTION_RUBERBAND`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/4-attention-ruberband.a701fa5b.gif">|
| `ATTENTION_SHAKE`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/5-attention-shake.62d9243a.gif">| `ATTENTION_STAND_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/6-attention-standup.553e1945.gif">|
| `ATTENTION_SWING`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/7-attention-swing.602dd7aa.gif">| `ATTENTION_TA_DA`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/8-attention-tada.faa9f3c1.gif">|
| `ATTENTION_WAVE`            |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/9-attention-wave.9a37979d.gif">| `Wobble`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/10-attention-wobble.42ac8c56.gif">|

### Bounce

| `Bounce`	    |                    |       	      |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `BOUNCE_IN_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/15-bounce-in-down.6aad1cbd.gif">| `BOUNCE_IN_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/13-bounce-in-up.7a1d7c17.gif">|
| `BOUNCE_IN_LEFT`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/11-bounce-in-left.ebc9bc0f.gif">| `BOUNCE_IN_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/12-bounce-in-right.a66d3b31.gif">|
| `BOUNCE_IN`           |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/14-bounce-in.2ef584a6.gif">	|		|		|

### Fade

| `Fade`            |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `FADE_IN_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/18-fade-in-down.24e645e6.gif">| `FADE_IN_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/19-fade-in-up.a2b79fa7.gif">|
| `FADE_IN_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/16-fade-in-left.6e93da17.gif">| `FADE_IN_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/17-fade-in-right.59345f8c.gif">|
| `FADE_OUT_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/22-fade-out-down.4f4ebc27.gif">| `FADE_OUT_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/25-fade-out-up.75f60e2d.gif">|
| `FADE_OUT_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/20-fade-out-left.7f1583e0.gif">| `FADE_OUT_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/21-fade-out-right.ff6adf09.gif">|
| `FADE_IN`               |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/23-fade-in.532822b1.gif">| `FADE_OUT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/24-fade-out.a3ee0d3a.gif">|

### Flip

| `Flip`            |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `FLIP_IN_X`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/26-flip-in-x.1de9f264.gif">| `FLIP_IN_Y`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/27-flip-in-y.8f45c5e1.gif">|
| `FLIP_OUT_X`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/28-flip-out-x.09be8ac3.gif">| `FLIP_OUT_Y`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/29-flip-out-y.f5c532a8.gif">|

### Rotate

| `Rotate`          |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `ROTATE_IN_DOWN_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/30-rotate-in-down-left.cdd124aa.gif">| `ROTATE_IN_DOWN_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/31-rotate-in-down-right.f0693f8b.gif">|
| `ROTATE_IN_UP_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/32-rotate-in-up-left.f818146d.gif">| `ROTATE_IN_UP_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/33-rotate-in-up-right.537606e2.gif">|
| `ROTATE_OUT_DOWN_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/34-rotate-out-down-left.de06d895.gif">| `ROTATE_OUT_DOWN_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/35-rotate-out-down-right.f4505ac5.gif">|
| `ROTATE_OUT_UP_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/39-rotate-up-left.de13c028.gif">| `ROTATE_OUT_UP_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/36-rotate-out-up-right.ddb7df75.gif">|
| `ROTATE_IN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/37-rotate-in.08924c36.gif">| `ROTATE_OUT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/38-rotate-out.b127d7a8.gif">|

### Slide

| `Slide`           |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `SLIDE_IN_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/40-slide-in-down.efa18709.gif">| `SLIDE_IN_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/43-slide-in-up.0f918432.gif">|
| `SLIDE_IN_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/41-slide-in-left.da5a9127.gif">| `SLIDE_IN_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/42-slide-in-right.f0e33c31.gif">|
| `SLIDE_OUT_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/44-slide-out-down.269616ff.gif">| `SLIDE_OUT_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/47-slide-out-up.7efa439e.gif">|
| `SLIDE_OUT_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/45-slide-out-left.4226eca7.gif">| `SLIDE_OUT_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/46-slide-out-right.f283b64b.gif">|

### Zoom

| `Zoom`            |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `ZOOM_IN_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/48-zoom-in-down.6e41a799.gif">| `ZOOM_IN_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/51-zoom-in-up.40e3a26e.gif">|
| `ZOOM_IN_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/49-zoom-in-left.82604bb4.gif">| `ZOOM_IN_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/50-zoom-in-right.a419ab92.gif">|
| `ZOOM_OUT_DOWN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/52-zoom-out-down.cb3ee254.gif">| `ZOOM_OUT_UP`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/57-zoom-out-up.0c74d038.gif">|
| `ZOOM_OUT_LEFT`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/53-zoom-out-left.79cb419d.gif">| `ZOOM_OUT_RIGHT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/54-zoom-out-right.7a3ac74d.gif">|
| `ZOOM_IN`          |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/55-zoom-in.1c0c5d5a.gif">| `ZOOM_OUT`              |<img width="200" alt="portfolio_view" src="https://gayanvoice.github.io/android-animations/static/media/56-zoom-out.f0c52b21.gif">|
---
##### This library has been developed based on [daimajia/AndroidViewAnimations](https://github.com/daimajia/AndroidViewAnimations)

### Contact me
[Portfolio](https://www.rommansabbir.com/) | [LinkedIn](https://www.linkedin.com/in/rommansabbir/) | [Twitter](https://www.twitter.com/itzrommansabbir/) | [Facebook](https://www.facebook.com/itzrommansabbir/)

### License
---
[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

````
Copyright (C) 2020 Romman Sabbir

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````


