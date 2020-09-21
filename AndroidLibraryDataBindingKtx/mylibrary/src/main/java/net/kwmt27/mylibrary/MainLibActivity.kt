package net.kwmt27.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wada811.databinding.dataBinding
import net.kwmt27.mylibrary.databinding.ActivityMainLibBinding

class MainLibActivity : AppCompatActivity() {

    private val binding: ActivityMainLibBinding by dataBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lib)

        binding.textview.text = "Sample"
    }
}
