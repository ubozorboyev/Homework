package hu.andersen.task

import android.os.Bundle
import androidx.activity.ComponentActivity
import hu.andersen.task.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding



    private val intPrimitive :Int = 12
    private var intNonPrimitive: Int? = 12

    private val shortPrimitive :Short = 100
    private var shortNonPrimitive: Short? = null

    // others also like above example


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)



    }
}

