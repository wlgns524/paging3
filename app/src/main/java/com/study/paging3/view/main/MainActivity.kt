package com.study.paging3.view.main

import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.activity.viewModels
import com.study.paging3.R
import com.study.paging3.databinding.ActivityMainBinding
import com.study.paging3.view.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResId: Int = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()

    private var doubleBackToExitPressedOnce = false

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.finishAffinity()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "뒤로가기를 한번 더 누를 시 종료됩니다", Toast.LENGTH_SHORT).show()
        Handler(Looper.getMainLooper()).postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }
}
