package by.ivan101454.web.controllers;

import by.ivan101454.common.dtos.ArticleDto;
import by.ivan101454.common.enums.Category;
import by.ivan101454.web.util.CreateArticleUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/web/articles")
public class ArticlesController {

    @ModelAttribute("category")
    public void addCategory(Model model) {
        model.addAttribute("categories", Category.values());
    }

    @GetMapping
    public String getArticlesList(Model model) {
        List<ArticleDto> list = CreateArticleUtil.articles();
        model.addAttribute("list", list);
        return "catalogue/articles/index";
    }

    @GetMapping("/create")
    public String createArticle() {
        return "catalogue/create/create-page";
    }

    @PostMapping("/create")
    public String createArticle(@ModelAttribute("article") ArticleDto articleDto) {
        System.out.println(articleDto);
        return "redirect:/web/articles";
    }
}
