package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
            val que1 = Question(
                1,"What country does this flag belong to ?",
                R.drawable.img,
                "Argentina ","Australia ","Armenia ","Austria ",
                1

            )
            questionsList.add(que1)

        val que2 = Question(
            1,"What country does this flag belong to ?",
            R.drawable.img_1,
            "Angola ","Austria ","Australia ","Armenia ",
            3

        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to ?",
            R.drawable.img_3,
            "Belarus ","Belize ","Brunei ","Brazil ",
            4

        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to ?",
            R.drawable.img_2,
            "Bahamas ","Belgium ","Barbados ","Belize ",
            2

        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to ?",
            R.drawable.img_5,
            "Gabon ","France ","Fiji ","Finland ",
            3

        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to ?",
            R.drawable.img_6,
            "Germany ","Greece ","Georgia ","None of these ",
            1

        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to ?",
            R.drawable.img_4,
            "Dominica ","Egypt ","Denmark ","Ethiopia ",
            3

        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to ?",
            R.drawable.img_7,
            "Ireland ","Iran ","Hungary ","India ",
            4

        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to ?",
            R.drawable.img_9,
            "New Zealand ","Jordan ","Sudan ","Palestine ",
            1

        )
        questionsList.add(que9)



            return questionsList
        }
    }

