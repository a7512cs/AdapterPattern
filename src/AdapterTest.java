
public class AdapterTest {

    public static void main(String[] args) {// 想用鴨子來當企鵝

        // 先看看一隻正版鴨子
        MallardDuck duck = new MallardDuck(); // 要充數成企鵝的鴨子！
        System.out.println("\n\n鴨子展示：\n");
        duck.Duck_quack();
        duck.Duck_walk();

        // 叫鴨子穿上企鵝套裝
        Penguins duckAdapter = new DuckAdapter(duck); // 叫鴨子穿上企鵝套裝(轉接器)
        System.out.println("\n\n假裝是企鵝的鴨子展示：");
        testPenguin(duckAdapter);

        // 正版的企鵝
        KingPenguins penguin = new KingPenguins();
        System.out.println("\n\n國王企鵝展示：");
        testPenguin(penguin);
    }

    private static void testPenguin(Penguins FakeDuck) {
        FakeDuck.Penguin_gobble();
        FakeDuck.Penguin_walk();
    }

}
