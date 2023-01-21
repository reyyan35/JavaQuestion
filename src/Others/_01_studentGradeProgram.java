package Others;

import java.util.Scanner;

public class _01_studentGradeProgram {
    public static void main(String[] args) {
        //  Write a code of a student for exam grade.
        //  Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        //  The program will read three different grades (visa, mid-term, and final). Please obey to following conditions.
        //  if average "Grade" >=90% =>Grade=A
        //  if average "Grade" >= 70% ve<90% => Grade=B
        //  if average "Grade" >=50% ve <70% =>Grade=C
        //  if average "Grade" <50% =>Grade=F
        //  Aşağıdaki örnek çıktıya bakın:
        //  int Quiz_score: 80
        //  int mid-term_score: 68
        //  int Final_score: 90
        //  print (Your grade is B)
        //  (Notunuz B'dir)

        Scanner read = new Scanner(System.in);
        System.out.print("Please Enter Quiz Grade = ");
        double quiz = read.nextDouble();
        System.out.print("Please Enter Mid-term Grade = ");
        double midterm = read.nextDouble();
        System.out.print("Plase Enter Final Grtande = ");
        double ffinal = read.nextDouble();

        int ortalama = (int) ((quiz + midterm + ffinal) / 3);

        if (ortalama >= 90) {
            System.out.println("Student Grade is = 'A' and" + " Average is = " + ortalama);
        } else {
            if (ortalama >= 70) {
                System.out.println("Student Grade is = 'B' and" + " Average is = " +ortalama);
            } else {
                if (ortalama >= 50) {
                    System.out.println("Student Grade is = 'C' and" + " Average is = " +ortalama);
                } else {
                    System.out.println("Student Grade is = 'F' and" + " Average is = " +ortalama);
                }
            }
        }
    }
}
