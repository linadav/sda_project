package lt.sdacademy.advancedfeatures.object;

public class Pocket {
    private int money;
    static int sum;
    public Pocket (int money){
        this.money = money;
        sum = sum + money;
    }

    public int getMoney(){
        if (this.money < 10) {
            System.out.println("Pinigu nebera!");
            return 0;
        }
        return money;
    }

    public void setMoney(int newMoney){
        if (newMoney>3000 || newMoney<0 ){
            System.out.println("netinkama suma!");
            money = 0;
        }else {
            money = money+newMoney;
        }

    }
}
