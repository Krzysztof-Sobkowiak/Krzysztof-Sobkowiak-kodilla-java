package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain{
    public static void main(String[] args){
        Forum forum = new Forum();
        Map<Integer,ForumUser> forumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (Period.between(forumUser.getBirthDate(),LocalDate.now()).getYears()) >= 20)
                .filter(forumUser -> forumUser.getPostQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        System.out.println("Actual Date:" + LocalDate.now() + "\nElements size: " + forumUsers.size());
        forumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        /*    BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

               People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

         PoemBeautifier poemBeautifier = new PoemBeautifier();

        String textBeautification1 = "The secret is in simplicity:";
        String textBeautification2 = "Don't praise the day before sunset";
        String text1 = poemBeautifier.beautify(textBeautification1, decorationText -> decorationText.toUpperCase());
        System.out.println(text1);
        String text2 = poemBeautifier.beautify(textBeautification1, decorationText -> decorationText.toLowerCase());
        System.out.println(text2);
        String text3 = poemBeautifier.beautify(textBeautification1, decorationText -> decorationText.concat(" It is always true."));
        System.out.println(text3);
        String text4 = poemBeautifier.beautify(textBeautification2, decorationText -> decorationText.replace('s', 'S'));
        System.out.println(text4);
        String text5 = poemBeautifier.beautify(textBeautification2, decorationText -> decorationText.replaceFirst("Don","DON"));
        System.out.println(text5);
        String text6 = poemBeautifier.beautify(textBeautification2, decorationText -> decorationText.replaceAll("t","ties"));
        System.out.println(text6);
        System.out.println("\n=================================================================================================\n");

          ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, ( a, b ) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, ( a, b ) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, ( a, b ) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, ( a, b ) -> a / b);

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\n=================================================================================================\n");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/
    }
}
