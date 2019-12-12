
public class MyLinkedList  implements  List{
    private static class Node {
        private int val;
        private Node prev;
        private Node next;

        private Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }

        private Node(int val, Node prev, Node next) {
            this(val);
            this.prev = prev;
            this.next = next
        }
    }
    @Override
    public boolean add(int element) {
        //尾插
        return add(size,element);
    }

    @Override
    public boolean add(int index, int element) {
        //把element插入到index位置处
        //@param index下标
        //@param element 元素
        //@return true代表成功，false失败
        //1、检查下标合法性
        if (index<0||index>size){
            System.out.println("下标不合法");
            return false;
        }
        //2、当index==0的时候，需要特殊处理，头插，head要变，要保持head指向头结点的属性
        if(index==0){
            //等号左边的head是新的head,右边的head是旧的head
            head=new
        }

        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int set(int index, int val) {
        return 0;
    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
