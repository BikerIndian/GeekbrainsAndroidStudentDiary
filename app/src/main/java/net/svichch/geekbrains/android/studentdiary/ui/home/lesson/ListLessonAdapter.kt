package net.svichch.geekbrains.android.studentdiary.ui.home.lesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.svichch.geekbrains.android.studentdiary.databinding.HomeLessonItemBinding

class ListLessonAdapter(private val list: List<Lesson>) :
    RecyclerView.Adapter<ListLessonAdapter.ViewHolder>() {

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
        private val binding: HomeLessonItemBinding = HomeLessonItemBinding.inflate(
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

            }
        }
    }

}