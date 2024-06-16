package ru.netology;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Николай";
        post.patronymic = "Игоревич";
        post.surname = "Гунько";
        post.passport = "4444 № 44444444";
        post.phone = "+7(999)999-99-99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        }
    }