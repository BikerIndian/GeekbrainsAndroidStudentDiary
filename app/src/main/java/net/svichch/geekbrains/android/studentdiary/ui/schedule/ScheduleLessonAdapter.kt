package net.svichch.geekbrains.android.studentdiary.ui.schedule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.svichch.geekbrains.android.studentdiary.data.DataLesson
import net.svichch.geekbrains.android.studentdiary.data.Lesson
import net.svichch.geekbrains.android.studentdiary.databinding.ScheduleLessonItemBinding

class ScheduleLessonAdapter(private val list: List<Lesson>) :
    RecyclerView.Adapter<ScheduleLessonAdapter.ViewHolder>() {

    var dataLesson = DataLesson()

    // Размер списка
    override fun getItemCount() = list.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    // Позиция
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(
        parent: ViewGroup,
        private val binding: ScheduleLessonItemBinding = ScheduleLessonItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
    ) : RecyclerView.ViewHolder(
        binding.root
    ) {

        fun bind(lesson: Lesson) {
            with(binding) {

                title.setText(dataLesson.getLessonsName(lesson.name))
                imageIcon.setImageResource(dataLesson.getIcon(lesson.name))
                dateStart.text = lesson.dateStart
                dateStop.text = lesson.dateStop
                textTeacher.text = lesson.teacher
            }
        }
    }

}