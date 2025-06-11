package by.ivan101454.common.dtos;

import by.ivan101454.common.enums.Category;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represent article on web page
 * @param id - unique identifier for the article
 * @param title - name of the article
 * @param description - preview text
 * @param category - category the article belongs to (e.g. FOOD, CULTURE)
 * @param templatePath - path to html template on the disk
 * @param imagePath - path to preview image on the disk
 * @param published - date the article was published
 */
public record ArticleDto(
        UUID id, String title, String description, Category category, String templatePath, String imagePath,
        LocalDateTime published) {
}
