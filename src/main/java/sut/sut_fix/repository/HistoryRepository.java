package sut.sut_fix.repository;
import sut.sut_fix.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
@EnableJpaRepositories
@CrossOrigin(origins = "https://fixsut2019.firebaseapp.com")
@RepositoryRestResource
public interface HistoryRepository extends JpaRepository<History, Long> {
    History findByHistoryId(Long historyId);
}