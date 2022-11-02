public class Main {
    public static void main(String[] args) {
        int Age = 18;
        System.out.println("Задание 1:");
        if (Age >= 18){
            System.out.println("Поздравляем с совершеннолетием!");
        } else{
            System.out.println("Поздравим тебя с совершеннолетием чуть позже.");
        }

        System.out.println(" ");

        System.out.println("Задание 2:");
        if (7 <= Age && Age < 18){
            System.out.println("Ребенок ходит в школу.");
        } else if (18 <= Age && Age < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else{
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        System.out.println(" ");

        int Limit = 102;
        int SeatsLimit = 60;
        int People = 40;
        System.out.println("Задание 3:");
        if (People < SeatsLimit){
            System.out.println("Ещё можно сесть.");
        } else if(SeatsLimit <= People && People < Limit){
            System.out.println("Остались только стоячие места.");
        } else {
            System.out.println("Мест нет!");
        }

        System.out.println(" ");

        Age = 10;
        System.out.println("Задание 4:");
        System.out.print("Тебе " + Age + " лет. ");
        if (Age <= 1) {
            System.out.println("Расти.");
        } else if (2 <= Age && Age <= 6){
            System.out.println("Иди в детский сад.");
        } else if(7 <= Age && Age <= 18){
            System.out.println("Иди в школу.");
        } else if(19 <= Age && Age <= 23){
            System.out.println("Иди в университет.");
        } else {
            System.out.println("Иди работать.");
        }

        System.out.println(" ");

        System.out.println("Задание 5:");
        System.out.print("Тебе " + Age + " лет. ");
        if (Age <= 4) {
            System.out.println("Тебе вообще нельзя кататься на аттракционах.");
        } else if (5 <= Age && Age <= 13){
            System.out.println("Кататься можно, но только в сопровождении взрослого.");
        } else {
            System.out.println("Можешь кататься один.");
        }

        System.out.println(" ");

        System.out.println("Задание 6:");
        int One = 1;
        int Two = 2;
        int Three = 3;
        int Max;
        if (One > Two) {
            Max = One;
        } else {
            Max = Two;
        }
        if (Three > Max) {
            Max = Three;
        }
        System.out.println("Число " + Max + " наибольшее.");
    }
}