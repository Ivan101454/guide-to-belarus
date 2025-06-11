package by.ivan101454.web.controllers;

import by.ivan101454.common.dtos.ArticleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("web/article/{article:[0-9a-fA-F\\\\-]{36}}")
public class ArticleController {

//    @ModelAttribute
//    public ArticleDto getArticleDto(@PathVariable UUID article, Model model) {
//
//        return new ArticleDto(article);
//    }

    @GetMapping()
    public String getTestArticle() {
        return "catalogue/articles/zerno";
    }

//    @GetMapping()
//    public String getArticle() {
//        return "catalogue/articles/zoo-part-1";
//    }

    @GetMapping("/edit")
    public String editArticleEditPage(Model model) {
        return "catalogue/articles/edit";
    }

    @PostMapping("/edit")
    public String updateArticle(@ModelAttribute("article") ArticleDto articleDto) {
        return "catalogue/articles/edit";
    }

    @PostMapping("/delete")
    public String deleteArticle(@ModelAttribute("article") ArticleDto articleDto) {
        return "redirect:/index";
    }


}
