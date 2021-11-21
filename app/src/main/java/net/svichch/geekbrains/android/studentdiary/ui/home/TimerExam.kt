package net.svichch.geekbrains.android.studentdiary.ui.home

import net.svichch.geekbrains.android.studentdiary.databinding.FragmentHomeBinding
import java.text.SimpleDateFormat
import java.util.*

class TimerExam(var binding: FragmentHomeBinding, var examDay: Calendar) : TimerTask() {
    var timer = binding.timer

    override fun run() {

        var long = examDay.timeInMillis - Date().time

        val simpleDateFormat = SimpleDateFormat(
            "dd:HH:mm", Locale.getDefault()
        )

        val strDate: String = simpleDateFormat.format(Date(long))
        val dateTime = strDate.split(":")
        val days = dateTime[0]
        val hour = dateTime[1]
        val minute = dateTime[2]
        binding.timer.textTimer.post(
            Runnable {
                timer.days1.text = days[0].toString()
                timer.days2.text = days[1].toString()
                timer.hour1.text = hour[0].toString()
                timer.hour2.text = hour[1].toString()
                timer.minute1.text = minute[0].toString()
                timer.minute2.text = minute[1].toString()
            }
        )
    }
}