package mx.com.ag.persistence.api.repository.spring;

import mx.com.ag.persistence.api.model.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alex79L
 */
public interface AppRepository extends JpaRepository<AppEntity, Long> {

    AppEntity findAllBy();
}
