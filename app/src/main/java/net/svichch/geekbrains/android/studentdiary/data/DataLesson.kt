package net.svichch.geekbrains.android.studentdiary.data

import net.svichch.geekbrains.android.studentdiary.R

class DataLesson {

    private val lessons = mutableListOf<Lesson>()
    private val icon = mutableListOf<Int>()
    private val lessonsName = mutableListOf<Int>()

    fun getLessons(): List<Lesson> {
        lessons.add(Lesson(1, "8:00", "8:45","Кляпка Оксана"))
        lessons.add(Lesson(2, "9:00", "9:45","Банкова Александра"))
        lessons.add(Lesson(3, "10:00", "10:45","Жигарева Ольга"))
        lessons.add(Lesson(4, "11:00", "11:45","Куприянова Елена"))
        lessons.add(Lesson(5, "12:00", "12:45","Рахимбаева Ширин"))
        lessons.add(Lesson(6, "13:00", "13:45","Соловьева Ольга"))

        return lessons
    }

    fun getLessonsName(name: Int): Int {
        lessonsName.add(R.string.lesson_name_algebra)
        lessonsName.add(R.string.lesson_name_biology)
        lessonsName.add(R.string.lesson_name_drawing)
        lessonsName.add(R.string.lesson_name_chemistry)
        lessonsName.add(R.string.lesson_name_geography)
        lessonsName.add(R.string.lesson_name_history)
        lessonsName.add(R.string.lesson_name_literature)
        lessonsName.add(R.string.lesson_name_mathematics)
        lessonsName.add(R.string.lesson_name_music)
        lessonsName.add(R.string.lesson_name_physical)
        lessonsName.add(R.string.lesson_name_physics)
        lessonsName.add(R.string.lesson_name_technology)
        return lessonsName[name]
    }

    fun getIcon(name: Int): Int {
        icon.add(R.drawable.algebra)
        icon.add(R.drawable.biology)
        icon.add(R.drawable.drawing)
        icon.add(R.drawable.chemistry)
        icon.add(R.drawable.geography)
        icon.add(R.drawable.history)
        icon.add(R.drawable.literature)
        icon.add(R.drawable.mathematics)
        icon.add(R.drawable.music)
        icon.add(R.drawable.physical)
        icon.add(R.drawable.physics)
        icon.add(R.drawable.technology)
        return icon[name]
    }

    /*
    algebra  — алгебра
    biology  — Биология
    drawing — Рисование
    chemistry  — Химия
    geography — География
    geometry — Геометрия
    history  — История
    literature  — Литература
    mathematics   — Математика
    music — Музыка
    physical  — Физкультура
    physics — Физика
    technology — Труды
    */

}