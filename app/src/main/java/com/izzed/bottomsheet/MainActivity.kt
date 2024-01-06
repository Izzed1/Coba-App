package com.izzed.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.izzed.bottomsheet.databinding.ActivityMainBinding
import com.izzed.bottomsheet.databinding.ActivityPaymentSuccessBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var sheetBinding: ActivityPaymentSuccessBinding
    private lateinit var dialog: BottomSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        sheetBinding = ActivityPaymentSuccessBinding.inflate(layoutInflater)
        dialog = BottomSheetDialog(this, R.style.BottomSheetTheme)
        dialog.setContentView(sheetBinding.root)

        binding.btnBuyNow.setOnClickListener {
            dialog.show()
        }
    }
}