package mx.com.ag.persistence.api.repository.jee;

import mx.com.ag.persistence.api.model.AppEntity;
import mx.com.ag.persistence.api.repository.spring.AppRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Alex79L
 */
@Stateless
public class AppJeeRepository {

    @PersistenceContext(unitName = "api-gateway-persistence")
    private EntityManager entityManager;

    private AppRepository appRepository;

    @PostConstruct
    public void init() {
        RepositoryFactorySupport factory = new JpaRepositoryFactory(entityManager);
        this.appRepository = factory.getRepository(AppRepository.class);
    }

    public AppEntity findAll() {
        return appRepository.findAllBy();
    }
}
