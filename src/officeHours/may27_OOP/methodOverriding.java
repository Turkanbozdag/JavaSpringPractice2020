package officeHours.may27_OOP;

public class methodOverriding {
    public void method1() {
        System.out.println("Super class");

    }
}

    class Test extends methodOverriding {
        @Override
        public void method1() {//method overriding oldu yandaki ok sembaol yukardan geldigini gosteriyo

            System.out.println("Sub class");

        }

        public static void main(String[] args) {
            methodOverriding obj= new methodOverriding();
            obj.method1();//nerede cagiriyoruz SUPER CLASS DA CAGIRIYOZ

        }

    }

