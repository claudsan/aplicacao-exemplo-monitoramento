package br.com.exemplo.feing.controller;

import br.com.exemplo.feing.model.Pull;
import br.com.exemplo.feing.model.Repositories;
import br.com.exemplo.feing.service.GitHubService;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Timed
@RestController
public class GitHubController {


    private GitHubService service;


    public GitHubController(GitHubService service) {
        this.service = service;
    }

    @GetMapping(value = "/repos")
    public Repositories getRepositories(@RequestParam(required = true, defaultValue = "1") int page){
        return service.getRepositories(page);
    }

    @GetMapping(value = "/pulls/{login}/{repoName}")
    public Set<Pull> getPulls(@RequestParam(required = true) String login, @RequestParam(required = true) String repoName){
        return service.getPulls(login, repoName);
    }
}
