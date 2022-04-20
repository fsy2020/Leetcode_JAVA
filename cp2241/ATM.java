package cp2241;

//设计一个ATM机器

public class ATM {
    long[][] money;

    public ATM() {
        money=new long[5][2];
        money[0][0]=20;money[1][0]=50;money[2][0]=100;money[3][0]=200;money[4][0]=500;
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            money[i][1] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] wd = new int[5];
        int i = 4;
        while (amount > 0 && i >= 0) {
            while (money[i][1] != 0 && money[i][0] <= amount) {
                long k = Math.min(amount / money[i][0], money[i][1]);
                money[i][1] -= k;
                wd[i] += k;
                amount -= money[i][0] * k;
            }
            i--;
        }

        if (amount == 0) {
            return wd;
        }
        deposit(wd);
        return new int[]{-1};
    }
}

