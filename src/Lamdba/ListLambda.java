package Lamdba;
import java.util.ArrayList;
import java.util.List;
public class ListLambda {

    private List<Integer> list;

    public static void main(String[] args){

        ListLambda lambda = new ListLambda();

        lambda.list = new ArrayList<>();

        for(int i=0; i<10; i++){

            lambda.list.add(i);
        }


    }
}
