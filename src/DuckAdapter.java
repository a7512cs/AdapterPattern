//Adapter
public class DuckAdapter implements Penguins {// �Q���n�l�ӷ���Z
    //�Q��Adaptee �ӷ�Target

    Duck gDuck;//Adaptee

    public DuckAdapter(Duck pDuck) {
        this.gDuck = pDuck;
    }

    public void Penguin_gobble() {
        gDuck.Duck_quack(); // �]�����O�s�A�ҥH�����ե�Duck������k�A�N��²��F�I
        System.out.println("���C�n���I\n"); //
    }

    public void Penguin_walk() {
        gDuck.Duck_walk();
        System.out.println("�ͻH�V�U���ȡA���k�n�\�I\n"); //
    }
}
