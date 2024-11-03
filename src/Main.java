public class Main {
    public static void main(String[] args) {
 //Задача 1

    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

 //Задача 2

    dog = dog + 4;
    cat = cat + 4;
    paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

 //Задача 3

    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

//Задача 4

    var friend = 19;
        System.out.println(friend);
    friend = friend + 2;
        System.out.println(friend);
    friend = friend / 7;
        System.out.println(friend);

//Задача 5

    var frog = 3.5;
        System.out.println(frog);
    frog = frog * 10;
        System.out.println(frog);
    frog = frog / 3.5;
        System.out.println(frog);
    frog = frog + 4;
        System.out.println(frog);

//Задача 6

    var boxerFirst = 78.2;
    var boxerSecond = 82.7;
    var commonWeight = boxerFirst + boxerSecond;
    var weightDifference = boxerSecond - boxerFirst;
        System.out.println("Общая масса двух боксеров " + commonWeight + " кг и разница между массами бойцов " + weightDifference + " кг");

//Задача 7

    var weightFirst = 78.2;
    var weightSecond = 82.7;
    var remainderDivision = weightSecond % weightFirst;
        System.out.println("Остаток от деления между двумя весами " + remainderDivision);

//Задача 8

    var commonWorkHours = 640;
    var workDayHours = 8;
    var commonWorkers = commonWorkHours / workDayHours;
        System.out.println("Всего работников в компании - " + commonWorkers);
    var newNumberWorkers = commonWorkers + 94;
    float newWorkHours = commonWorkHours / (float) newNumberWorkers;
        System.out.println("Если в компании работает " + newNumberWorkers + " человека, то всего " + newWorkHours + " часа работы может быть поделено между сотрудниками");

    }
}