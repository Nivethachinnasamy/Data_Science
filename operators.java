import java.util.*;
public class operators{
    public static void main(String[] args){
        //if statement example 1
    boolean isRaining= false;
    if(isRaining){
        System.out.println("Umberlla needed");
    }
    //example2
    boolean Raining= true;
    if(Raining){
        System.out.println("Umberlla needed");
    }
    //example3
    int temperature=33;
    if(temperature>25){
        System.out.println("It's hot outside");
    }
    //example4
    int temper=19;
    if(temper>25){
        System.out.println("It's hot outside");
    }
    //checking equality
    //example5
    int x=100;
    if(x==100){
        System.out.println("x is equal to 100");
    }
    //example6
    int y=50;
    if(y==100){
        System.out.println("x is equal to 100");
    }
    //using with logical operators
    //example7
    int numb =25;
    if(numb>=20&& numb<=30){
        System.out.println("You are in you 20's");
    }
    //if else statement
    //example8
    int num=10;
    if(num>0){
        System.out.println("+ve");
    }
    else{
        System.out.println("Not +ve");
    }
    //example9
    int number= -3;
    if(number>0){
        System.out.println("+ve");
    }
    else{
        System.out.println("Not +ve");
    }
    //with different conditions
    //example10
    int age=16;
    if(age>18){
        System.out.println("Eligible for voting");
    }
    else{
        System.out.println("Not eligible for voting ");
    }
    //example11
    int voteage = 26;
    if(voteage>18){
        System.out.println("Eligible for voting");
    }
    else{
        System.out.println("Not eligible for voting ");
    }
    //example with logical operator
    //example12
    int temperaturre=30;
    if(temperaturre>=25 && temperaturre<=35){
        System.out.println("Warm day");
    }
    else{
        System.out.println("Not warm");
    }
    //example13
    int temperaturee=17;
    if(temperaturee>=25 && temperaturee<=35){
        System.out.println("Warm day");
    }
    else{
        System.out.println("Not warm");
    }
    //example14
    int marks=85;
    if(marks>=90){
        System.out.println("A");
    }
    else if(marks>=70) {
        System.out.println("C");
    }
    else if(marks>=60) {
        System.out.println("D");
    }
    else{
        System.out.println("F");
    }
    //example15
    //age=25, if condition age less than 13-child or age more than 13 to 20-teenager or more than 20 to 60- adult or senior citizen
    int agee=25;
    if(agee<13){
        System.out.println("Child");
    }
    else if(agee>13 && agee<20){
        System.out.println("Teenager");
    }
    else if(agee>=20 && agee<60){
        System.out.println("Adult");
    }
    else{
        System.out.println("Senior cititze");
    }
    //example16
    //comparing to find the  largest number
    int a=5;
    int b=7;
    int c=8;
    if(a>b && a>c){
        System.out.println("largest number:"+a);
    }
    else if(b>a && b>c){
        System.out.println("largest number:"+b);
    }
    else if(c>a && c>b) {
        System.out.println("largest number:"+c);
    }
    //nested if
    //example17 
    //age more than 18 and in if they should have voter id
    int agge=25;
    boolean voterid=true;
    if(agge>18){
        System.out.println("Agewise Eligible");
        if(voterid=false){
            System.out.println("Eligible");

        }else{
            System.out.println("Not Eligible since no voter id");
        }
    }
    else{
        System.out.println("agewise not eligible ");
    }
    //switch statement
    //example18
    int day=3;
    switch(day){
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        default:
        System.out.println("Sunday");
    }
    //example19
    char grade;
    switch(grade = 'B'){
        case 'A':
        System.out.println("A");
        break;
        case 'B':
        System.out.println("B");
        break;
    }
    //enhanced switch statement
    //example 20
        int days=3;
    String daysname=switch(days)
    {
        case 1->"Monday";
        case 2-> "Tuesday";
        case 3->"Wednesday";
        case 4->"Thursday";
        case 5->"Friday";
        case 6->"Saturday";
        case 7->"Sunday";
        default->"Invalid";
    };
        System.out.println(daysname);
        //example21
        int dayss=2;
        switch (dayss)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            default:
            System.out.println("Unknown day");
        
        }
        //example 22
        //ternary operator
        int nums=10;
        String result=(nums%2==0)?"Even":"Odd";
        System.out.println(result);
    //example 23
    //for loop
    for(int i=1; i<=5;i++){
        System.out.println("Number"+i);
    }
//while loop
//example 24
    int i=1;
    while(i<=5){
        System.out.println("number"+i);
        i++;
    }
    //do while loop-block is executed at least one
    //example 25
    int j=1;
    do{
        System.out.println("Number"+j);
        j++;
    }while(j<=5);
    //example 26
    //nested loops
    
    for(int k=1;k<=5;k++){
        for(int h=1;h<=5;h++){
            System.out.print(k*h +"\t");
        }
        System.out.println();
    }
        //example 27
        //break and continue
        for(int n=1;n<=10;n++){
            if(n==5){
                continue;
            } 
            if(n==8){
                break;
            }
            System.out.println("number"+n);
        }
        //28
        //switch with wrapper class
        int numbers=10;
        switch(numbers){
            case 5:
            System.out.println("number is 5");
            break;
            case 6:
            System.out.println("number is 10");
            break;
            default:
            System.out.println("Unknown number");
        }
        //29
        //multiplication tables
        int s=5;
        for(int r=1 ; r<=10 ;r++)
        {
            System.out.println(r+"*"+s+"="+r*s);
        }
        
        //30
        //printing vowels
        char alphabet ='e';
        if(alphabet =='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
