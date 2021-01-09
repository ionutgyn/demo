package com.example.demo.data

import com.example.demo.entity.Article

class ArticleData {

    static Article anArticle(Map overrides = [:]) {
        Map values = [id: 1, name: "name", category: 'category', price: 100, imagePath: "", discount: -20, isNew: false]
        values << overrides

        new Article(values)
    }
}
