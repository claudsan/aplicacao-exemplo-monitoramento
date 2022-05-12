package br.com.exemplo.feing.service;

import br.com.exemplo.feing.client.GitHubClient;
import br.com.exemplo.feing.exceptions.LimiteRegistrosExedido;
import br.com.exemplo.feing.model.Pull;
import br.com.exemplo.feing.model.Repositories;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GitHubServiceImpl implements GitHubService{

    public final GitHubClient gitHub;

    public GitHubServiceImpl(GitHubClient gitHub) {
        this.gitHub = gitHub;
    }

    @Override
    public Repositories getRepositories(int page){
        if(page > 34)
            throw new LimiteRegistrosExedido("Página excede o limite do GitHub");

        return gitHub.getRepositories(page);
    }

    @Override
    public Set<Pull> getPulls(@NonNull String login, @NonNull String repo){
        return gitHub.getPulls(login, repo);
    }
}
