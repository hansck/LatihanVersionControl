package Controller;
import java.util.ArrayList;
import Model.*;

public class Controller {
    private Dummy dummy = new Dummy();

    public String showPost(String idPost){        
        String result = "test";
        // ArrayList <Post> post = new ArrayList<>();
        if(dummy.posts.equals(idPost)){
            result = "ada";            
        } else{
            result = "tidak ada id post";
        }           
        return result;
    }
}

    