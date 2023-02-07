package med.sis.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    //@Query("Select * from medico where Ativo = true")
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
