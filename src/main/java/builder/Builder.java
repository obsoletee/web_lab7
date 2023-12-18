package builder;

import org.eclipse.aether.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException, exception.RepositoryException;
}

