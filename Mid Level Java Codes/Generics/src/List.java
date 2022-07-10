import java.util.Arrays;

public class List <Obj> {

    private Obj[] list;
    private int listSize = 0;

    public List() {
        this.list = (Obj[]) new Object[listSize];
    }

    public void add(Obj obj) {
        this.listSize += 1;
        this.list = Arrays.copyOf(list, list.length + 1);
        list[listSize - 1] = obj;
    }

    public String toString() {
        try{
            for (int i = 0; i < listSize; i++) {
                System.out.print(list[i] + " ");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Geçersiz index");
        }
        return null;
    }

    public void remove(int index) {

        try {
            list[index] = null;
            for (int i = 1, j = 0; i < list.length - index; i++, j++) {
                list[index + j] = list[index + i];
            }

            Obj[] listNew = (Obj[]) new Object[list.length - 1];

            for (int i = 0; i < list.length - 1; i++) {
                listNew[i] = list[i];
            }
            list = listNew;
            listSize = list.length;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geçersiz index");
        }
    }

    public Obj getIndex(int index) {

        try {
            return this.list[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geçersiz Index");
        }
        return null;
    }

    public int indexOf(Obj obj){

        for (int i = 0; i < listSize; i++) {
            if(obj.equals(list[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(list[0] == null){
            return true;
        }
        return false;
    }

    public int lastIndexOf(Obj obj){
        int temp = -1;
        for (int i = 0; i < listSize; i++) {
            if(list[i] == obj){
                temp = i;
            }
        }
        if(temp != -1){
            return temp;
        }
        return temp;
    }

    public void clear(){

        list = (Obj[]) new Object[0];

    }

    public Obj[] toArray(){
        return this.list;
    }

    public boolean contains(Obj obj){

        for (int i = 0; i < listSize; i++) {
            if(list[i] == obj){
                return true;
            }
        }
        return false;
    }

    public List<Obj> sublist(int start,int finish){

        List<Obj> sublist = new List<>();
        for (int i = start,j = 0; i < finish+1; j++,i++) {
            sublist.list[j] = this.list[i];
        }
        return sublist;
    }























}