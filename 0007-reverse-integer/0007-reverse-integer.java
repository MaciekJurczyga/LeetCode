
class Solution {
    public static int reverse(int x) {
    int number = x;
    int answer = 0;
    int modulo;

    while (number !=0){
        if (answer > Integer.MAX_VALUE/10 || answer < Integer.MIN_VALUE/10){
            return 0;
        }
        modulo = number % 10;
        answer = answer * 10 + modulo;
        number = number/10;

    }


    return answer;

    }
    public static void main(String[] args){
        System.out.println(reverse(45));

    }
}