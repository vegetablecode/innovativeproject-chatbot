package nokia.wroclaw.innovativeproject.chatbot.repository;

import nokia.wroclaw.innovativeproject.chatbot.domain.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {

    @Override
    Iterable<Request> findAll();

}
