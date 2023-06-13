package com.example.quiz;


public class QuestionAnswer {

    public static String question[] = {
            "Android is ?",
            "APK stands for ?",
            "What is an activity in android?",
            "NDK stands for?",
            "Which of the layer is the lowest layer of android architecture"
    };

    public static String choices[][] = {
            {"operating system", "web browser", "web server", "None of the above"},
            {"Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above"},
            {"android class", "android package", "A single screen in an application with supporting java code", "None of the above"},
            {"Native Development Kit", "New Development kit", "Native Design Kit", "None of the above"},
            {"System Libraries and Android Runtime","Linux Kernel","Applications","Applications Framework"}
    };

    public static String correctAnswers[] = {
            "operating system",
            "Android Package Kit",
            "A single screen in an application with supporting java code",
            "Native Development Kit",
            "Linux Kernel"
    };
}

