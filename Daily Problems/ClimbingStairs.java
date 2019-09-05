class ClimbingStairs {
    public static int climbing(int n) {

        if (n == 1) {
            return 1;
        }

        int [] answer = new int[n + 1];
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i <= n; i++) {
            answer[i] = answer[i -1] + answer[i - 2];
        }

        System.out.println("There are " + answer[n] + " possible combinations!");
        return answer[n];
    }

    public static void main(String[] args){
        climbing(6);
    }
}