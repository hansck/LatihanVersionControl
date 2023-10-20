package Controller;
import Model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Dummy {
    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Dummy(){                         
        posts.add(new Post("Post1", ContentState.ARCHIVED, LocalDateTime.of(2023, 1, 1, 10, 0, 0), ContentType.PICTURE));
        posts.add(new Post("Post2", ContentState.SHOWED, LocalDateTime.of(2023, 1, 1, 11, 0, 0), ContentType.VIDEO));
        posts.add(new Post("Post3", ContentState.DELETED, LocalDateTime.of(2023, 1, 2, 12, 0, 0), ContentType.PICTURE));
        posts.add(new Post("Post4", ContentState.PINNED, LocalDateTime.of(2023, 1, 1, 13, 0, 0), ContentType.PICTURE));
        posts.add(new Post("Post5", ContentState.SHOWED, LocalDateTime.of(2023, 1, 1, 14, 0, 0), ContentType.VIDEO));
        posts.add(new Post("Post6", ContentState.DELETED, LocalDateTime.of(2023, 1, 1, 15, 0, 0), ContentType.PICTURE));
        posts.add(new Post("Post7", ContentState.PINNED, LocalDateTime.of(2023, 1, 1, 16, 0, 0), ContentType.PICTURE));
        posts.add(new Post("Post8", ContentState.ARCHIVED, LocalDateTime.of(2023, 1, 1, 17, 0, 0), ContentType.VIDEO)); 
        
        User user1 = new User("User1", "Greg", "greg", "Halo namaku Greg");
        User user2 = new User("User2", "Jerri", "jerri", "Hai namaku Jerri");
        User user3 = new User("User3", "Putu", "putu", "Hai namaku Putu");
        User user4 = new User("User4", "Riken", "riken", "Hai namaku Riken");
        
        user1.getPost().add(new Feed("Post1", ContentState.SHOWED, LocalDateTime.of(2023, 1, 1, 10, 0, 0), ContentType.PICTURE, "Caption 1", 100));
        user1.getPost().add(new Reel("Post2", ContentState.SHOWED, LocalDateTime.of(2023, 1, 2, 11, 0, 0), ContentType.VIDEO, 30, 500));
        user2.getPost().add(new Feed("Post3", ContentState.SHOWED, LocalDateTime.of(2023, 1, 3, 12, 0, 0), ContentType.PICTURE, "Caption 2", 200));
        user3.getPost().add(new Story("Post4", ContentState.SHOWED, LocalDateTime.of(2023, 1, 4, 13, 0, 0), ContentType.PICTURE, 15, 1000));

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }
}
