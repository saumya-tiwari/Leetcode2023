package String;
import java.util.*;

class Main{
    public static void main(String[] args) {
        String path = "/./";

        var dirs = new ArrayList<String>();
        
        for(var dir :  path.split("/")){
            if(dir.isEmpty() || dir.equals(".")){
                continue;
            }

            if(dir.equals("..")){
                if(!dirs.isEmpty()){
                    dirs.remove(dirs.size() - 1);
                }
            }else{
                dirs.add(dir);
            }
        }

        System.out.println("/" + String.join("/",dirs));

    }
}