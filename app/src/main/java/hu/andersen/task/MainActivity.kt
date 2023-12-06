package hu.andersen.task

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import hu.andersen.task.databinding.ActivityMainBinding
import hu.andersen.task.extentions.load


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    private val imageUrl = "https://www.optimum.com/sites/default/files/2023-08/android.jpg"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnAndroid.setOnClickListener {
            binding.androidImage.load(imageUrl)

        }

        binding.btnApple.setOnClickListener {
            binding.appleImage.load(R.drawable.apple)
        }

        binding.btnOrange.setOnClickListener {
            binding.orangeImage.load("file:///android_asset/orange/orange.jpg")

        }

        binding.btnBanana.setOnClickListener {
            binding.bananaImage.load(R.raw.banana)
        }

    }

    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        val istr = assets.open(fileName)
        val bitmap = BitmapFactory.decodeStream(istr)
        istr.close()
        return bitmap
    }

}

