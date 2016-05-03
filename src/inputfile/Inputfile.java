
package inputfile;

import java.io.*;
import java.util.*;
public class Inputfile {
    private Formatter x;
    private Scanner y;
    
    public void create_writefile(){
        int check=2;
        int var=1;
        try {//changed
            x = new Formatter("in.txt");
            x.format("%s","\n");
            x.format("%s %s %s",11,2,3);
            x.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("oops!");
        }
    }
    public String[] read(){
        String arr[]=new String[3];
        try {
            y = new Scanner(new File("C:\\Users\\suranihiranyada\\My Documents\\input.txt"));
            int i=0;
            while(y.hasNext()){
                String a = y.next();
                System.out.println(a);
                arr[i]=a;
                i++;
            }
        } catch (FileNotFoundException ex) {
           System.out.println("no");
        }
        
    return arr;    
    }
    public static void main(String[] args) {
        Inputfile is = new Inputfile();
        File c=new File("C:\\Users\\suranihiranyada\\My Documents\\input.txt");
        if(c.exists())
            System.out.println(c.getName());
        is.create_writefile();
        String arr[]=is.read();
        for (String x:arr){
            System.out.println(x);
        }
    }
    
}
