package br.com.exemplo.feing.service;

import br.com.exemplo.feing.model.Pull;
import br.com.exemplo.feing.model.Repositories;
import lombok.NonNull;

import java.util.Set;

public interface GitHubService {

    Repositories getRepositories(int page);
    Set<Pull> getPulls(@NonNull String login, @NonNull String repo);

}
