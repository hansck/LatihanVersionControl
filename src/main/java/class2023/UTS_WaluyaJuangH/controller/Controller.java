package class2023.UTS_WaluyaJuangH.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import class2023.UTS_WaluyaJuangH.model.*;

public class Controller {
    private ArrayList<Post> posts;

    public Controller() {
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void showUserPosts() {
        ArrayList<Post> pinnedPosts = new ArrayList<>();
        ArrayList<Post> showedPosts = new ArrayList<>();
        ArrayList<Post> archivedPosts = new ArrayList<>();
        ArrayList<Post> deletedPosts = new ArrayList<>();

        for (Post post : posts) {
            if (post.getStatus() == ContentStateEnum.PINNED) {
                pinnedPosts.add(post);
            } else if (post.getStatus() == ContentStateEnum.SHOWED) {
                showedPosts.add(post);
            } else if (post.getStatus() == ContentStateEnum.ARCHIVED) {
                archivedPosts.add(post);
            } else if (post.getStatus() == ContentStateEnum.DELETED) {
                deletedPosts.add(post);
            }
        }

        Collections.sort(showedPosts, new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return o2.getTimeUpload().compareTo(o1.getTimeUpload());
            }
        });

        Collections.sort(archivedPosts, new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return o2.getTimeUpload().compareTo(o1.getTimeUpload());
            }
        });

        System.out.println("Pinned Posts:");
        for (Post post : pinnedPosts) {
            System.out.println(post.toString());
        }

        for (int i = 12; i >= 1; i--) {
            ArrayList<Post> monthPosts = new ArrayList<>();
            for (Post post : showedPosts) {
                if (post.getTimeUpload().getMonthValue() == i) {
                    monthPosts.add(post);
                }
            }

            if (!monthPosts.isEmpty()) {
                System.out.println("Month " + i + ":");
                for (Post post : monthPosts) {
                    System.out.println(post.toString());
                }
            }
        }

        System.out.println("Showed Posts:");
        for (Post post : showedPosts) {
            if (post.getStatus() == ContentStateEnum.SHOWED) {
                System.out.println(post.toString());
            }
        }

        System.out.println("Archived Posts:");
        for (Post post : archivedPosts) {
            System.out.println(post.toString());
        }

        System.out.println("Deleted Posts: " + deletedPosts.size());
    }

    public void showPost(int postId) {
        for (Post post : posts) {
            if (post.getPostID().equals(postId)) {
                System.out.println(post.toString());
                return;
            }
        }

        System.out.println("Post not found.");
    }

    public void changePostState(int postId, ContentStateEnum newStatus) {
        for (Post post : posts) {
            if (post.getPostID().equals(postId)) {
                if (post.getStatus() == ContentStateEnum.SHOWED && newStatus == ContentStateEnum.PINNED) {
                    int pinnedCount = 0;
                    for (Post pinnedPost : posts) {
                        if (pinnedPost.getStatus() == ContentStateEnum.PINNED) {
                            pinnedCount++;
                        }
                    }

                    if (pinnedCount >= 3) {
                        System.out.println("Cannot pin more than 3 posts.");
                        return;
                    }
                }

                if (post.getStatus() == ContentStateEnum.ARCHIVED && newStatus == ContentStateEnum.DELETED) {
                    System.out.println("Cannot delete archived post.");
                    return;
                }

                if (post.getStatus() == ContentStateEnum.PINNED && newStatus != ContentStateEnum.SHOWED) {
                    System.out.println("Cannot unpin post.");
                    return;
                }

                post.setStatus(newStatus);
                System.out.println("Post status changed.");
                return;
            }
        }

        System.out.println("Post not found.");
    }

    public void showUserBestPost() {
        Post bestFeedPost = null;
        Post bestStoryPost = null;
        Post bestReelPost = null;

        for (Post post : posts) {
            if (post.getPostType() == ContentTypeEnum.PICTURE) {
                if (bestFeedPost == null || post.getLikes() > bestFeedPost.getLikes()) {
                    bestFeedPost = post;
                }
            } else if (post.getPostType() == ContentTypeEnum.VIDEO) {
                if (bestReelPost == null || post.getPlayedCount() > bestReelPost.getPlayedCount()) {
                    bestReelPost = post;
                }
            } else if (post.getPostType() == ContentTypeEnum.STORY) {
                if (bestStoryPost == null || post.getViews() > bestStoryPost.getViews()) {
                    bestStoryPost = post;
                }
            }
        }

        if (bestFeedPost != null) {
            System.out.println("Best Feed Post:");
            System.out.println(bestFeedPost.toString());
        }

        if (bestStoryPost != null) {
            System.out.println("Best Story Post:");
            System.out.println(bestStoryPost.toString());
        }

        if (bestReelPost != null) {
            System.out.println("Best Reel Post:");
            System.out.println(bestReelPost.toString());
        }
    }
}
