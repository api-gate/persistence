package mx.com.ag.persistence.api.model;


import mx.com.ag.lib.utils.OverrideMethods;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alex79L
 */
@Entity
@Table(name = "APP_ENTITY")
public class AppEntity {

    private OverrideMethods<AppEntity> overrides;

    @Id
    private long id;
    private String name;

    public AppEntity() {
        super();
        overrides = new OverrideMethods<>(this)
                .with(o -> o.id)
                .with(o -> o.name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return overrides.toString();
    }

    @Override
    public boolean equals(Object o) {
        return overrides.equals(o);
    }

    @Override
    public int hashCode() {
        return overrides.hashCode();
    }
}
