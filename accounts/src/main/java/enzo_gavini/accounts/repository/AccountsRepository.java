package enzo_gavini.accounts.repository;

import enzo_gavini.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);

    Accounts getByCustomerId(int customerId);
}
