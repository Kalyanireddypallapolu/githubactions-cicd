package com.kalyani.moviecatalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @GetMapping("/{userId}")
    List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId){
      return Collections.singletonList(new CatalogItem("Ji Bhim","Fights for Tribal People rules",5));
    }
}
    /*git init
    git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/Kalyanireddypallapolu/githubactions-cicd.git
        git push -u origin main*/
