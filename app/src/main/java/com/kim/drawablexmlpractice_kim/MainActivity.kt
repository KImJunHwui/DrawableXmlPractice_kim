package com.kim.drawablexmlpractice_kim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        기본액션바를 불러내자

        val defaultActionBar = supportActionBar!!

//        모드를 커스텀 지원으로 변경

        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

//        실제로 어떤 커스텀 뷰를 사용할 지 설정

        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)
//        커스톰 뷰를 들고 있는 툴바를 변수로 지정

        val toolbar = defaultActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0,0)
    }
}