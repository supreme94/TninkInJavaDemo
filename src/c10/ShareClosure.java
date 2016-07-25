package c10;

import java.util.ArrayList;
import java.util.List;


interface Action
{
	int j = 11;
    void Run();
}

public class ShareClosure {

    List<Action> list = new ArrayList<Action>();
    
    public void Input()
    {
        for(int i=0;i<10;i++)
        {
             int copy = i;// effectively final 可不加final jdk1.8才有
            list.add(new Action() {    
            	
                @Override
                public void Run() {
                    System.out.println(copy);
                }
            });
        }
    }
    
    public void Output()
    {
        for(Action a : list){a.Run();}
    }
    
    public static void main(String[] args) {
        ShareClosure sc = new ShareClosure();
        sc.Input();
        sc.Output();

    }

}