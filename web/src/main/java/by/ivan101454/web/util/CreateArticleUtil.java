package by.ivan101454.web.util;

import by.ivan101454.common.dtos.ArticleDto;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@UtilityClass
public class CreateArticleUtil {

    public List<ArticleDto> articles() {
        List<ArticleDto> articles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            articles.add(new ArticleDto(UUID.randomUUID(), "news" + i, null, null, null, null, null));
        }
        return articles;
    }
}
