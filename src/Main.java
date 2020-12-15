public class Main {
    public static void main(String[] args)
    {
        int moneyAmount = 180;

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = true;
        boolean canByAnything = false;

        //boolean moneyEnoughForCappucino = moneyAmount >= cappucinoPrice;


        if (moneyAmount >= cappucinoPrice && isMilkEnough)
        {
            System.out.println("Вы можете купить капучино");
            canByAnything = true;
        }

        if (moneyAmount >= lattePrice && isMilkEnough)
        {
            System.out.println("Вы можете купить латте");
            canByAnything = true;
        }

        if (moneyAmount >= espressoPrice)
        {
            System.out.println("Вы можете купить еспрессо");
            canByAnything = true;
        }

        if (moneyAmount >= waterPrice)
        {
            System.out.println("Вы можете купить воду");
            canByAnything = true;
        }
/*
        if (!canByAnything) // (canByAnything == false)
        {
            System.out.println("Недостаточно средств");
        }
 */
        System.out.println(canByAnything ? "Выберите напиток" : "Недостаточно средств");

    }
}
