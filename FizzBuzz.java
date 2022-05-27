class Main {

    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            String str = "";

            // ここから記述
            if(i%3==0){
                if(i%5==0)  str="FizzBuzz";
                else        str="Fizz";
            }
            else if(i%5==0) str="Buzz";
            else str= String.valueOf(i);
            // ここまで記述

            System.out.println(str);
        }
    }
}
