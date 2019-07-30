[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)

![Discord](https://img.shields.io/discord/580991094993453056.svg?style=flat-square)
![Wiki Info](https://img.shields.io/badge/Wiki-kaane.miraheze.org-informational.svg)

# KAaNE [AE]
Keep Assisting and Nobody Explodes [Android Edition]

The KTaNE assistant app for Androids.

# Notes

There is **NO** APK available yet. I will build and sign one whenever there's something at least ready. If you _really_ want to try this on your phone, download Android Studio, download the project, open it in Android Studio, and follow [this guide.](https://developer.android.com/studio/run/)

This app is **NOT** available on the Google Play Store. Even after I make an APK available, I'll most likely release it on the store when the first beta build is out. I'll also have to pay a $25 license and I'm not planning on putting ads, so that's another reason why I'm not going to release it there for a while. I'm also not sure how lengthy their verification process is.

**This does not yet request for permission, but you absolutely need to give it Storage permission (for settings). You can do this by doing the following:**

**1. Open the Settings app**

**2. Tap Apps or Application Manager**

**3. Tap "KAaNE [AE]"**

**4. Tap Permissions**

**5. Turn ON Storage**

**If you don't turn this on, it will crash upon pressing "Bomb Settings" and any other module that uses edgework.**

The only thing done currently is the bomb settings, a temporary home screen, and proper navigation. Everything else is a placeholder for future screens.

Config file is found in `Downloads/kaane-ae-/config.properties`. This will be changed whenever I figure out how to make a proper directory without Android freaking out.

Rotating the screen will reset you back to the home screen.

Images in the bomb settings might look a bit odd. This is because images on apps uses "vectors" instead of regular images (and as of right now I have no idea how to just use normal images). The current solution to this was to make an exact vector of the image (turning each pixel into a square). For whatever reason, the android image renderer flips out because of this and makes the images look bad. Once I figure out how to use normal images, I'll fix this up.

If you have a small screen, the bomb settings might have cropped text. You can easily fix this by rotating your screen or by using an emulator.

## Contribute

If you want to help development, make a pull request with your changes.

## Further Info

Further info can be found in the wiki. [Here's a link.](https://kaane.miraheze.org/wiki/Main_Page)

NOTE: There's currently no info on the wiki.

There's also now an official discord server which can be joined using [this link.](https://discord.gg/SdaFUAm)

## License

This project is licensed under the terms of the GNU General Public License.
