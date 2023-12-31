package SocialMediaAnalyzer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class SocialMediaAnalyzer {
    private List<Post> posts; // list of all data of CSV file

    /// constructor - initializing a list
    public SocialMediaAnalyzer() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post); // add one to posts list
    }

    public void addAllPosts(List<Post> newPosts) {
        posts.addAll(newPosts); // add a list of posts
    }

    public boolean removePost(int postId) {
        boolean postDeleted = posts.removeIf(post -> post.getId() == postId); // remove posts by ID
        return postDeleted;
    }

    public Post retrievePost(int postId) { // Retrieve post by ID
        for (Post post : posts) {
            if (post.getId() == postId) { // check if post if found then returns post data, otherwise returns null
                return post;
            }
        }
        return null; // return null if post id not found
    }
    /// This function returns top N posts by likes 
    public List<Post> getTopNPostsByLikes(int n) {
        if (n < 0) { // Exception to check the entered value is valid
            throw new IllegalArgumentException("n must be a non-negative value.");
        }
        List<Post> sortedPosts = new ArrayList<>(posts); // create a list of posts
        sortedPosts.sort(Comparator.comparingInt(Post::getLikes).reversed()); // sort by Likes - read each post's likes count and sort them, before that set comparing to Integer
        int numPostsToReturn = Math.min(n, sortedPosts.size());
        return sortedPosts.subList(0, numPostsToReturn); // returns the first index of sorted array
    }

    /// This function returns top N posts by shares
    public List<Post> getTopNPostsByShares(int n) {
        if (n < 0) { // Exception to check the entered value is valid
            throw new IllegalArgumentException("n must be a non-negative value.");
        }
        List<Post> sortedPosts = new ArrayList<>(posts);
        sortedPosts.sort(Comparator.comparingInt(Post::getShares).reversed()); // sort by Shares - read each post's likes count and sort them, before that set comparing to Integer
        int numPostsToReturn = Math.min(n, sortedPosts.size());
        return sortedPosts.subList(0, numPostsToReturn); // returns the first index of sorted array
    }


    public List<Post> getAllPosts() {
        return new ArrayList<>(posts); // returns the list of posts
    }
}