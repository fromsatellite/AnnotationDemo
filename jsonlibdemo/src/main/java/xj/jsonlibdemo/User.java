package xj.jsonlibdemo;

import com.example.Seriable;

import java.util.List;

public class User {
    @Seriable()
    String name;
    @Seriable()
    String area;
    @Seriable()
    int age;
    int weight;

    @Seriable()
    List<Article> mArticleList;
}
