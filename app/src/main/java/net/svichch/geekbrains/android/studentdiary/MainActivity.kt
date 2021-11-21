package net.svichch.geekbrains.android.studentdiary

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import net.svichch.geekbrains.android.studentdiary.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {


    // tab titles
    private val titles = arrayOf("Уроки ", "Расписание")
    private val tabNumbers: Array<Int> = arrayOf(
        R.drawable.ic_home,
        R.drawable.ic_schedule
    )

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {

        binding.viewPager.adapter = ViewPagerAdapter(this, titles.size)
        // отключение прокрутки
        binding.viewPager.isUserInputEnabled = false

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = titles[position]
            tab.setIcon(tabNumbers[position])

        }.attach()

    }
}