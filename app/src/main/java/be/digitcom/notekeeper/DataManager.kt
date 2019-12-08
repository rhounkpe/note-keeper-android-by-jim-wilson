package be.digitcom.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourse()
    }

    private fun initializeCourse() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java fundamentals: The Java Langage", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}