package homeWork3

object QuizStorage {
    fun getQuiz(locale: Locale): Quiz = when (locale) {
        Locale.Ru -> quizRu
        Locale.En -> quizEn
    }

    fun answer(quiz: Quiz, answers: List<Int>): String = quiz
        .questions
        .zip(answers) { question, index -> question.feedback[index] }
        .joinToString(separator = " ")

    enum class Locale {
        Ru, En
    }

    private val quizRu = object : Quiz {
        override val questions: List<Question> = listOf(
            Question(
                question = "Как тебе наш Android курс?",
                answers = listOf(
                    "на 2",
                    "на 3",
                    "на 4",
                    "на 5",
                ),
                feedback = listOf(
                    "Вам не нравится наш курс.",
                    "Вас удовлетворяет наш курс.",
                    "Вы оценили наш курс хорошо.",
                    "Вы оценили наш курс отлично.",
                ),
            ),
            Question(
                question = "Порекомендуешь его друзьям?",
                answers = listOf(
                    "Обзательно",
                    "Уже порекомендовал",
                    "Посмотрим, что будет дальше",
                    "Нет",
                ),
                feedback = listOf(
                    "Вы готовы порекомендовать наш курс.",
                    "Вы уже порекомендовали курс своим друзьям.",
                    "Вам нужно больше времени, чтобы порекомендовать наш курс.",
                    "Вы не готовы рекомендовать наш курс.",
                ),
            ),
            Question(
                question = "Пользовался ли ты обратной связью?",
                answers = listOf(
                    "Да",
                    "Еще нет, но сейчас воспользуюсь",
                    "Нет, еще не приходилось",
                    "Нет, и не буду",
                ),
                feedback = listOf(
                    "Спасибо за обратную связь!",
                    "Спасибо за обратную связь!",
                    "Ждем вашу обратную связь!",
                    "Мы надеемся, что у вас пояится возможность дать нам обратную связь.",
                ),
            ),
        )
    }


    private val quizEn = object : Quiz {
        override val questions: List<Question> = listOf(
            Question(
                question = "Please, Rate Android course?",
                answers = listOf(
                    "F",
                    "C",
                    "B",
                    "A++",
                ),
                feedback = listOf(
                    "You have rated us F",
                    "You have rated us C",
                    "You have rated us B",
                    "You have rated us A++",
                ),
            ),
            Question(
                question = "Do you want to recommend us to your friends?",
                answers = listOf(
                    "Sure",
                    "Already recommend",
                    "I don't know",
                    "No",
                ),
                feedback = listOf(
                    "You want to recommend our course",
                    "You already recommend our course",
                    "You need more time for make recommendations",
                    "You are not ready to recommendations",
                ),
            ),
            Question(
                question = "Did you use the course feedback?",
                answers = listOf(
                    "Yes",
                    "Not yet, but now I will use it",
                    "No, it hasn't happened yet",
                    "No, and I won't",
                ),
                feedback = listOf(
                    "Thanks for feedback!",
                    "Thanks for feedback!",
                    "Waiting for your feedback!",
                    "We hope you will have the opportunity to give us feedback",
                ),
            ),
        )
    }
}