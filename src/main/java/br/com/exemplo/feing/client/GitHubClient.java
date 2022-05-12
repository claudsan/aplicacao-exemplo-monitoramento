package br.com.exemplo.feing.client;

import br.com.exemplo.feing.model.Pull;
import br.com.exemplo.feing.model.Repositories;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@FeignClient(value = "github", url = "https://api.github.com/")
public interface GitHubClient {

    @RequestMapping(method = RequestMethod.GET, value = "search/repositories?q=language:Java&sort=starts&page={page}")
    Repositories getRepositories(@PathVariable("page") int page);

    @RequestMapping(method = RequestMethod.GET, value = "/repos/{login}/{repo}/pulls", produces = "application/json")
    Set<Pull> getPulls(@PathVariable("login") String login, @PathVariable("repo") String repo);
}
