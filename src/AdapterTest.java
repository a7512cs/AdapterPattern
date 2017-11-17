
public class AdapterTest {

    public static void main(String[] args) {// �Q���n�l�ӷ���Z

        // ���ݬݤ@�������n�l
        MallardDuck duck = new MallardDuck(); // �n�R�Ʀ����Z���n�l�I
        System.out.println("\n\n�n�l�i�ܡG\n");
        duck.Duck_quack();
        duck.Duck_walk();

        // �s�n�l��W���Z�M��
        Penguins duckAdapter = new DuckAdapter(duck); // �s�n�l��W���Z�M��(�౵��)
        System.out.println("\n\n���ˬO���Z���n�l�i�ܡG");
        testPenguin(duckAdapter);

        // ���������Z
        KingPenguins penguin = new KingPenguins();
        System.out.println("\n\n������Z�i�ܡG");
        testPenguin(penguin);
    }

    private static void testPenguin(Penguins FakeDuck) {
        FakeDuck.Penguin_gobble();
        FakeDuck.Penguin_walk();
    }

}
