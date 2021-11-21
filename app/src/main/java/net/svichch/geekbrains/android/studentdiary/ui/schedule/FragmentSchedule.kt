package net.svichch.geekbrains.android.studentdiary.ui.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.svichch.geekbrains.android.studentdiary.data.DataLesson
import net.svichch.geekbrains.android.studentdiary.databinding.FragmentScheduleBinding


class FragmentSchedule : Fragment() {

    private lateinit var binding: FragmentScheduleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ScheduleLessonAdapter(DataLesson().getLessons())
        binding.scheduleRecycler.adapter = adapter
    }

}