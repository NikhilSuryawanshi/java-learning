import java.util.Arrays;
import java.io.FileReader;  
public class Sum{

public static void fileReader(String path) throws Exception
{ 
      FileReader fr=new FileReader(path);    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
}


public static void main(String[] ar)
{
    // int result=0;
for (String s: ar){
    // result+=Integer.parseInt(s);
    try{
        fileReader(s);
    }catch(Exception e)
    {

    }

}
    // System.out.println(result);

}

}