import java.util.ArrayList;

public class MaxAndMin{
    public static ArrayList<Comparable> maxAndMin(ArrayList<Comparable> list) throws ShortListException{
        ArrayList<Comparable> out = new ArrayList<Comparable>();
        if (list.size() < 2) throw new ShortListException();
        if(list.get(0).compareTo(list.get(1)) < 0){
            out.add(list.get(0));
            out.add(list.get(1));
        }else{
            out.add(list.get(1));
            out.add(list.get(0));
        }
        for (int i = 2; i < list.size(); i++){
            if(out.get(0).compareTo(list.get(i)) > 0) out.set(0, list.get(i));
            if(out.get(1).compareTo(list.get(i)) < 0) out.set(1, list.get(i));
        }
        return out;
    }
}