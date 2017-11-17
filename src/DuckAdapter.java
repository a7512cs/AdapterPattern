//Adapter
public class DuckAdapter implements Penguins {// 想用鴨子來當企鵝
    //想用Adaptee 來當Target

    Duck gDuck;//Adaptee

    public DuckAdapter(Duck pDuck) {
        this.gDuck = pDuck;
    }

    public void Penguin_gobble() {
        gDuck.Duck_quack(); // 因為都是叫，所以直接調用Duck中的方法，就很簡單了！
        System.out.println("壓低聲音！\n"); //
    }

    public void Penguin_walk() {
        gDuck.Duck_walk();
        System.out.println("翅膀向下伸值，左右搖擺！\n"); //
    }
}
