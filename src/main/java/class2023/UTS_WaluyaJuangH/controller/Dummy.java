import class2023.UTS_WaluyaJuangH.model.*;

public class Dummy {

    public static void main(String[] args) {
        
        User user1 = new User("user1", "Alice", "password1", "Bio Alice");
        User user2 = new User("user2", "Bob", "password2", "Bio Bob");

        
        Comment comment1 = new Comment("comment1", "Hello, Alice!", ContentStateEnum.SHOWED);
        Comment comment2 = new Comment("comment2", "Hi, Bob!", ContentStateEnum.SHOWED);

        
        Post post1 = new Feed("First post by Alice", ContentTypeEnum.PICTURE, ContentStateEnum.SHOWED);
        post1.getComments().add(comment1);
        user1.addPost(post1);

        Post post2 = new Reel("Cool video by Bob", ContentTypeEnum.VIDEO, ContentStateEnum.PINNED, 120, 50);
        post2.getComments().add(comment2);
        user2.addPost(post2);

        
        System.out.println("Dummy User Data:");
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        System.out.println("\nDummy Post Data:");
        System.out.println(post1.toString());
        System.out.println(post2.toString());

        System.out.println("\nDummy Comment Data:");
        System.out.println(comment1.toString());
        System.out.println(comment2.toString());
    }
}
