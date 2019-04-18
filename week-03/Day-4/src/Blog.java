import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> newBlog;

  public Blog() {
    this.newBlog = new ArrayList<>();
  }

  public void addBlogPost() {
    this.newBlog.add(new BlogPost());
  }

  public void deleteBlogPost(int i) {
    if (i < this.newBlog.size()) {
      this.newBlog.remove(i);
    } else {
      System.out.println("no such index");
    }
  }

  public void update(int i, BlogPost post) {
    if (i < this.newBlog.size()) {
      this.newBlog.set(i, post);
    } else {
      System.out.println("no such index");
    }
  }
}
